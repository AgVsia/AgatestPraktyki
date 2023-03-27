package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie_pdf_4 {
    public static void main(String[] args) {
        // apisać program, który wczytuje się dwie liczby a, b i oblicza wartość wyrażenia
        //(a+b)/(a-b). Program powinien sprawdzać poprawność wprowadzonych danych (mianownik≠ 0).

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double a = in.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = in.nextDouble();

        if (a - b != 0) {
            System.out.println((a + b) / (a - b));
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }
    }
}
