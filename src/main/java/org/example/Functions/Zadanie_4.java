package org.example.Functions;

public class Zadanie_4 {
    public static void main(String[] args) {
        //Napisz funkcję difference(), która przyjmuje w parametrach dwie liczby i zwraca ich różnicę.
        int num1 = 12;
        int num2 = 5;
        int substraction = difference(num1, num2);
        System.out.println("Różnica dwóch liczb: " + substraction);
    }

    public static int difference(int num1, int num2) {
        System.out.println("Ta metoda zwraca różnice dwóch liczb: " + num1 + " i " + num2);
        return num1 - num2;
    }
}
