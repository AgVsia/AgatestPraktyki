package org.example.Conditions;

import java.util.Scanner;

public class Zadanie7pdf {
    public static void main(String[] args) {
        //Napisać program, który sprawdza poprawność podanej przez użytkownika daty.
        // Program pobiera z klawiatury trzy liczby całkowite oznaczające numer dnia, miesiąca i roku.
        // Niepoprawna data to np. 34.12.2003, 12.25.2000.
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę dla dnia miesiąca: ");
        int numOfDay = in.nextInt();
        System.out.println("Podaj liczbę dla danego miesiąca: ");
        int numOfMonth = in.nextInt();
        System.out.println("Podaj liczbę dla roku: ");
        int numOfYear = in.nextInt();

        if (numOfDay >= 1 && numOfDay <= 31) {
            if (numOfMonth >= 1 && numOfMonth <= 12) {
                if (numOfYear >= 2000) ;
                if (numOfDay >= 1 && numOfDay <= 29) {
                    if (numOfMonth == 2) {
                        if (numOfYear >= 2000) {
                        }
                    }
                    System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
                }
            }
        }
    }
}

