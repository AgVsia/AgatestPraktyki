package org.example.Loops;

import java.util.Scanner;

public class Zadanie1_pdf {
    public static void main(String[] args) {
        //Napisz program obliczający silnię. Niech program prosi użytkownika o podanie liczby
        //całkowitej. Następnie program powinien sprawdzić czy podana liczba jest nieujemna. Jeśli
        //jest ujemna to program powinien wyświetlić komunikat: Blad. Liczba jest ujemna. i
        //zakończyć działanie. Jeśli liczba jest równa zero to program powinien wypisać wartość silni z
        //zera czyli liczbę 1. Jeśli wartość jest większa od zera to program powinien obliczyć wartość
        //silni z tej liczby z użyciem pętli „for” i następnie wypisać obliczoną wartość.

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int num = in.nextInt();
        int score = num * (num - 1);
        for (int i = 0; i <= 0; i++) {
            if (num < 0) {
                System.out.println("Błąd. Liczba ujemna!!!!");
            } else if (num == 0) {
                System.out.println("0!=" + score);
            } else {
                System.out.println("n!=" + score);
            }

        }
        System.out.println("Podaj liczbę całkowitą: ");
        int num1 = in.nextInt();
        int score1 = num1 * (num1 - 1);
        int i = 0;
        while (i <= 0) {
            if (num1 < 0) {
                System.out.println("Błąd. Liczba ujemna!!!!");
            } else if (num1 == 0) {
                System.out.println("0!=" + score);
            } else {
                System.out.println("n!=" + score);
            }
            i++;
        }
        System.out.println("Podaj liczbę całkowitą: ");
        int num2 = in.nextInt();
        int score2 = num2 * (num2 - 1);
        int j = 0;
        do {
            if (num1 < 0) {
                System.out.println("Błąd. Liczba ujemna!!!!");
            } else if (num1 == 0) {
                System.out.println("0!=" + score);
            } else {
                System.out.println("n!=" + score);

            }
            j++;
        } while (j <= 0);

    }
}
