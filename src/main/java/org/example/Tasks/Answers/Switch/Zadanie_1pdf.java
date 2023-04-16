package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_1pdf {
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
        System.out.print("Podaj wynik: ");
        int s = in.nextInt();

        switch (s) {
            case 10:
                System.out.println("Ocena A");
            case 9:
                System.out.println("Ocena B");
                break;
            case 8:
                System.out.println("Ocena C");
                break;
            case 6:
                System.out.println("Ocena D");
                break;
            case 5, 4, 3, 2, 1, 0:
                System.out.println("Ocena E");
                break;
            default:
                System.out.println("Niepoprawce dane");
        }
    }
}
