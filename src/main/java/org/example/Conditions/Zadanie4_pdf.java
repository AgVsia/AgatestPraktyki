package org.example.Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie4_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który wczytuje się dwie liczby a, b i oblicza wartość wyrażenia(a+b)/(a-b). Program powinien sprawdzać poprawność wprowadzonych danych(mianownik≠ 0).
        System.out.println("Wpisz pierwszą liczbę a: ");
        double valueOfFirstNumberA = in.nextDouble();
        System.out.println("Wpisz drugą liczbę b: ");
        double valueOfSecondB = in.nextDouble();

        if (valueOfFirstNumberA - valueOfSecondB != 0) {
            double arithmeticOperation = (valueOfFirstNumberA + valueOfSecondB) / (valueOfFirstNumberA - valueOfSecondB);
            System.out.println(" Wynik działania: " + arithmeticOperation);
        } else {
            System.out.println("Nie dzielimy przez 0!!! ");
        }
    }
}
