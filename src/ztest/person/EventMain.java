package ztest.person;


public class EventMain {

    public class Button{
        private  ButtonClickListener listener;
        public void setListener(ButtonClickListener listener){
            this.listener = listener;
        }
        public void click(){
            if(this.listener != null){
                this.listener.click();
            }
        }

    }

    public static void main(String[] args) {

        // 버튼 객체 만들기
        EventMain main = new EventMain();
        // 내부 클래스 선언
        EventMain.Button button = main.new Button();

        ButtonClickListener listener = new ButtonClickListener(){
            public void click(){
                System.out.println(" 버튼이 눌렸습니다~!");
            }

        };
        button.setListener(listener);
        button.click();
    }
}
