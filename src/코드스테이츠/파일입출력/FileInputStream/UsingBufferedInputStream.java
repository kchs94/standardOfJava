package 코드스테이츠.파일입출력.FileInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class UsingBufferedInputStream {
  public static void main(String[] args) {
    try {
      FileInputStream fileInput = new FileInputStream("codestate.txt");
      BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

      int i = 0;
      while((i = bufferedInput.read()) != -1) {
        System.out.print((char)i);
      }
      fileInput.close();
    }
    catch (Exception e) {
      System.out.print(e);
    }
  }
}
