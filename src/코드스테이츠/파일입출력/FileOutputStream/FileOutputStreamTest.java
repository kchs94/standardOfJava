package 코드스테이츠.파일입출력.FileOutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamTest {
  public static void main(String[] args) {
    try {
      FileOutputStream fileOutput = new FileOutputStream("codestate.txt");
      String word = "code";

      byte[] b = word.getBytes();
      fileOutput.write(b);
      fileOutput.close();
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
