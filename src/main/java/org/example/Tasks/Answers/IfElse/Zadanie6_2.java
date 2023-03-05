package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_2 {
    public static void main(String[] args){
        //6.2. Napisz program, który wczytuje ze standardowego wejścia dwie liczby całkowite
        // i wypisuje na standardowym wyjściu większą z nich (w przypadku gdy podane liczby są równe, program powinien wypisać napis "Liczby są równe")

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int userNumber1 = in.nextInt();
        System.out.print("Podaj liczbę: ");
        int userNumber2 = in.nextInt();
        if (userNumber1 > userNumber2) System.out.println(userNumber1);
        else if (userNumber1 < userNumber2) System.out.println(userNumber2);
        else System.out.println("Liczby są równe");

    }
}
