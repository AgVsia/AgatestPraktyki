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

        if (numOfDay >= 1 && numOfDay <= 31 && numOfMonth >= 1 && numOfMonth <= 12 && numOfYear >= 0) {
            if (numOfDay <= 31 && (numOfMonth == 1 || numOfMonth == 3 || numOfMonth == 5 || numOfMonth == 7 || numOfMonth == 8 || numOfMonth == 10 || numOfMonth == 12)) {
                if (numOfDay < 10 && numOfMonth < 10) {
                    System.out.println("Poprawna data: " + "0" + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                } else if (numOfDay < 10) {
                    System.out.println("Poprawna data: " + "0" + numOfDay + "." + numOfMonth + "." + numOfYear);
                } else if (numOfMonth < 10) {
                    System.out.println("Poprawna data: " + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                } else {
                    System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
                }
            } else if (numOfDay <= 30 && (numOfMonth == 4 || numOfMonth == 6 || numOfMonth == 9 || numOfMonth == 11)) {
                if (numOfDay < 10 && numOfMonth < 10) {
                    System.out.println("Poprawna data: " + "0" + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                } else if (numOfDay < 10) {
                    System.out.println("Poprawna data: " + "0" + numOfDay + "." + numOfMonth + "." + numOfYear);
                } else if (numOfMonth < 10) {
                    System.out.println("Poprawna data: " + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                } else {
                    System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
                }
            } else if (numOfDay >= 1 && numOfDay <= 29 && numOfMonth == 2) {
                if (numOfDay <= 29 && (numOfYear % 4 == 0 && numOfYear % 100 != 0 || numOfYear % 400 == 0)) {
                    if (numOfDay < 10 && numOfMonth < 10) {
                        System.out.println("Poprawna data: " + "0" + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                    } else if (numOfDay < 10) {
                        System.out.println("Poprawna data: " + "0" + numOfDay + "." + numOfMonth + "." + numOfYear);
                    } else if (numOfMonth < 10) {
                        System.out.println("Poprawna data: " + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                    } else {
                        System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
                    }
                } else if (numOfDay <= 28 && (numOfYear % 4 != 0 && numOfYear % 100 == 0 || numOfYear % 400 != 0)) {
                    if (numOfDay < 10 && numOfMonth < 10) {
                        System.out.println("Poprawna data: " + "0" + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                    } else if (numOfDay < 10) {
                        System.out.println("Poprawna data: " + "0" + numOfDay + "." + numOfMonth + "." + numOfYear);
                    } else if (numOfMonth < 10) {
                        System.out.println("Poprawna data: " + numOfDay + "." + "0" + numOfMonth + "." + numOfYear);
                    } else {
                        System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
                    }
                } else {
                    System.out.println("Niepoprawna data!!!!");
                }
            } else {
                System.out.println("Niepoprawna data!!!");
            }
        } else {
            System.out.println("Niepoprawna data!!!");
        }
    }
}

