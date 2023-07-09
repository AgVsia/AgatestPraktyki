package org.example.OOP.Zadanie8;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"Programowanie obiektowe", "Analiza matematyczna", "Rachunek prawdopodobieństwa"};

        Student student1 = new Student("Anna", "Makowska", 123456, 2, subjects);
        Student student2 = new Student("Aga", "Rakowska", 234567, 1);

        student1.displayData();
        student2.displayData();

        System.out.println("Imię i nazwisko pierwszego studenta: " + student1.getFullName());
        System.out.println("Numer indeksu studenta 2: " + student2.getStudentIndex());
        System.out.println("Rok studiów pierwszego studenta 1: " + student1.getYearOfStudy());

        student1.increaseYearOfStudy();
        System.out.println("Nowy rok studow pierwszego studenta: " + student1.getYearOfStudy());

        student2.addSubject("Fizyka");
        student2.displayData();
    }
}
