package org.example.Tasks.Answers.Loops;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        //Napisz program wyświetlający na wyjściu kolejne 100 liczb parzystych od wczytanej od usera liczby
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = in.nextInt();
        int nEvenNumberForSure = n;
        if (n % 2 != 0) nEvenNumberForSure += 1;

        for (int i = nEvenNumberForSure; i <= n + 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = nEvenNumberForSure;
        while (i <= n + 100) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();

        int j = nEvenNumberForSure;
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j <= n + 100);

    }
}
