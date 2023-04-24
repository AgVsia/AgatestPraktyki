package org.example.Functions;

public class Zadanie_9 {
    public static void main(String[] args) {
        //Napisz funkcję, która przyjmuje w parametrze rok i sprawdza czy jest on przestępny. Zwraca true albo false.
        int year = 2023;
        boolean leap = leapyear(year);
        System.out.println("Podany rok: " + year);
    }

    public static boolean leapyear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Ta metoda zwraca rok przestępny: " + year);
            return true;
        } else{
            System.out.println("Rok nieprzestępny: " + year);
            return false;
        }
    }
}