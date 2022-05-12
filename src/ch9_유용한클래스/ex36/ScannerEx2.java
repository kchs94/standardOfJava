package ch9_유용한클래스.ex36;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerEx2 {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new File("/Users/kchs94/Project/standardOfJava/src/ch9_유용한클래스/ex36/test.txt"));
    int sum = 0;
    int count = 0;

    while(in.hasNextInt()) {
      sum += in.nextInt();
      count++;
    }
    System.out.println("sum = " + sum);
    System.out.println("count = " + count);
  }
}
