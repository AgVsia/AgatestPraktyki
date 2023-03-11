package org.example.Tasks.Answers.IfElse;

import java.util.Scanner;

public class Zadanie6_5 {
    public static void main(String[] args) {
        //Napisz program obliczający pole trójkąta na podstawie wymiarów podanych przez użytkownika.
        // Użytkownik powinien mieć możliwość podania długości podstawy i wysokości lub wszystkich boków trójkąta.

        Scanner in = new Scanner(System.in);
        System.out.println("a - długość podstawy i wysokości");
        System.out.println("b - długość wszystkich boków trójkąta");
        System.out.print("Jakie dane chcesz podać? Wpisz odpowiednią literę: ");
        char selectedOption = in.next().charAt(0);
        if (selectedOption == 'a' || selectedOption == 'A') {
            System.out.print("Podaj długość podstawy: ");
            double triangleBase = in.nextDouble();
            System.out.print("Podaj wysokość trójkąta: ");
            double triangleHeight = in.nextDouble();
            System.out.println("Pole trójkąta: " + triangleBase * triangleHeight / 2);
        } else if (selectedOption == 'b' || selectedOption == 'B') {
            System.out.print("Podaj długość pierwszego boku: ");
            double firstSide = in.nextDouble();
            System.out.print("Podaj długość drugiego boku: ");
            double secondSide = in.nextDouble();
            System.out.print("Podaj długość trzeciego boku: ");
            double thirdSide = in.nextDouble();
            double perimeterOfTriangle = firstSide + secondSide + thirdSide;
            double p = perimeterOfTriangle / 2;
            System.out.println("Pole trójkąta: " + Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide)));
        } else {
            System.out.println("Wpisz a lub b!");
        }
    }
}
