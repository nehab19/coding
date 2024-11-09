package guru.springframework.spring5webapp.designpattern.builder;

import java.util.List;

public class Student {
    int rollNumber;
    String name;
    int age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + this.rollNumber +
                ", name='" + this.name + '\'' +
                ", age=" + this.age +
                ", fatherName='" + this.fatherName + '\'' +
                ", motherName='" + this.motherName + '\'' +
                ", subjects=" + this.subjects +
                '}';
    }
}
