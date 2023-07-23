package org.example.OOP.Zadanie16;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Teacher("Mr. Johnson", 45, "Mathematics"));
        people.add(new Student("Alice", 18, 85));

        for (Person person : people) {
            person.introduce();
        }

    }

}
