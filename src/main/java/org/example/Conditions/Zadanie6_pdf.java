package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_pdf {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który pobiera od użytkownika rok i miesiąc i drukuje na ekranie informacje o tym ile zadany miesiąc ma dni (uwzględnij lata przestępne).
        System.out.println("1.Podaj rok");
        int valueOfYear = in.nextInt();
        int noLapYear = in.nextInt();
        int lapYear = valueOfYear + 4;
        System.out.println("2. Podaj miesiąc");
        String NameOfMonth = in.nextLine();
        System.out.println("Styczeń, Marzec, Maj, Sierpień, Październik, Grudzień - 31 dni");
        int numberOfDaysOfTheMonth = in.nextInt();
        System.out.println("Luty - rok przestępny - 29 dni");
        int numberOfLapFebruary = in.nextInt();
        System.out.println("Luty - rok nieprzestępny - 28 dni");
        int numberOfNoLapFebruary = in.nextInt();
        System.out.println("Kwiecień, Czerwiec, Lipiec, Wrzesień, Listopad - 30 dni");
    }

}
