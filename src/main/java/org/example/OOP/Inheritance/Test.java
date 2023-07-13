package org.example.OOP.Inheritance;

public class Test {
    public static void main(String[] args) {
        //Tworzymy obiekt klasy Pies i używamy jego metod
        Dog dog = new Dog("Burek", 2, 9);
        dog.makeSound();

        //Tworzymy obiekt klasy Kot i używamy jego metod
        Cat cat = new Cat("Filemon", 8, 0);
        cat.makeSound();

    }
}
