package com.chap06.sub02;

public class TypeCheckMain {

    public static void main(String[] args) {
        Person person = new Person("김오늘");
        Student student = new Student("이내일", 20141130);

        if (person instanceof Person) {
            System.out.println("person은 Person클래스의 인스턴스이다.");
        }
        if (student instanceof Person) {
            System.out.println("학생! 너 사람이구나.. \n"
                + "student는 Person클래스의 인스턴스이다.(Person클래스를 상속받은 상속관계에 있다)");
        }
        if (person instanceof Student) {
            Student castedStudent = (Student) person;
            castedStudent.introduce();
        } else {
            System.out.println("사람은 학생이 되지 못했다.. \n"
                + "person은 Student로 변환이 불가하다.");
        }

        if (student instanceof Student) {
            Student castedStudent = (Student) person;
            castedStudent.introduce();
        } else {
            System.out.println("person은 Student로 변환이 불가하다.");
        }

        // 에러 발생 다시 해결
        Person p = student;
        p.introduce();

        if(p instanceof Student) {
            Student s = (Student) p;
            s.introduce();
        }
    }
}
