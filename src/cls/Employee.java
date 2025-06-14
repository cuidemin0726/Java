package cls;
// 직원(Employee) 클래스
// Person 클래스로부터 상속받아서 만듬
// 회사명(str), 직급(str), 부서(str) 를 추가 필드로 정의하세요
// 각각의 필드에 대해서 setter, getter를 정의하세요
// introduce 메소드를 재정의(override)하여 이름, 회사, 부서, 직급순으로 출력되도록 정의하세요
public class Employee extends Person {

    private String company; // 회사
    private String position; // 직급
    private String department; // 부서

    public  Employee(){
        super();
        this.company = "";
        this.position = "";
        this.department = "";
    }
    public Employee(String name, int age, String gender, String company, String position, String department) {
        super(name,age);
        super.setGender(gender);
        this.company = company;
        this.position = position;
        this.department = department;
    }
    // 각 필드에  setter, getter를 정의 함
    public void setCompany(String company){
        this.company = company;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getCompany(){
        return company;
    }
    public String getPosition(){
        return position;
    }
    public String getDepartment(){
        return department;
    }

    // introduce 메소드를 사용하여 순차적으로 출력 되도록 함
    @Override
    public void introduce(){
        System.out.printf("이름: %s / 회사: %s / 부서: %s / 직급: %s\n", getName(), company, department, position);
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %d, 성별: %s, 회사: %s, 부서: %s, 직급: %s",
                getName(), getAge(), getGender(), company, department, position);
    }
}

// 문의1
// super(name); name 1개반 가져올수 없는지?
// 문의2
//