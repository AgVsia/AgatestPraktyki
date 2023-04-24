package org.example.Functions;

public class Zadanie_13 {
    public static void main(String[] args) {
        //Napisz funkcję, która otrzymuje dwa napisy i zwraca 1, jeśli są jednakowe, a w przeciwnym razie zwraca 0.
        String subtitle1 = "Testerka";
        String subtitle2 = "Testerka";
        char correctSubtitles = '1';
        char incorrectSubtitles = '0';
        char num = subtitles(subtitle1, subtitle2,correctSubtitles,incorrectSubtitles);
    }

    public static char subtitles(String subtitle1, String subtitle2,char correctSubtitles, char incorrectSubtitles) {
        if (subtitle1 == subtitle2) {
            System.out.println("Ta metoda zwraca: "+ correctSubtitles );
            return correctSubtitles;
        } else {
            System.out.println("Ta metoda zwraca: " + incorrectSubtitles);
            return incorrectSubtitles;
        }
    }
}
