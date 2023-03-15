package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_3pdf {
    //   Aga to poprawię  zadanko:)))
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia trzy liczby i wypisuje je na standardowym wyjściu w kolejności od najmniejszej do największej (UWAGA: podane liczby nie muszą być różne).
        System.out.println("Wpisz pierwszą liczbę: ");
        int firstNum = in.nextInt();
        System.out.println("Wpisz drugą liczbę: ");
        int secondNum = in.nextInt();
        System.out.println("Wpisz trzecią liczbę: ");
        int thirdNum = in.nextInt();
        if(firstNum >= secondNum && firstNum >= thirdNum){
            System.out.println(firstNum);
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println(secondNum);
        } else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            System.out.println(thirdNum);
        }
        }
    }
// Aga to zadanie dokończę :)

