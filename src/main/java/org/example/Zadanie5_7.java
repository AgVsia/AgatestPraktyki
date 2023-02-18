package org.example;

import java.util.Scanner;

public class Zadanie5_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym wyjściu ich średnią arytmetyczną.
        System.out.println("Wpisz liczbę całkowitą: ");
        int valueOfFirstInteger = in.nextInt();
        int valueOfSecondInteger = in.nextInt();
        int valueOfThirdInteger = in.nextInt();
        int sumOfInteger = valueOfFirstInteger + valueOfSecondInteger + valueOfThirdInteger;
        int valueOfArithmeticMeanOfInteger = sumOfInteger/3;
        System.out.println("Średnia arytmetyczna z 3 liczb całkowitych: " + valueOfArithmeticMeanOfInteger);
    }

}
