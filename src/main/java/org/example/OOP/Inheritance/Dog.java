package org.example.OOP.Inheritance;

public class Dog extends Animal{

    private int numberOfEatenSlippers;

    public Dog(String name, int age, int numberOfEatenSlippers){
        super(name, age);
        this.numberOfEatenSlippers = numberOfEatenSlippers;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " is barking.");
    }
}
