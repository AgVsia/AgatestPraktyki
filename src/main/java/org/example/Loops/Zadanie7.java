package org.example.Loops;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program wyświetlający na wyjściu kolejne 100 liczb parzystych od wczytanej od usera liczby

        System.out.println(" Podaj liczbę parzystą: ");
        int num = in.nextInt();
        for (int i = 2 + num; i <= num + 102; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}





