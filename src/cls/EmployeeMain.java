package cls;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee n1 = new Employee("홍길동", 35,"남자", "OpenAI", "개발자", "연구개발팀");

        n1.introduce();
        System.out.println(n1);

    }
}
