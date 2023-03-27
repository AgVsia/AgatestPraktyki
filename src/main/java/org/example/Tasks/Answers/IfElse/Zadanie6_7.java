package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_7 {
    public static void main(String[] args) {
        //Napisz program kalkulator, który wykonuje wybraną przez użytkownika operacją arytmetyczną na dwóch wczytanych liczbach.
        // Program powinien wczytywać dane ze standardowego wejścia i wypisywać wynik na standardowym wyjściu.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę x: ");
        double x = in.nextDouble();
        System.out.print("Podaj liczbę y: ");
        double y = in.nextDouble();

        System.out.println("Jaką operację chcesz wykonać na tych liczbach? Wybierz odpowiednią literę.");
        System.out.println("a - dodawanie \nb - odejmowanie \nc - mnożenie \nd - dzielenie");
        char selectedOption = in.next().charAt(0);
        if (selectedOption == 'a') {
            System.out.println("Suma x i y: " + (x + y));
        } else if (selectedOption == 'b') {
            System.out.println("Różnica x i y: " + (x - y));
        } else if (selectedOption == 'c') {
            System.out.println("Iloczyn x i y: " + (x * y));
        } else if (selectedOption == 'd') {
            if (y == 0) {
                System.out.println("Nie można dzielić przez 0!");
            } else {
                System.out.println("Iloraz x i y: " + (x / y));
            }
        } else {
            System.out.println("Wpisz a, b, c lub d!");
        }

    }
}
