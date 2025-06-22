package generic;

//LIFO(Last In First Out)
public class MyStack <T> {
    private T [] arr;
    private int pos; // Indexing 하는 필드라서 바꾸지 않음

    public MyStack(int cap){
        this.arr = (T[]) new Object[cap];
        this.pos = 0;

    }

    public void add(T n){
        if(pos < arr.length){
            arr[pos++] = n;
        }else  {
            throw new ArrayIndexOutOfBoundsException("용량 초과 함~!");
        }
    }

    public int getPos(){
        return pos;
    }

    public T pop(){
        if(pos > 0){
            return arr[--pos];
        }else {
            throw new ArrayIndexOutOfBoundsException("잘못된 인덱싱");
        }

    }

}
