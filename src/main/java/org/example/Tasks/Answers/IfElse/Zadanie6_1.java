package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_1 {
    public static void main(String[] args){
        //6.1. Napisz program, który wczyta ze standardowego wejścia liczbę całkowitą.
        // Jeśli wczytana liczba jest równa 100 program wypisze na standardowe wyjście napis "TO STO!", jeśli to inna liczba program wypisze "TO NIE STO"

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int userNumber = in.nextInt();
        if (userNumber == 100) System.out.println("TO STO!");
        else System.out.println("TO NIE STO");
    }
}
