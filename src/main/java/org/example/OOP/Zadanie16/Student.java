package org.example.OOP.Zadanie16;

public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Moja ocena : " + grade);
    }
}
