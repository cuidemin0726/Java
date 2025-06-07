package test.Inter;


public interface Phone {

    public static final int MAX_BATTERY_CAPACITY = 100;

    public abstract void powerOn();
    void powerOff();
    boolean isOn();
    void watchYoutube();
    void charge();

}
