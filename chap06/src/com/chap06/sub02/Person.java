package com.chap06.sub02;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    void introduce() {
        System.out.println("나는 사람임: " + name);
    }
}

class Student extends Person {
    int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    void introduce() {
        super.introduce();
        System.out.println("학생 번호: " + id);
    }
}
