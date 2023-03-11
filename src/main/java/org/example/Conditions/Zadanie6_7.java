package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Napisz program kalkulator, który wykonuje wybraną przez użytkownika operacją arytmetyczną na dwóch wczytanych liczbach.
        // Program powinien wczytywać dane ze standardowego wejścia i wypisywać wynik na standardowym wyjściu.
        System.out.println("Wybierz działanie arytmetyczne: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        int selectOption = in.nextInt();
        System.out.println("Wpisz pierwsza liczbę: ");
        double valueOfFirstValue =  in.nextDouble();
        System.out.println("Wpisz drugą liczbę: ");
        double valueOfSecondValue =  in.nextDouble();
        int denominator = in.nextInt();
        int valueOfDenominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Jeśli liczba równa jest zero w mianowniku: Nie można dzielić przez zero!!");
        } else if (selectOption == 1) {
            System.out.println("Wpisz pierwszą liczbę: ");
            double firstNumber = in.nextDouble();
            System.out.println("Wpisz drugą liczbę: ");
            double secondNumber = in.nextDouble();
            double addTwoNumbers = firstNumber + secondNumber;
            System.out.println("Suma liczb równa jest: " + addTwoNumbers);

        } else if (selectOption == 2) {
            System.out.println("Wpisz pierwszą liczbę: ");
            double firstNumber = in.nextDouble();
            System.out.println("Wpisz drugą liczbę: ");
            double secondNumber = in.nextDouble();
            double substructTwoNumbers = firstNumber - secondNumber;
            System.out.println("Różnica dwóch liczb równa jest: " + substructTwoNumbers);

        } else if (selectOption == 3) {
            System.out.println("Wpisz pierwszą liczbę: ");
            double firstNumber = in.nextDouble();
            System.out.println("Wpisz drugą liczbę: ");
            double secondNumber = in.nextDouble();
            double multiplyTwoNumbers = firstNumber * secondNumber;
            System.out.println(" Iloczyn dwóch liczb równy jest: " + multiplyTwoNumbers);

        } else if (selectOption == 4 && valueOfDenominator != 0) {
            System.out.println("Wpisz pierwszą liczbę: ");
            double firstNumber = in.nextDouble();
            System.out.println("Wpisz drugą liczbę: ");
            double divideTwoNumbers = firstNumber / valueOfDenominator;
            System.out.println(" Iloraz dwóch liczb równy jest: " + divideTwoNumbers);
        }
    }
}

