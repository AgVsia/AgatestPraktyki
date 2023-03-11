package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który w zależności od wyboru użytkownika wczytuje ze standardowego wejścia wymiary: kwadratu, prostokąta lub trójkąta i wypisuje na standardowym wyjściu pole figury o wczytanych wymiarach.
        System.out.println("Wybierz cyfrę dla figury geometrycznej: ");
        System.out.println(" 1.Kwadrat");
        System.out.println(" 2.Prostokąt");
        System.out.println(" 3.Trójkąt");
        int selectOption = in.nextInt();

        if (selectOption == 1) {
            System.out.println("Podaj długość boku:");
            double lengthOfSide = in.nextDouble();
            double areaOfSquare = lengthOfSide * lengthOfSide;
            System.out.println("Pole kwadratu: " + areaOfSquare);
        } else if (selectOption == 2) {
            System.out.println("Podaj długość boku: ");
            double lengthOfSide = in.nextDouble();
            System.out.println("Podaj szerokość boku: ");
            double widthOfSide = in.nextDouble();
            double areaOfRectangle = lengthOfSide * widthOfSide;
            System.out.println("Pole prostokąta: " + areaOfRectangle);
        } else if (selectOption == 3) {
            System.out.println("Podaj długość boku:");
            double lengthOfSide = in.nextDouble();
            System.out.println("Podaj wysokość:");
            double highOfTriangle = in.nextDouble();
            double areaOfTriangle = lengthOfSide * highOfTriangle / 2;
            System.out.println("Pole trójkata: " + areaOfTriangle);
        }

    }

}


