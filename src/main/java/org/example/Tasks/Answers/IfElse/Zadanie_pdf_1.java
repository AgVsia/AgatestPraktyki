package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie_pdf_1 {
    public static void main(String[] args) {
        //Napisz program, który wyświetla ocenę w zależności od liczby punktów zdobytych na sprawdzianie. Liczbę punków wczytujemy z klawiatury.
        //0 -42 pkt – niedostateczna;
        //43-59 pkt – dwójka;
        //60-76 pkt – trójka;
        //77-90 pkt – czwórka
        //91-100 pkt-piątka

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę punktów: ");
        int score = in.nextInt();

        if (score >= 0 && score <= 42) {
            System.out.println("Ocena niedostateczna");
        } else if (score >= 43 && score <= 59) {
            System.out.println("Dwója");
        } else if (score >= 60 && score <= 76) {
            System.out.println("Trója");
        } else if (score >= 77 && score <= 90) {
            System.out.println("Czwórka");
        } else if (score >= 91 && score <= 100) {
            System.out.println("Piątka");
        } else {
            System.out.println("Błędna liczba punktów!");
        }

    }
}
