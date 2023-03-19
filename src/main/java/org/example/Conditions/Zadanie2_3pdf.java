package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_3pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczytuje ze standardowego wejścia trzy liczby i wypisuje je na standardowym wyjściu w kolejności od najmniejszej do największej (UWAGA: podane liczby nie muszą być różne).
        System.out.println("Wpisz pierwszą liczbę: ");
        int firstNum = in.nextInt();
        System.out.println("Wpisz drugą liczbę: ");
        int secondNum = in.nextInt();
        System.out.println("Wpisz trzecią liczbę: ");
        int thirdNum = in.nextInt();
        int maxNum = 0;
        int midNum = 0;
        int minNum = 0;

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            maxNum = firstNum;

        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            maxNum = secondNum;

        } else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            maxNum = thirdNum;

        }
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            minNum = firstNum;

        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            minNum = secondNum;

        } else if (thirdNum <= firstNum && thirdNum <= secondNum) {
            minNum = thirdNum;

        }
        if (firstNum >= secondNum && firstNum <= thirdNum) {
            midNum = firstNum;

        } else if (secondNum >= firstNum && secondNum <= thirdNum) {
            midNum = secondNum;
        } else if (thirdNum >= firstNum && thirdNum <= secondNum) {
            midNum = thirdNum;
        }
        System.out.println("Liczby od najmniejszej do największej:" + minNum + "," + midNum + "," + maxNum);
    }
}


