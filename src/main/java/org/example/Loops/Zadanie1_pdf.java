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
        int score = 1;
        for (int i = 1; i <= num; i++) {
            if (num < 0) {
                System.out.println("Błąd.Liczba ujemna!!!");
            } else if (num == 0) {
                System.out.println("0!=" + i);
            } else if (num > 0) {
                score *= i;
                System.out.println("n!" + i + " = " + score);
            }
        }

    }
}
