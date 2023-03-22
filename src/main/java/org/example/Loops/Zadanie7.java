package org.example.Loops;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program wyświetlający na wyjściu kolejne 100 liczb parzystych od wczytanej od usera liczby

        System.out.println(" Podaj liczbę: ");
        int num = in.nextInt();
        for (int i = num; i <= num + 100; i = i + 2) {
            if (num % 2 != 0) {
                System.out.println(i + 1);
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Podaj liczbę: ");
        int num1 = in.nextInt();
        int j = num1;
        while (j <= num + 100) {
            if (num % 2 != 0) {
                System.out.println(j + 1);
                j = j + 2;
            } else {
                System.out.println(j);
            }
        }

        System.out.println("Podaj liczbę: ");
        int num2 = in.nextInt();
        int k = num2;
        do {
            if (num2 % 2 != 0) {
                System.out.println(k + 1);
            } else
                System.out.println(k);
            k=k+2;
        } while (k <= num2 + 100);
    }
}








