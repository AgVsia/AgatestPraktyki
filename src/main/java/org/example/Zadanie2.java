package org.example;

public class Zadanie2 {
    public static void main(String[] args) {
        int yearToCheck = 2000;
        int yearToCheck2 = 2018;
        if (yearToCheck % 4 == 0 && yearToCheck % 100 != 0 || yearToCheck % 400 == 0) {
            System.out.println("Rok 2000 przestępny");
        } else if (yearToCheck2 % 4 == 0 && yearToCheck2 % 100 != 0 || yearToCheck2 % 400 == 0) {
            System.out.println("Rok 2018 przestępny ");
        } else {
            System.out.println("Rok nieprzestępny");
        }
    }

}