package org.example.Conditions;

import java.util.Scanner;

public class Zadanie3_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który sprawdza, czy podana przez użytkownika liczba całkowita jest poprawnym numerem miesiąca.
        System.out.println("Wybierz liczbę odpowiadającą danemu miesiącowi: ");
        int valueOfNum = in.nextInt();
        if (valueOfNum >= 1 && valueOfNum <= 12) {
            System.out.println("Poprawna wartość miesiąca");
        }else{
            System.out.println("Nieprawidłowa wartość miesiąca");
        }
    }
}
