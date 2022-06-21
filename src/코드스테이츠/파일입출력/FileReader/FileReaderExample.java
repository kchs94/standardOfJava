package 코드스테이츠.파일입출력.FileReader;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderExample {
  public static void main(String[] args) {
    try {
      String fileName = "codestates.txt";
      FileInputStream reader = new FileInputStream(fileName);

      int data = 0;

      while((data = reader.read()) != -1) {
        System.out.print((char)data);
      }
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
