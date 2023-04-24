package org.example.Functions;

public class Zadanie_7 {
    public static void main(String[] args) {
        //Napisz funkcję, która przyjmuje w parametrach 3 liczby i zwraca ich średnią.
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        int averageOfNum = average(num1, num2, num3);
        System.out.println("Średnia z liczb: " + averageOfNum);
    }

    public static int average(int num1,int num2,int num3){
        System.out.println("Ta metoda zwraca średnią z  liczb");
        return (num1+num2+num3)/3;
    }
}
