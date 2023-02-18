package org.example.In;

import java.util.Scanner;

public class Zadanie5_11 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    //Napisz program, który wczytuje ze standardowego wejścia jakiś wyraz i wypisuje na wyjściu z ilu znaków składa się ten wyraz.
        System.out.println("Wpisz wyraz: ");
        String phrase = in.nextLine();
        int lengthOfPhrase= phrase.length();
        System.out.println("Długość wyrazu: " + lengthOfPhrase);

    }

}
