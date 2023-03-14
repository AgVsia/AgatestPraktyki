package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_5pdf {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        //Napisz program który ze standardowego wejścia wczytuje trzy liczby wymierne. Na standardowym wyjściu wypisuje informację, czy z podanych długości boków można zbudować trójkąt.(T - oznacza, że można, N- nie da się zbudować). Trójkąt może być
        //zbudowany tylko wtedy, gdy suma długości jego dwóch boków jest większa od długości trzeciego boku. Przykład:
        //Wejście: 4.0 5.0 3.0 Wyjście: T
        //Wejście: 6.43 3.14.0 1.05 Wyjście: N
        System.out.println("Podaj pierwszą liczbę wymierną: ");
        double num1 = in.nextDouble();
        System.out.println("Podaj drugą liczbę wymierną: ");
        double num2 = in.nextDouble();
        System.out.println("Podaj trzecią liczbę wymierną: ");
        double num3 = in.nextDouble();
        double sumOfNum1And2 = num1 + num2;
        double sumOfNum1And3 = num1 + num3;
        double sumOfNum2And3 = num2 + num3;

        if( sumOfNum1And2 >num3 || sumOfNum1And3 >num2 || sumOfNum2And3 >num1 ){
            System.out.println("T");
        } else{
            System.out.println("N");
        }
    }
}
