package clsex;

public class PeopleTester {
    public static void main(String[] args) {

//      People p1 = new People();// 추상 클랙스 바로 가져다 사용 불가

//        int[] arr = new int[3];
        People[] myArr = new People[3]; // 배열만 만들지 생성자 추가하는것 아님

        myArr[0] = new American();
        myArr[1] = new Korean();
        myArr[2] = new Japanese();
//
//        for(Object obj : myArr){
//            People p = (People) obj;
//            p.say();
//        }
//        American a1 = new American();
//        Korean k1 = new Korean();
//        Japanese j1 = new Japanese();

//        a1.say();
//        k1.say();
//        j1.say();


    }
}
