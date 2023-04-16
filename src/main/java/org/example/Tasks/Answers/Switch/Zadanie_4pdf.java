package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_4pdf {
    public static void main(String[] args) {
        //Przy założeniu, że zmienna status jest typu int instrukcję warunkową zamień na
        //równoważną instrukcję switch:
//
//        if (s <= 10 && s >= 0) {
//            if (s == 10 || s == 9) {
//                ocena = 'A';
//            } else if (s == 8 || s == 7) {
//                ocena = 'B';
//            } else if (s == 6 || s == 5) {
//                ocena = 'C';
//            } else {
//                ocena = 'E';
//            }
//        } else {
//            System.out.println("niepoprawne dane");
//        }
        Scanner in = new Scanner(System.in);
        System.out.println(("Wpisz wynik: "));

        int s = in.nextInt();

        switch (s) {
            case 10, 9:
                System.out.println("Ocena A");
            case 8, 7:
                System.out.println("Ocena B");
                break;
            case 6, 5:
                System.out.println("Ocena C");
                break;
            case 4, 3, 2, 1, 0:
                System.out.println("Ocena E");
                break;
            default:
                System.out.println("niepoprawce dane");
        }
    }
}
