package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który pobiera od użytkownika rok i miesiąc i drukuje na ekranie informacje o tym ile zadany miesiąc ma dni (uwzględnij lata przestępne).
        System.out.println("1.Podaj rok");
        int year = in.nextInt();
        System.out.println("2. Podaj miesiąc");
        int month = in.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(" Miesiąc ma 31 dni:");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Miesiąc ma 30 dni: ");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Rok przestępny - luty ma 29 dni");
            }else{
                System.out.println("Rok nieprzestępny - luty ma 28 dni");
            }
        }
    }
}
