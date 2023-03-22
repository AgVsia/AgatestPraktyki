package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie_pdf_2 {
    public static void main(String[] args) {
        //Napisać program, który pobiera od użytkownika długość boku kwadratu z kontrolą
        //poprawności, a następnie oblicza obwód i pole kwadratu.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj długość boku kwadratu: ");
        double squareSide = in.nextDouble();
        if (squareSide > 0) {
            System.out.println("Obwód " + 4 * squareSide);
            System.out.println("Pole kwadratu: " + squareSide * squareSide);
        } else {
            System.out.println("Nieprawidłowa długość boku kwadratu");
        }
    }
}
