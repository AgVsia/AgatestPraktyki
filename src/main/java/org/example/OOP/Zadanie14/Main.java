package org.example.OOP.Zadanie14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
