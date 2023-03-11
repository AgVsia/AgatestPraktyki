package org.example.Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie4_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który wczytuje się dwie liczby a, b i oblicza wartość wyrażenia(a+b)/(a-b). Program powinien sprawdzać poprawność wprowadzonych danych(mianownik≠ 0).
        System.out.println("Wpisz pierwszą liczbę: ");
        double valueOfFirstNumber = in.nextDouble();
        System.out.println("Wpisz drugą liczbę: ");
        double valueOfSecond = in.nextDouble();
        double arithmeticOperation = (valueOfFirstNumber + valueOfSecond) /(valueOfFirstNumber - valueOfSecond);
        double denominator = in.nextDouble();
        double valueOfDenominator = valueOfFirstNumber - valueOfSecond;


        if (valueOfFirstNumber > 0 && valueOfSecond >0 && valueOfDenominator == 0) {
            System.out.println("Wprowadzono nieprawidłową wartość");
        } else if (valueOfFirstNumber > 0 && valueOfSecond > 0 && valueOfDenominator != 0 ) {
            System.out.println(" Wynik działania: " + arithmeticOperation);
        }

    }


}
