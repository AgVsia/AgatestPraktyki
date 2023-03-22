package org.example.Loops;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        //Napisz program, który dla wczytanej z klawiatury liczby n wypisze na ekranie liczby 1,4,9,...,n^2.
        // (Dla 2 wypisze: 1, 4) (Dla: 4 wypisze: 1, 4, 9, 16)
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz liczbę dodatnią: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i * i);
        }
        System.out.println("Wpisz liczbę: ");
        int num1 = in.nextInt();
        int i = 1;
        while (i <= num1) {
            System.out.println(i * i);
            i++;
        }
        System.out.println("Podaj liczbę naturalną:");
        int num2 = in.nextInt();
        int j = 1;
        do {
            System.out.println(j * j);
            j++;
        } while (j <= num2);

    }

}
