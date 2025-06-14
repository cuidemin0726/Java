package cls;

public class DeonpaMain {
    public static void main(String[] args) {
        Deonpa d1 = new Deonpa("cdm", "검사", "공격", 300, 200);
        Deonpa d2 = new Deonpa("cdm", "검사", "공격", 300, 200);

        System.out.println(d1);

        if(d1.equals(d2))
            System.out.println("d1 과 d2는 동일합니다~!");
        else
            System.out.println("d1 과 d2는 다릅니다~!");
    }
}
// 왜서 다릅니다 결과 나오는지