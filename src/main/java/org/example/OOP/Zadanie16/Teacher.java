package org.example.OOP.Zadanie16;

public class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject){
        super(name,age);
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
    public void introduce(){
        super.introduce();
        System.out.println("Mój przedmiot : " + subject);
    }
}
