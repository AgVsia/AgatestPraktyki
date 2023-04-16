package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_2pdf {
    public static void main(String[] args) {
        //Przy założeniu, że zmienna rezultat jest typu int instrukcję warunkową zamień na
        //równoważną instrukcję switch.:
//        if (rezultat == 0) {
//            System.out.println("Operacja zakończona pomyślnie");
//        } else {
//            if (rezultat == -1) {
//                System.out.println("Blad urzadzenia");
//            } else {
//                if (rezultat == -2) {
//                    System.out.println("Urzadzenie nie gotowe");
//                } else {
//                    System.out.println("Nierozpoznany blad");
//                }
//            }
//        }

        Scanner in = new Scanner(System.in);
        System.out.println(("Wpisz liczbę: "));

        int choice = in.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Operacja zakończona pomyślnie");
                break;
            case -1:
                System.out.println("Błąd urządzenia");
                break;
            case -2:
                System.out.println("Urządzenie nie gotowe");
                break;
            default:
                System.out.println("Nierozpoznany błąd");
        }
    }
}
