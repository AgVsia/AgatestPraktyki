package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        //Napisz program, który wczyta od usera dwie liczby, a następnie w zależności od wyboru usera wypiszę: sumę, różnicę, iloraz, iloczyn.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int x = in.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int y = in.nextInt();

        System.out.println("Co chcesz zrobić z tymi liczbami? Wpisz odpowiedni operator: +, -, *, /");
        char operator = in.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Nie można dzielić przez zero!");
                    break;
                }
                System.out.println(x / y);
                break;
            default:
                System.out.println("Nierozpoznany znak! Wpisz: +, -, * lub /");
                break;

        }
    }
}
