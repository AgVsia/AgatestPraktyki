package org.example.Conditions;

import java.util.Scanner;
// do pętlii
public class Zadanie2_6pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który pobierze od użytkownika dwie liczby całkowite n i m (zakładamy, że n < m).
        // Program ma wyświetlić wszystkie liczby z przedziału domkniętego [n; m], które są podzielne przez 3 lub podzielne przez 5.
        System.out.println("Liczby z przedziału dokmniętego [n;m]: 3-150: ");
        System.out.println("Podaj pierwszą liczbę całkowitą n : ");
        int numN = in.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą m : ");
        int numM = in.nextInt();
        if (numN < numM && numN % 3 == 0 || numN < numM && numN % 5 == 0) {
            System.out.println("Liczby z przedziału podzilene przez 3 lub przez 5: " + numN);
        } else if (numN < numM && numM % 3 == 0 || numN < numM && numM % 5 == 0) {
            System.out.println("Liczby z prezdziału podzielne przez 5: " + numM);
        } else {
            System.out.println("Liczby z poza przedziału!!");
        }
    }
}


