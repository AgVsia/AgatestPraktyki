package org.example.Switch;

import java.util.Scanner;

public class Zadanie_4pdf {
    public static void main(String[] args) {
        /* Przy założeniu, że zmienna s jest typu int a zmienna ocena typu char instrukcję
        warunkową zamień na równoważną instrukcję switch
        if (s <= 10 && s >= 0) {
            if (s == 10 || s == 9) {
                ocena = 'A';
            } else if (s == 8 || s == 7) {
                ocena = 'B';
            } else if (s == 6 || s == 5) {
                ocena = 'C';
            } else {
                ocena = 'E';
            }
        } else {
          System.out.println("niepoprawne dane");
       */
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int result = in.nextInt();

        switch (result) {
            case 9, 10:
                System.out.println("Ocena \'A\'");
                break;
            case 7, 8:
                System.out.println("Ocena \'B\'");
                break;
            case 5, 6:
                System.out.println("Ocena \'C\'");
                break;
            case 0, 1, 2, 3, 4:
                System.out.println("Ocena \'E\'");
                break;
            default:
                System.out.println("Wartość poza zakresem: ");
        }
    }
}
