package ztest.Inter;

public class ApplePhone implements Phone{

    private int batteryCapacity = 40;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        if (batteryCapacity > 30){
            System.out.println("@@@ Power On @@@");
            isOn = true;

        }else {
            System.out.println("@@@ LowBettery On @@@");
        }

    }

    @Override
    public void powerOff() {
        System.out.println("@@@ Power Off @@@");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        if(isOn){
            return true;
        }else
            return false;

    }

    @Override
    public void watchYoutube() {
        if(batteryCapacity > 10){
            System.out.println("=== watching Youtube ===");
            batteryCapacity -= 10;
            System.out.println("Battery is " + this.batteryCapacity + "%");
        }else {
            System.out.println("=== Low Battery ===");
            powerOff();
        }

    }

    @Override
    public void charge() {
        if(this.batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
            System.out.println("=== Start Charaging ===");
           // 5% 프로 이상 차이날때는 5를 더하고 , 아니면 100에서 현재깞 뺀만큼 더하기
            if (Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity >= 5) {
                this.batteryCapacity += 5;
            } else {
                this.batteryCapacity += (Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity);
            }

        }
    }
}
