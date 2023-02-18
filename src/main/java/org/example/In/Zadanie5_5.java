package org.example.In;

import java.util.Scanner;

public class Zadanie5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite, a następnie wypisuje je w oddzielnych liniach na standardowym wyjściu.
        System.out.println("Wpisz liczbę całkowitą: ");
        int valueOfFirstInteger = in.nextInt();
        int valueOfSecondInteger = in.nextInt();
        int valueOfThirdInteger = in.nextInt();
        System.out.println("\nPierwsza liczba całkowita = " + valueOfFirstInteger + "\nDruga liczba całkowita = " + valueOfSecondInteger + "\nTrzecia liczba cakowita = " + valueOfThirdInteger);
    }

}
