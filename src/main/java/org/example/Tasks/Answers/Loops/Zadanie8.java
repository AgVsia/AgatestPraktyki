package org.example.Tasks.Answers.Loops;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        //Napisz program, który pobiera od usera dodatnią liczbę całkowitą n i wypisuje na standardowym wyjściu wszystkie dodatnie dzielniki liczby n.
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i <= n) {
            if (n % i == 0) System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int j = 1;
        do {
            if (n % j == 0) System.out.print(j + " ");
            j++;
        } while (j <= n);

    }
}
