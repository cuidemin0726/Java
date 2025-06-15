package ztest.abs;

public class Restaurant {
    public static void main(String[] args) {

        Pastareceipt ps = new Pastareceipt("최덕민");
        ps.info();

        // 추상화 클래스는 생성자를 통한 객체 선언이 안됨
//        Receipt res = new Receipt("하하");
    }
}
