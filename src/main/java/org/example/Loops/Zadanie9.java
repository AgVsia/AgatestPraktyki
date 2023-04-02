package org.example.Loops;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        //Napisz program, który pobierze od użytkownika liczbę naturalną n,
        // następnie pobierze n liczb całkowitych i wyświetli w konsoli liczbę najmniejszą i największą wpisaną przez użytkownika.
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");
        int num = in.nextInt();
        System.out.println(" Podaj zadeklarowane liczby: ");
        int numMin = 0;
        int numMax = 0;
        int amount;
        for (int i = 1; i <= num; i++) {
            System.out.println("Indeks:" + i);
            amount = in.nextInt();
            if (numMin >= amount || numMin == 0) {// zadeklarowałam pierwszą liczbę jako minimalą aby sie do niej odniesc
                numMin = amount;
            }
            if (numMax <= amount) {
                numMax = amount;
            }
        }
        System.out.println("Nasze min: " + numMin);
        System.out.println("Nasze max: " + numMax);

        System.out.println("Podaj liczbę dodatnią: ");
        int num1 = in.nextInt();
        System.out.println(" Podaj zadeklarowane liczby: ");
        int numMin1 = 0;
        int numMax1 = 0;
        int amount1;
        int i = 1;
        while (i <= num1) {
            amount1 = in.nextInt();
            if (numMin1 >= amount1 || numMin1 == 0) {
                numMin1 = amount1;
            }
            if (numMax1 <= amount1) {
                numMax1 = amount1;
            }

            i++;
        }
        System.out.println("nasze min: " + numMin1);
        System.out.println("nasze max: " + numMax1);

        System.out.println("Podaj liczbę dodatnią: ");
        int num2 = in.nextInt();
        System.out.println(" Podaj zadeklarowane liczby: ");
        int numMin2 = 0;
        int numMax2 = 0;
        int amount2;
        int j = 1;
        do {
            amount2 = in.nextInt();
            if (numMin2 >= amount2 || numMin2 == 0) {
                numMin2 = amount2;
            }
            if (numMax2 <= amount2) {
                numMax2 = amount2;
            }
            j++;
        } while (j <= num2);
        System.out.println("Nasze min: " + numMin2);
        System.out.println("Naszme max: " + numMax2);
    }

}

