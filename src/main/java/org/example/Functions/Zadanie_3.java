package org.example.Functions;

public class Zadanie_3 {
    public static void main(String[] args) {
        //Napisz funkcję sum(), która przyjmuje w parametrach dwie liczby i zwraca ich sumę.
        int num1 = 12;
        int num2 = 10;
        int suma = sum(num1, num2);
        System.out.println("Suma dwóch liczb: " + suma);
    }

    public static int sum(int num1, int num2) {
        System.out.println("Ta metoda zwraca sumę dwóch liczb: " + num1 + " i " + num2);
        return num1 + num2;
    }

}
