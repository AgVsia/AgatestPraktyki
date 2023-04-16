package org.example.Tasks.Answers.Switch;

import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        //Program dnia pewnego szkolenia wygląda następująco:
        //     8-11 wykłady,
        //     12-13 dyskusje,
        //     14 obiad,
        //     15-18 prelekcje,
        //     19 kolacja.
        //     Program mam za zadanie pobrać godzinę i wyświetlić informacje o wszystkich punktach dnia, które jeszcze będą począwszy od danej godziny.

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj godzinę: ");
        int hour = in.nextInt();
        switch (hour) {
            case 8, 9, 10, 11:
                System.out.println("wyklady");
                System.out.println("dyskusje");
                System.out.println("obiad");
                System.out.println("prelekcje");
                System.out.println("kolacja");
                break;
            case 12, 13:
                System.out.println("dyskusje");
                System.out.println("obiad");
                System.out.println("prelekcje");
                System.out.println("kolacja");
                break;
            case 14:
                System.out.println("obiad");
                System.out.println("prelekcje");
                System.out.println("kolacja");
                break;
            case 15, 16, 17, 18:
                System.out.println("prelekcje");
                System.out.println("kolacja");
                break;
            case 19:
                System.out.println("kolacja");
                break;
            default:
                System.out.println("Błędna godzina");
        }
    }
}