package org.example.Conditions;

import java.util.Scanner;

public class Zadanie1_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wyświetla ocenę w zależności od liczby punktów zdobytych na sprawdzianie Liczbę punków wczytujemy się z klawiatury.
        System.out.println("Ocena niedostateczna: 0 - 42 pkt");
        System.out.println(" Dwójka: 43 - 59 pkt");
        System.out.println(" Trójka: 60 - 76 pkt");
        System.out.println(" Czwórka: 77 - 90 pkt");
        System.out.println(" Piątka: 91 - 100 pkt");
        System.out.println("Wpisz liczbę punktów: ");
        int numberOfPoints = in.nextInt();
        if (numberOfPoints >= 0 && numberOfPoints <= 42) {
            System.out.println("Ocena niedostateczna: " + numberOfPoints);
        } else if (numberOfPoints >= 43 && numberOfPoints <= 59) {
            System.out.println("Dwójka: " + numberOfPoints + "pkt");
        } else if (numberOfPoints >= 60 && numberOfPoints <= 76) {
            System.out.println("Trójka: " + numberOfPoints + "pkt");
        } else if (numberOfPoints >= 77 && numberOfPoints <= 90) {
            System.out.println("Czwórka:" + numberOfPoints + "pkt");
        } else if (numberOfPoints >= 91 && numberOfPoints <= 100) {
            System.out.println("Piątka:" + numberOfPoints + "pkt");
        }
    }
}
