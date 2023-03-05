package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_2 {
    public static void main(String[] args){
        //Napisz program, który wczytuje ze standardowego wejścia dwie liczby całkowite i wypisuje na standardowym wyjściu większą z nich (w przypadku gdy podane liczby są równe, program powinien wypisać napis "Liczby są równe")
        System.out.println("Wpisz liczbę całkowitą: ");
        Scanner in = new Scanner(System.in);
        int firstInteger = in.nextInt();
        int secondInteger = in.nextInt();
        if (firstInteger > secondInteger){
            System.out.println("Większa liczba: " + firstInteger);
        }else if (secondInteger > firstInteger){
            System.out.println("Większa liczba: " + secondInteger);
        }else{
            System.out.println("Liczby są równe");
        }
    }

}
