package 코드스테이츠.파일입출력.FileInputStream;

import java.io.FileInputStream;

public class InputStream {
  public static void main(String[] args) {
    try {
      FileInputStream fileInput = new FileInputStream("codestate.txt");
      int i = 0;
      while((i = fileInput.read()) != -1) {
        System.out.println((char)i);
      }
      fileInput.close();
    }
    catch (Exception e) {
      System.out.print(e);
    }
  }
}
