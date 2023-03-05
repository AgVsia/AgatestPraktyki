package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_4 {
    public static void main(String[] args) {
        //Napisz program obliczający pole kwadratu na podstawie wymiarów podanych przez użytkownika.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj długość boku kwadratu: ");
        double squareSide = in.nextDouble();
        if (squareSide <= 0) {
            System.out.println("Musisz podać liczbę dodatnią!");
        } else {
            System.out.println("Pole kwadratu: " + squareSide * squareSide);
            //można też użyć metody z klasy Math
            System.out.println("Pole kwadratu (za pomocą klasy Math): " + Math.pow(squareSide, 2));
        }
    }
}
