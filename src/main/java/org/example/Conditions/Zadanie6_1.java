package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_1 {
    public static void main(String[] args) {
        //Napisz program, który wczyta ze standardowego wejścia liczbę całkowitą. Jeśli wczytana liczba jest równa 100 program wypisze na standardowe wyjście napis "TO STO!", jeśli to inna liczba program wypisze "TO NIE STO"
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą: ");
        int valueOfInteger = in.nextInt();
        if(valueOfInteger == 100){
            System.out.println("TO STO!");
        }else if(valueOfInteger > 100 || valueOfInteger < 100){
            System.out.println("TO NIE STO");
        }
    }

}
