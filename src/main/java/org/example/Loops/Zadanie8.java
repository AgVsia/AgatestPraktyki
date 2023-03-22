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
    }

}



