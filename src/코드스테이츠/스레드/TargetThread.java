package 코드스테이츠.스레드;

public class TargetThread extends Thread {
  public void run() {
    for (long i = 0; i<1_000_000_000; i++) {}
    try {
      Thread.sleep(1500);
    } catch (Exception e){}
    for (long i=0; i<1_000_000_000; i++){}
  }
}
