package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_4 {
    public static void main(String[] args) {
        // Napisz program obliczający pole kwadratu na podstawie wymiarów podanych przez użytkownika.( Jeśli użytkownik wprowadzi 0 lub ujemna liczbę)
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wymiar boku kwadratu: ");
        int sideOfSquare = in.nextInt();
        int squareArea = sideOfSquare * sideOfSquare;
        if (sideOfSquare == 0) {
            System.out.println("Wartość boku nie może być równa 0");
        } else if (sideOfSquare < 0) {
            System.out.println("Wartość boku nie może mniejsza niż 0:");
        } else {
            System.out.println("Wartość boku większa niż 0: " + sideOfSquare + "\nPole kwadratu: " + squareArea);
        }
    }
}
