package ch9_유용한클래스.ex37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx3 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File("/Users/kchs94/Project/standardOfJava/src/ch9_유용한클래스/ex37/test.txt"));
    int count = 0;
    int totalSum = 0;

    while (in.hasNextInt()) {
      String line = in.nextLine();
      Scanner in2 = new Scanner(line).useDelimiter(",");
      int sum = 0;

      while (in2.hasNextInt()) {
        sum += in2.nextInt();
      }
      System.out.println("line: " + line + ", sum: " + sum);
      totalSum += sum;
      count++;
    }
    System.out.println("line: " + count + ", Total: " + totalSum);
  }
}
