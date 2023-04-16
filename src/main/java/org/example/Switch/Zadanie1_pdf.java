package org.example.Switch;

import java.util.Scanner;

public class Zadanie1_pdf {
    public static void main(String[] args) {
        //Załóżmy, że zmienna punkty jest typu całkowitego. Zapisz poniższą selekcję w
        //postaci równoważnej instrukcji switch.
        //if (punkty > 10 || punkty < 0) System.out.println("Bledne dane");
        //else if (punkty > 9) oc = 'A';
        //else if (punkty > 8) oc = 'B';
        //else if (punkty > 7) oc = 'C';
        //else if (punkty > 5) oc = 'D';
        //else oc = 'E';

        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą: ");
        int score = in.nextInt();

        switch (score) {
            case 10:
                System.out.println("Ocena \'A\'");
                break;
            case 9:
                System.out.println("Ocena \'B\'");
                break;
            case 8:
                System.out.println("Ocena \'C\'");
                break;
            case 6, 7:
                System.out.println("Ocena \'D\'");
                break;
            case 5, 4, 3, 2, 1, 0:
                System.out.println("Ocena \'E\'");
                break;
            default:
                System.out.println("Nieprawidłowa wartość");

        }
    }
}
