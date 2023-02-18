package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Zadanie5_4 {
    public static void main(String[] args){
        //Napisz program, który wczytuje ze standardowego wejścia liczbę zmiennoprzecinkową i wypisuje ją na standardowym wyjściu
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Program prosi o wartość: ");
        double valueOfNumber = in.nextDouble();
        System.out.println("Mąka kosztuje: " + valueOfNumber);
    }
}
