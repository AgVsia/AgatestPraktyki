package org.example.Functions;

public class Zadanie_6 {
    public static void main(String[] args) {
        //Napisz funkcję, która przyjmuje w parametrach 3 liczby i zwraca największą z nich
        int num1 = 5;
        int num2 = 6;
        int num3 = 9;
        int biggerNum = theBiggestNum(num1, num2, num3);
        System.out.println("Największa z liczb: " + biggerNum);
    }

    public static int theBiggestNum(int num1, int num2, int num3) {
        System.out.println("Ta metoda zwraca największą z liczb:" + num1);
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Ta metoda zwraca największą z liczb: " + num2);
            return num2;
        } else{
            System.out.println("Ta metoda zwraca największą z liczb:" + num3);
            return num3;
        }
    }
}
