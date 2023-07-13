package org.example.OOP.Inheritance;

public class Cat extends Animal {
    private int numberOfMiceCaught;

    public Cat(String name, int age, int numberOfMiceCaught){
        super(name, age);
        this.numberOfMiceCaught = numberOfMiceCaught;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " is meowing");
    }

}
