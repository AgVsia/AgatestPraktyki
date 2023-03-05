package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_3 {
    public static void main(String[] args) {
        //Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym wyjściu największą z ich wartości (pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą: ");
        int firstInteger = in.nextInt();
        int secondInteger = in.nextInt();
        int thirdInteger = in.nextInt();
        if (firstInteger > secondInteger && firstInteger > thirdInteger){
            System.out.println("Największa z liczb: " + firstInteger);
        }else if (secondInteger > firstInteger && secondInteger >thirdInteger){
            System.out.println("Największa z liczb: " + secondInteger);
        }else if (thirdInteger > firstInteger && thirdInteger > secondInteger){
            System.out.println("Największa z liczb: " + thirdInteger);
        }else if (firstInteger == secondInteger && firstInteger == thirdInteger){
            System.out.println("Największa z liczb: " + firstInteger);
        }else if (firstInteger >= secondInteger && firstInteger >= thirdInteger){
            System.out.println("Największa z liczb: " + firstInteger);
        }else if (secondInteger >= firstInteger && secondInteger >=thirdInteger){
            System.out.println("Największa z liczb: " + secondInteger);
        }else if (thirdInteger >= firstInteger && thirdInteger >= secondInteger){
            System.out.println("Największa z liczb: " + thirdInteger);
        }
    }
}
