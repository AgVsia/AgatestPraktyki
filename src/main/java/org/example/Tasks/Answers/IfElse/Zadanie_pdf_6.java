package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie_pdf_6 {
    public static void main(String[] args) {
        //Napisać program, który pobiera od użytkownika rok i miesiąc i drukuje na ekranie
        //informacje o tym ile zadany miesiąc ma dni (uwzględnij lata przestępne).

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int year = in.nextInt();
        System.out.print("Podaj miesiąc: ");
        int month = in.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Ten miesiąc ma 31 dni");
        } else if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Ten miesiąc ma 29 dni");
        } else if (month == 2 && ((year % 4 != 0 && year % 100 == 0) || year % 400 != 0)) {
            System.out.println("Ten miesiąc ma 28 dni");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Ten miesiąc ma 30 dni");
        } else {
            System.out.println("Błędne dane!");
        }
    }
}

