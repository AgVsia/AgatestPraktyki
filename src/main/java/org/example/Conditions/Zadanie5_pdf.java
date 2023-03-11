package org.example.Conditions;

import java.util.Scanner;

public class Zadanie5_pdf {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        //Napisać program, który dla przedziału domkniętego [a,b] (a i b zdefiniowanew programie) i liczby podanej przez użytkownika sprawdza czy jest ona w tymprzedziale.
        System.out.println(" a: 0 - 145");
        System.out.println(" b: 146 - 256");
        System.out.println(" [a,b]: 0 - 256");
        System.out.println("Wpisz Liczbę całkowitą a : ");
        int valueOfIntegerA = in.nextInt();
        System.out.println("Wpisz liczbę całkowitą b : ");
        int valueOfIntegerB = in.nextInt();
        if( valueOfIntegerA >= 0 && valueOfIntegerA <= 145 &&valueOfIntegerB >= 146 && valueOfIntegerB <= 256){
            System.out.println("Liczba mieści się w przedziale domkniętym: ");
        } else{
            System.out.println("Liczba poza przedziałem domkniętym: ");
        }
    }
}
