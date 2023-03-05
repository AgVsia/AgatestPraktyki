package org.example.StandardInput;

import java.util.Scanner;

public class Zadanie5_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program wyświetlający na ekranie pierwszą i ostatnią literę dowolnego wyrazu wprowadzonego z klawiatury
        System.out.println("Wpisz wyraz: ");
        String phrase = in.nextLine();
        int lengthOfPhrase = phrase.length();

        //FIXME potrzebujesz info o długości całej frazy, wtedy będziesz wiedziała pod jakim indeksem jest ostatnia litera (pamiętaj jak numerujemy indeksy)
        System.out.println("Pierwsza i ostatnia litera wyrazu:" );
    }
}
