package org.example;

import java.util.Scanner;

public class Zadanie5_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Napisz program wyświetlający na ekranie pierwszą i ostatnią literę dowolnego wyrazu wprowadzonego z klawiatury
        System.out.println("Wpisz wyraz: ");
        String phrase = in.nextLine();
        char firstLetterOfPhrase = phrase.charAt(0);
        char lastLetterOfPhrase = phrase.charAt(8);
        System.out.println("Pierwsza i ostatnia litera wyrazu:" + firstLetterOfPhrase + "," + lastLetterOfPhrase);
    }
}
