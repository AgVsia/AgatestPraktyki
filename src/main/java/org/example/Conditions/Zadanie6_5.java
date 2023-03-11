package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program obliczający pole trójkąta na podstawie wymiarów podanych przez użytkownika. Użytkownik powinien mieć możliwość podania długości podstawy i wysokości lub wszystkich boków trójkąta.
        System.out.println(" Jakie dane chcesz podać? Wybierz odpowiednią cyfrę : 1 lub 2");
        System.out.println(" 1. długość podstawy i wysokość: ");
        System.out.println(" 2. długości boków");

        char selectedOption = in.nextLine().charAt(0);
        if (selectedOption == '1') {
            System.out.println("Podaj długość podstawy: ");
            double lengthOfBase = in.nextDouble();
            System.out.println("Podaj wysokość:");
            double highOfTriangle = in.nextDouble();
            double triangleArea = lengthOfBase * highOfTriangle / 2;
            System.out.println("Pole trójkąt: " + triangleArea);
        } else if (selectedOption == '2') {
            System.out.println("Podaj długość boku a: ");
            double lengthOfSideA = in.nextDouble();
            System.out.println("Podaj długość boku b:");
            double lengthOfSideB = in.nextDouble();
            System.out.println("Podaj długość boku c:");
            double lengthOfSideC = in.nextDouble();
            double halfOfPerimeter = (lengthOfSideA + lengthOfSideB + lengthOfSideC) / 2;
            double triangleArea = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - lengthOfSideA) * (halfOfPerimeter - lengthOfSideB) * (halfOfPerimeter - lengthOfSideC));
            System.out.println("Pole trójkąta: " + triangleArea);
        } else {
            System.out.println("Podano nieprawidłową wartość");
        }
    }
}


