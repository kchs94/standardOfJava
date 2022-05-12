package ch7_OOP2.연습문제.ex10;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MAIN_CHANNEL = 1;

    public boolean getIsPowerOn() {
        return isPowerOn;
    }
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}

public class ex7_10 {
    public static void main(String[] args) {

        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: " + t.getVolume());
    }
}
