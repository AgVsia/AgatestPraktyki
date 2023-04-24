package org.example.Functions;

import java.util.Scanner;

public class Zadanie_5 {
    public static void main(String[] args) {
        //Napisz funkcję compare(), która w parametrach przyjmuje dwie liczby i zwraca większą z nich.

        int num1 = 18;
        int num2 = 5;
        int biggerNum = compare(num1, num2);
        System.out.println("Większa z liczb: " + biggerNum);
    }

    public static int compare(int num1, int num2) {
        System.out.println("Ta metoda zwraca większą z liczb: " + num1);
        if (num1 > num2) {
            return num1;
        } else {
            System.out.println("Ta metoda zwraca większa z liczb: " + num2);
            return num2;
        }
    }
}
