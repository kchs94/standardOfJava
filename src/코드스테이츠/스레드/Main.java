package 코드스테이츠.스레드;

public class Main {
  public static void main(String[] args) {
    StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
    statePrintThread.start();
  }
}
