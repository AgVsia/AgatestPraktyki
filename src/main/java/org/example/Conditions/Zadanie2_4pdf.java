package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_4pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia cztery liczby całkowite i wyświetla na standardowym wyjściu napis „RÓWNE” jeżeli suma pierwszej i drugie liczby jest równa sumie liczb trzeciej i czwartej.
        //Przykład: We: 3 4 1 5 Wy: RÓWNE We: 4 5 7 8 Wy:
        System.out.println("Wpisz pierwszą liczbę: ");
        int num1 = in.nextInt();
        System.out.println("Wpisz drugą liczbę: ");
        int num2 = in.nextInt();
        System.out.println("Wpisz trzecią liczbę: ");
        int num3 = in.nextInt();
        System.out.println("Wpisz czwartą liczbę: ");
        int num4 = in.nextInt();
        int sumOfNum1And2 = num1 + num2;
        int sumOfNum3And4 = num3 + num4;
        if (sumOfNum1And2 == sumOfNum3And4) {
            System.out.println("RÓWNE");
        } else {
            System.out.println("NIE RÓWNE");
        }
    }
}
