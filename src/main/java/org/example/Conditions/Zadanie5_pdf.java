package org.example.Conditions;

import java.util.Scanner;

public class Zadanie5_pdf {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        //Napisać program, który dla przedziału domkniętego [a,b] (a i b zdefiniowanew programie) i liczby podanej przez użytkownika sprawdza czy jest ona w tymprzedziale.

        System.out.println(" [a,b]: 0 - 256");
        int valueOfNumA = 0;
        int valueOfNumB = 256;
        System.out.println("Wpisz Liczbę całkowitą : ");
        int valueOfInteger = in.nextInt();

        if( valueOfInteger >= valueOfNumA && valueOfInteger <= valueOfNumB){
            System.out.println("Liczba mieści się w przedziale domkniętym: ");
        } else{
            System.out.println("Liczba poza przedziałem domkniętym: ");
        }
    }
}
