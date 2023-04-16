package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_3 {

    public static void main(String[] args) {
        //Napisz program, który wczytuje od usera kwotę w złotych, a następnie przelicza ją na taka walutę, jaką wybierze użytkownik: funty, dolary, euro.

        double EXCHANGE_RATE_EURO = 4.70;
        double EXCHANGE_RATE_DOLAR = 4.43;
        double EXCHANGE_RATE_FUNT = 5.30;

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj kwotę w PLN: ");
        double amount = in.nextDouble();

        System.out.println("Podaj walutę na jaką chcesz przeliczyć podaną kwotę. Wpisz dolar, funt lub euro. ");
        String currency = in.next();

        switch (currency) {
            case "dolar":
                System.out.println("Masz " + amount / EXCHANGE_RATE_DOLAR + "$");
                break;
            case "funt":
                System.out.println("Masz " + amount / EXCHANGE_RATE_FUNT + "\u00A3");
                break;
            case "euro":
                System.out.println("Masz " + amount / EXCHANGE_RATE_EURO + "\u00A2");
                break;
            default:
                System.out.println("Nierozpoznana waluta!");
                break;
        }
    }
}
