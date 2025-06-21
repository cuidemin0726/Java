package thread;

public class MyRunThread implements Runnable{

    public String name;
    public MyRunThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            System.out.printf("[%s] : %d\n", this.name, i);

            try {
                Thread.sleep(1); // 1초 쉬어라~!
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
