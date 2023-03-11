package org.example.Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie2_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który pobiera od użytkownika długość boku kwadratu z kontrolą poprawności, a następnie oblicza obwód i pole kwadratu.
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("1.Liczba: ");
        System.out.println("2.Inna wartość: ");
        int selectOption = in.nextInt();
        System.out.println("Wpisz liczbę: ");
        double lengthOfSide= in.nextDouble();
        String AnotherValue = in.nextLine();


        if (selectOption ==1 && lengthOfSide > 0) {
            double areaOfSquare = lengthOfSide * lengthOfSide;
            double perimeterOfSquare = 4 * lengthOfSide;
            System.out.println("Pole kwadratu: " + areaOfSquare);
            System.out.println("Obwód kwadratu: " + perimeterOfSquare);
        } else if ( selectOption == 2){
            System.out.println("Podano nieprawidłową wartość: " );
        }

    }
}
