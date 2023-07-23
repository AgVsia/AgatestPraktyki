package org.example.OOP.Zadanie16;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void introduce(){
        System.out.println("Hello my name is  " + name + "and I'm " + age + "years old");
    }
}
