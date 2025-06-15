package thread;

import java.util.Timer;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            System.out.printf("[%s] : %d\n", this.getName(), i);

            try {
                Thread.sleep(1); // 1초 쉬어라~!
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
