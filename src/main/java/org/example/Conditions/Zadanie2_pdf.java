package org.example.Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie2_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który pobiera od użytkownika długość boku kwadratu z kontrolą poprawności, a następnie oblicza obwód i pole kwadratu.
        System.out.println("Wybierz długość boku kwadratu: ");;
        double lengthOfSide= in.nextDouble();

        if (lengthOfSide > 0) {
            double areaOfSquare = lengthOfSide * lengthOfSide;
            double perimeterOfSquare = 4 * lengthOfSide;
            System.out.println("Pole kwadratu: " + areaOfSquare);
            System.out.println("Obwód kwadratu: " + perimeterOfSquare);
        } else {
            System.out.println("Podano nieprawidłową wartość: " );
        }

    }
}
