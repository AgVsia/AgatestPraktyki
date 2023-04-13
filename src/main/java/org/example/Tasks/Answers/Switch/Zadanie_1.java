package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        //Napisz program, który dla wczytanej przez usera cyfry, wyświetli ją słownie. Użyj instrukcji switch.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj cyfrę: ");
        int n = in.nextInt();

        switch (n) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("JEDEN");
                break;
            case 2:
                System.out.println("DWA");
                break;
            case 3:
                System.out.println("TRZY");
                break;
            case 4:
                System.out.println("CZTERY");
                break;
            case 5:
                System.out.println("PIĘĆ");
                break;
            case 6:
                System.out.println("SZEŚĆ");
                break;
            case 7:
                System.out.println("SIEDEM");
                break;
            case 8:
                System.out.println("OSIEM");
                break;
            case 9:
                System.out.println("DZIEWIĘĆ");
                break;
            default:
                System.out.println("Złe dane na wejściu!");
                break;

        }
    }
}
