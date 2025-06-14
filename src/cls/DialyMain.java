package cls;

public class DialyMain {
    public static void main(String[] args) {
        Diary d1 = new Diary("a", "b", "c");
        Diary d2 = new Diary("a", "b", "c");

        System.out.println(d1);

        if(d1.equals(d2))
            System.out.println("d1 과 d2는 동일합니다~!");
        else
            System.out.println("d1 과 d2는 다릅니다~!");
    }


}
