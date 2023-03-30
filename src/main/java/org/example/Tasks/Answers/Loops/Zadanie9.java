package org.example.Tasks.Answers.Loops;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        //Napisz program, który pobierze od użytkownika liczbę naturalną n,
        // następnie pobierze n liczb całkowitych i wyświetli w konsoli liczbę najmniejszą i największą wpisaną przez użytkownika.
        Scanner in = new Scanner(System.in);
        System.out.println("-----PĘTLA FOR-----");
        System.out.print("Podaj liczbę: ");
        int n = in.nextInt();
        int nMin = 0, nMax = 0, temp;

        for (int i = 0; i < n; i++) {
            temp = in.nextInt();
            if (i == 0) {
                nMin = temp;
                nMax = temp;
            } else {
                if (temp > nMax) nMax = temp;
                else if (temp < nMin) nMin = temp;
            }
        }
        System.out.print("nMin: " + nMin + " nMax: " + nMax);

    }
}
