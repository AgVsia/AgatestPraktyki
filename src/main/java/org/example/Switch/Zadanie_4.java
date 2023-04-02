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

        if(hour>=8&& hour<=19) {
            System.out.println("Prawidłowy przedział godzinowy");

        }else {
            System.out.println("Nieprawidłowa wartość");

            System.out.println(("Wybierz opcje: 1,2,3,4,5"));

        }

    }
}