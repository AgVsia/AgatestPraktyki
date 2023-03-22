package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie_pdf_3 {
    public static void main(String[] args) {
        // Napisać program, który sprawdza, czy podana przez użytkownika liczba całkowita jest poprawnym numerem miesiąca.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int day = in.nextInt();
        if (day > 0 && day <= 12) {
            System.out.println("Ta liczba może być numerem miesiąca");
        } else {
            System.out.println("Ta liczba nie może być numerem miesiąca");
        }
    }
}
