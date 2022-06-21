package ch11_컬렉션프레임워크.ex32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");

        printList();
    }

    private static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            Set subSet = ((HashMap)entry.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + entry.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()) {
                Map.Entry subEntry = (Map.Entry)subIt.next();
                String telNo = (String) subEntry.getKey();
                String name = (String) subEntry.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }

    private static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    private static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }

    private static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }
}
