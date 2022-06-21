package 코드스테이츠.파일입출력.File;

import java.io.File;

public class FileExample2 {
  public static void main(String[] args) {
    File parentDir = new File("./");
    File[] list = parentDir.listFiles();

    String prefix = "code";
    for (int i=0; i<list.length; i++) {
      String fileName = list[i].getName();

      if (fileName.endsWith("txt") && !fileName.startsWith("code")) {
        list[i].renameTo(new File(parentDir, prefix + fileName));
      }
    }
  }
}
