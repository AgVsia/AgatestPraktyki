package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_6 {
    public static void main(String[] args) {
        //Napisz program, który w zależności od wyboru użytkownika wczytuje ze standardowego wejścia wymiary:
        // kwadratu, prostokąta lub trójkąta i wypisuje na standardowym wyjściu pole figury o wczytanych wymiarach.

        Scanner in = new Scanner(System.in);
        System.out.println("Wymiary jakiej figury chcesz wprowadzić? Wpisz odpowiednią literę: ");
        System.out.println("a - kwadrat \nb - prostokąt \nc - trójkąt");
        char selectedOption = in.next().charAt(0);
        if (selectedOption == 'a' || selectedOption == 'A') {
            System.out.print("Podaj bok kwadratu: ");
            double squareSide = in.nextDouble();
            System.out.println("Pole kwadratu to: " + squareSide * squareSide);
        } else if (selectedOption == 'b' || selectedOption == 'B') {
            System.out.print("Podaj bok a prostokąta: ");
            double rectangleSideA = in.nextDouble();
            System.out.print("Podaj bok b prostokąta: ");
            double rectangleSideB = in.nextDouble();
            System.out.println("Pole prostokąta to: " + rectangleSideA * rectangleSideB);
        } else if (selectedOption == 'c' || selectedOption == 'C') {
            System.out.print("Podaj podstawę trójkąta: ");
            double triangleBase = in.nextDouble();
            System.out.print("Podaj wysokość trójkąta: ");
            double triangleHeight = in.nextDouble();
            System.out.println("Pole trójkąta to: " + triangleBase * triangleHeight / 2);
        } else {
            System.out.println("Wpisz a, b lub c!");
        }

    }
}
