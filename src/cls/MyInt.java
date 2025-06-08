package cls;
// MyInt 라는 이름의 클래스를 만들도
// 속성(필드)로 Int n 을 완전 비공개 맴버로 저의하세요
// 기본 생성자를 만들고 데이터 n 으로 초기화 하세요
// 추가 생성자를 만들고 매기변수 n을 받아서 속성 n 을 매개변수 n으로 초기화 하세요
public class MyInt {

    private int n;

    public MyInt(){ // 기본생성
        n = 0;
    }

    public MyInt(int n){// 추가 생성자
        this.n = n;
    }

    //필드 n을 외부부터 입력받아서 설정하는 setter 메소드를 정의 하세요
    public void setN(int n){
        this.n = n;
    }

    // 필드 n 을 외부로 제공하는 get 메소드를 정의 하세요
    public int getN(){
        return n;
    }

    // toString: 재정의하는 메소드
    @Override
    public String toString() {
        return String.format("%d", n);
    }

    //equals 메소드 재정의

    @Override
    public boolean equals(Object obj) {
        // 주체와 비교대상(OBj) 의 클래스가 동일한지 체크
        if(!(obj instanceof MyInt ))
            return false;
        // 주체의 필드 n과 비교대상(obj) dml 필드 n이 동일한지 검사하고, 같으면 true, 다르면 fals를 반환하도락 한다.
        MyInt target = (MyInt) obj;

        return n == target.n;
    }

}
