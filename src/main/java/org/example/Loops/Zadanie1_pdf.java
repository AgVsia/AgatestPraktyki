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
        System.out.println("Sprawdź czy użytkownik podaj dodatnią liczbę: ");
        if (num < 0) {
            System.out.println("Błąd. Liczba ujemna!!!!");

        } else if (num == 0) {
            System.out.println("0!=" + 1);
        } else {
            System.out.println("Liczba dodatnia, otwieramy pętle: ");
            for (int i = 1; i <= num; i++) {
                score *= i;

            }
            System.out.println("n!=" + score);
        }

        System.out.println("Podaj liczbę całkowitą: ");
        int num1 = in.nextInt();
        int score1 = 1;
        System.out.println("Sprawdź czy użytkownik podaj dodatnią liczbę: ");
        if (num1 < 0) {
            System.out.println("Błąd. Liczba ujemna!!!!");

        } else if (num1 == 0) {
            System.out.println("0!=" + 1);
        } else {
            System.out.println("Liczba dodatnia, otwieramy pętle: ");
            int i = 1;
            while (i <= num1) {
                score1 *= i;
                i++;
            }
            System.out.println("n!=" + score);
        }
        System.out.println("Podaj liczbę całkowitą: ");
        int num2 = in.nextInt();
        int score2 = 1;
        System.out.println("Sprawdź czy użytkownik podaj dodatnią liczbę: ");
        if (num1 < 0) {
            System.out.println("Błąd. Liczba ujemna!!!!");

        } else if (num2 == 0) {
            System.out.println("0!=" + 1);
        } else {
            System.out.println("Liczba dodatnia, otwieramy pętle: ");
            int j = 1;
            do {
                score2 *= j;
                j++;
            } while (j <= num2);

        }
        System.out.println("n!=" + score);
    }
}
