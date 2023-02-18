package org.example.In;

import java.util.Scanner;

public class Zadanie5_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia dwie liczby całkowite i wypisuje na standardowym wyjściu ich: sumę, różnicę, średnią, iloczyn i iloraz.
        System.out.println("Wpisz liczbe całkowitą: ");
        int valueOfFirstInteger = in.nextInt();
        int valueOfSecondInteger = in.nextInt();
        int sumOfInteger = valueOfFirstInteger + valueOfSecondInteger;
        int arithmeticMeanOfInteger= valueOfFirstInteger+ valueOfSecondInteger/2;
        int subtractOfInteger = valueOfFirstInteger - valueOfSecondInteger;
        int multiplyOfInteger = valueOfFirstInteger * valueOfSecondInteger;
        int divideOfInteger = valueOfFirstInteger / valueOfSecondInteger;
        System.out.print("\nSuma liczb: " + sumOfInteger + "\nŚrednia z liczb: " + arithmeticMeanOfInteger+ "\nRóżnica z liczb: " +  subtractOfInteger + "\nIloczyn z liczb: " +  multiplyOfInteger + "\nIloraz z liczb: "+ divideOfInteger);
    }
}
