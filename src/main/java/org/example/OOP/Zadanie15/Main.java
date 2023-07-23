package org.example.OOP.Zadanie15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aga Chomik", 6));
        students.add(new Student("Ala Kwiatek", 5));
        students.add(new Student("Marek Jurek", 4));
        students.add(new Student("Ela Mąka", 6));
        students.add(new Student("Maciek Kot", 3));


        System.out.println("Wszyscy studenci: ");
        displayStudents(students);
        double avarageGrage = calculateAvarage(students);
        System.out.println("Średnia wszystkich ocen studentów: " + avarageGrage);
    }

    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Imię studenta: " + student.getName() + "Ocena: " + student.getGrade());
        }
    }

    public static double calculateAvarage(ArrayList<Student> students) {
        if (students.size() == 0) {
            return 0.0;
        }
        double sum =0.0;
        for(Student student: students){
            sum+=student.getGrade();
        }
        return sum/students.size();
    }
}

