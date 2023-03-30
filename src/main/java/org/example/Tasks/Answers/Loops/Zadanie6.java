package org.example.Tasks.Answers.Loops;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        //Napisz program, który dla wczytanej z klawiatury liczby n wypisze na ekranie liczby 1,4,9,...,n^2.
        // (Dla 2 wypisze: 1, 4) (Dla: 4 wypisze: 1, 4, 9, 16)
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((int)Math.pow(i, 2) + " ");
        }

        System.out.println();

        int i = 1;
        while (i <= n) {
            System.out.print((int)Math.pow(i, 2) + " ");
            i++;
        }

        System.out.println();

        int j = 1;
        do {
            System.out.print((int)Math.pow(j, 2) + " ");
            j++;
        } while (j <= n);

    }
}
