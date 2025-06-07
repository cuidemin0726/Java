package cls;

import java.util.Arrays;

public class MyStack {
    private int [] arr;
    private int count; // 배열의 길이(아이템 개수) 저장하는 속성
    private int position;



    public MyStack(){
        arr = new int[5];
        count = 5;
        position = 0;
    }

    // Int count 를 매개변수로 받는 추가 생성자를 만드세요
    // arr 배열은 count 만큼의 길이르 갖도록 코드를 작성하세요

    public MyStack(int count){
        arr = new int [count];
        // 필드 카운트를 매개변수 카운트로 설정
        this.count = count;
        position =0;
    }


    public int getCount() {
        return count;
    }

    //add 데이터 추가 메소드
    public void add(int value){
        if(position > count-1){
            System.out.println("더이상 데이터를 추가 할수 없습니다~!");
            return;
        }

        arr[position++] = value;// arr의 position 위치에 value를 대입하고, position 을 1 증가 시킴

    }

    // pop 이름으로 메소드 만드는데 가장 마지막에 있는 데이터를 외부로 반환해주는 메소드(정상적인 구현 아님)
    public int pop(){
        if(position == 0) {
            System.out.println("값을 가져갈수 없습니다~!");
            return 0;
        }
        return arr[--position];
    }

    public String toString(){
        return Arrays.toString(arr);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
