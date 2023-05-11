package org.example.OOP.Theory;

public class MyMain {
    public static void main(String[] args) {

        Human human1 = new Human();
        // tak źle - human1.age = 20;
        human1.setAge(20);
        human1.setHeight(1.6);
        human1.setFirstName("Adam");
        human1.setLastName("Nowak");

        System.out.println("Imię naszego człowieka: " + human1.getFirstName());
        System.out.println("Nazwisko naszego człowieka: " + human1.getLastName());
        System.out.println("Wiek naszego człowieka: " + human1.getAge());
        System.out.println("Wzrost naszego człowieka: " + human1.getHeight());

        Human human2 = new Human();
        human2.setAge(30);
        human2.setHeight(1.8);
        human2.setFirstName("Wacuś");
        human2.setLastName("Kowalski");

        System.out.println("Imię naszego człowieka: " + human2.getFirstName());
        System.out.println("Nazwisko naszego człowieka: " + human2.getLastName());
        System.out.println("Wiek naszego człowieka: " + human2.getAge());
        System.out.println("Wzrost naszego człowieka: " + human2.getHeight());

    }
}
