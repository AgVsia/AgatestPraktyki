package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_1pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który pobierze od użytkownika liczbę i wyświetli na standardowym wyjściu napisz, czy ta liczba jest dodatnia czy ujemna
        System.out.println("Wpisz liczbę: ");
        int valueOfNum = in.nextInt();
        if (valueOfNum > 0) {
            System.out.println("Liczba jest dodatnia: " + valueOfNum);
        } else if (valueOfNum < 0) {
            System.out.println("Liczba jest ujemna: " + valueOfNum);
        }else{
            System.out.println("Zero nie jest ani dodatnie ani ujemne: " + valueOfNum);
        }
    }

}

