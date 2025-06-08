package cls;
// 사용자 ID(문자열)과 비밀번호(문자열)를 필로드 같는 class MyAccount 클래스를 정의하고
// 기본 생성자에서는 ID = "" , 비밀번호 = "" 로 정의하고
// 추가 생성자에서는 아이디와 비밀번호를 매개변수로 입력받아 필드에 대입하도록 저의하십시오
public class MyAccount {

    private String id; // 사용자 아이디(문자열) 정의
    private String password; // 사용자 비밀번호(문자열) 정의

    public MyAccount(){
        id = "";
        password = "";
    }
    public MyAccount(String id, String pw){
        this.id = id;
        this.password = pw;
    }

    //id, password필드에 대해서 각각 setter, getter를 정의하세요
    public void setId(String id){
        this.id = id;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }


    // toString 메소드를 재정의 하세요

    @Override
    public String toString() {
        return String.format("ID: %s\nPASSWORD: %s", id, password);
    }


    // equals 메소드를 재저으이 하여 id, passwordrk 완전히 동일하면 true, ekfmaus falase반환하도록 정의하세요
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MyAccount))
            return false;

        MyAccount target = (MyAccount)obj;

        return id.equals(target.getId())
                && password.equals(target.getId());
    }
}
