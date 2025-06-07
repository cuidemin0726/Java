package cls;

public class MyStackEx extends MyStack{
    public MyStackEx(){
        super();// MyStack 디폴트 생성자를 호출
    }

    public MyStackEx(int count){
        super(count);// MyStack(int count) <==== 이러한 생성자를 호출 해줌
    }

    // 기능 추가
    public boolean isAddPossible(){
        return getCount() > getPosition();
    }

}
