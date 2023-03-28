package org.example.Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadanie8 {

    static public void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który pobiera od usera dodatnią liczbę całkowitą n i wypisuje na standardowym wyjściu wszystkie dodatnie dzielniki liczby n.
        System.out.println("Wpisz liczbę całkowitą: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);

            }
        }

        System.out.println("Wpisz liczbę całkowitą: ");
        int num1 = in.nextInt();
        int i = 1;
        while (i <= num1) {
            if (num1 % i == 0) {
                System.out.println(i);
                i++;

            }
        }
        System.out.println("Podaj liczbę całkowitą:");
        int num2 = in.nextInt();
        int j = 1;
        do {
            if (num1 % i == 0)
                System.out.println(j);
            j++;
        }
        while (j <= num2);


    }
}


