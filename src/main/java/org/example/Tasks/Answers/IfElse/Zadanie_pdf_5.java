package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie_pdf_5 {
    public static void main(String[] args) {
        //Napisać program, który dla przedziału domkniętego [a,b] (a i b zdefiniowane
        //w programie) i liczby podanej przez użytkownika sprawdza czy jest ona w tym przedziale.

        int a = 10;
        int b = 100;

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        double x = in.nextDouble();

        if (x >= a && x <= b) {
            System.out.println("Liczba jest w przedziale");
        } else {
            System.out.println("Liczba nie jest w przedziale");
        }
    }
}
