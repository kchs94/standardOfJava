package ch11_컬렉션프레임워크.ex1;

import java.util.ArrayList;
import java.util.List;
/*
* List subList(int formIndex, int toIndex): 해당 인덱스 범위에 해당하는 객체들을 List로 반환한다.
* boolean containsAll(List c): 호출한 List가 c를 포함한다면 참
* void add(int index, Object element): 해당 인덱스에 객체를 저장
* Object set(int index, Object element): 해당 인덱스의 객체를 수정한다.
* boolean retainAll(Collection c): ArrayList에 저장된 객체중에서 주어진 컬렉션과 공통된 것만 남기고
* 나머지는 삭제한다.
* 리스트의 요소를 제거하기 위해서는 안전하게 거꾸로 제거하는게 좋다.
* */
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " +
                list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2): " +
                list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i=list2.size()-1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(List list1, List list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
