package org.example;

import java.util.Scanner;

public class Zadanie5_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia jakiś wyraz i wypisuje go na wyjściu wielkimi literami.
        System.out.println("Wpisz wyraz: ");
        String phrase = in.nextLine();
        String upperCaseOfPhrase =phrase.toUpperCase();
        System.out.println("Wielkie litery: " + upperCaseOfPhrase);

    }
}
