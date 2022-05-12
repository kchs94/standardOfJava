package ch9_유용한클래스.ex35;

import java.util.Locale;
import java.util.Scanner;

public class ScannerEx1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      System.out.print(">>");

      // 화면으로부터 줄단위로 입력받는다.
      String input = in.nextLine();

      input = input.trim(); // 입력받은 문자열에서 불필요한 앞뒤 공백을 제거합니다.
      String[] words = input.split(" +"); // 공백 한 개 이상을 구분자로 한다.

      String command = words[0].trim();

      // 명령어를 소문자로 바꾼다.
      command = command.toLowerCase();

      // q 또는 Q를 입력하면 실행을 종료한다.
      if (command.equals("q")) System.exit(0);
      else
        for (int i=0; i<words.length; i++) {
          System.out.println(words[i]);
        }
    }
  }
}
