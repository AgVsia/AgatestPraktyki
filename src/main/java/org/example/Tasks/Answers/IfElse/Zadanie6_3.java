package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_3 {
    public static void main(String[] args){
        //6.3. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite
        // i wypisuje na standardowym wyjściu największą z ich wartości (pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).

        Scanner in = new Scanner(System.in);
        System.out.print("Wpisz pierwsza liczbe: ");
        int firstNum = in.nextInt();
        System.out.print("Wpisz drugą liczbę: ");
        int secondNum = in.nextInt();
        System.out.print("Wpisz trzecią liczbę: ");
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
