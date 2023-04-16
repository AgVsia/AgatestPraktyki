package org.example.Switch;

import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        //Program dnia pewnego szkolenia wygląda następująco:
        //     8-11 wykłady,
        //     12-13 dyskusje,
        //     14 obiad,
        //     15-18 prelekcje,
        //     19 kolacja.
        //     Program mam za zadanie pobrać godzinę i wyświetlić informacje o wszystkich
        //     punktach dnia, które jeszcze będą począwszy od danej godziny.
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj godzinę");
        int hour = in.nextInt();

        switch (hour) {
            case 8, 9, 10, 11:
                System.out.println("Wykłady,dyskusje,obiad,prelekcje,kolacja");
                break;
            case 12, 13:
                System.out.println("Dyskusje,obiad,prelekcje,kolacja");
                break;
            case 14:
                System.out.println("Obiad,prelekcje,kolacja");
                break;
            case 15, 16, 17, 18:
                System.out.println("Prelekcje,kolacja");
                break;
            case 19:
                System.out.println("Kolacja");
                break;
            default:
                System.out.println("Nieprawidłowa godzina");
        }
    }
}