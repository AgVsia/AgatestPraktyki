package org.example.StandardInput;

import java.util.Scanner;

public class Zadanie5_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia liczbę całkowitą i wypisuje na standardowym wyjściu liczbę o jeden większą.
        System.out.println("Wpisz liczbę całkowitą: ");
        int valueOfInteger = in.nextInt();
        int valueOneHigherOfInteger = valueOfInteger + 1;
        System.out.println("Liczba całkowita większa o 1 = " + valueOneHigherOfInteger);
    }

}
