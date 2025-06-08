package cls;

public class Student extends Person {
    private String school;
    private int grade;

    // 생성자 : 이름, 나이, 성별, 학교
    // grade 는 무조건 1로 설정
    public Student(String name, int age, String gender, String school) {
        super(name, age);// Person에 생성자를 이용
        super.setGender(gender); // Person에 구현해 놓은 setGender 메소드를 이용하여 설정

        this.school = school;
        grade = 1;

    }

    @Override // 해당 메소드를 재정리하는 의미, 메소드 오버라이드
    public void introduce() {
        super.introduce(); // 부모 클래스(Person)에서 정의된 introduce() 메소드를 호출
        System.out.printf("학교는 %s에 다니고 있습니다\n", school);
    }

    //   Object Class의 equals 메소드를 생성함
    @Override
    public boolean equals(Object obj) {
        // obj 매개변수는 Student 클래스로부터 생성된 인스턴스인지 먼저 검사 필요
        if (!(obj instanceof Student))
            return false;

        Student target = (Student) obj; // 형변환 Object -> Student

        return getName().equals(target.getName())
                && getAge() == target.getAge()
                && getGender().equals(target.getGender())
                && school.equals(target.school)
                && grade == target.grade;

    }
}

// 숙제 1
// 제목(str), 날짜(str), 내용(str) 클래스 작성 숙제

// 숙제2
// 이름(str), 직업(str), 스킬(str), HP(int), MP(int) 클랙스 작성 숙제

// 숙제3
// 직원(Employee) 클래스
// Person 클래스로부터 상속받아서 만듬
// 회사명(str), 직급(str), 부서(str) 를 추갛하 필드로 정의하세요
//각각의 필드에 대해서 setter, getter를 정의하세요
// introduce 메소드를 재정의(override)하여 이름, 회사, 부서, 직급순으로 출력되도록 정의하세요

