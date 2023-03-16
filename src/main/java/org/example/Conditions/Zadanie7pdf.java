package org.example.Conditions;

import java.util.Scanner;

public class Zadanie7pdf {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        //Napisać program, który sprawdza poprawność podanej przez użytkownika daty.
        // Program pobiera z klawiatury trzy liczby całkowite oznaczające numer dnia, miesiąca i roku.
        // Niepoprawna data to np. 34.12.2003, 12.25.2000.
        System.out.println("Podaj liczbę dla dnia miesiąca: ");
        int numOfDay = in.nextInt();
        System.out.println("Podaj liczbę dla danego miesiąca: ");
        int numOfMonth = in.nextInt();
        System.out.println("Podaj liczbę dla roku: ");
        int numOfYear = in.nextInt();
        if(numOfDay>=1 && numOfDay <=31 && numOfMonth>=1 && numOfMonth<=12 && numOfYear>=2000){
            System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
        }else if(numOfDay>=1 && numOfDay <=29 && numOfMonth==2 && numOfYear>=2000){
            System.out.println("Poprawna data: " + numOfDay + "." + numOfMonth + "." + numOfYear);
        }else{
            System.out.println("Niepoprawna data: !!!!");
        }
    }
}
