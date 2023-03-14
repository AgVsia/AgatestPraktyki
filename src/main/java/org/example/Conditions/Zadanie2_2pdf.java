package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_2pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który pobiera od użytkownika liczbę (od 1 do 7) i wyświetla odpowiednią nazwę tego dnia tygodnia. Jeśli użytkownik poda liczbę spoza zakresu 1-7 program wyświetli stosowny komunikat.
        System.out.println("Wpisz liczbę od 1 do 7: ");
        int valueOfNum = in.nextInt();
        if (valueOfNum == 1) {
            System.out.println("Poniedziałek");
        } else if (valueOfNum == 2) {
            System.out.println("Wtorek");
        } else if (valueOfNum == 3) {
            System.out.println("Środa");
        } else if (valueOfNum == 4) {
            System.out.println("Czwartek");
        } else if (valueOfNum == 5) {
            System.out.println("Piątek");
        } else if (valueOfNum == 6) {
            System.out.println("Sobota");
        } else if (valueOfNum == 7) {
            System.out.println("Niedziela");
        } else {
            System.out.println("Podana liczba nie odpowiada dniu tydodnia");
        }
    }
}
