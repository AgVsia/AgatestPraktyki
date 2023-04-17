package org.example.Arrays;

public class Zadanie_1 {
    public static void main(String[] args) {
        //Utwórz tablicę znaków zawierającą napis "Dzień dobry" i wyświetl ten napis w konsoli. (zrób to na dwa sposoby, ręcznie i pętlą)
        char[] goodMorningLetters = new char[11];
        goodMorningLetters[0] = 'D';
        goodMorningLetters[1] = 'z';
        goodMorningLetters[2] = 'i';
        goodMorningLetters[3] = 'e';
        goodMorningLetters[4] = 'ń';
        goodMorningLetters[5] = ' ';
        goodMorningLetters[6] = 'd';
        goodMorningLetters[7] = 'o';
        goodMorningLetters[8] = 'b';
        goodMorningLetters[9] = 'r';
        goodMorningLetters[10] = 'y';
        System.out.println("Nasz napis z tablicy: " + goodMorningLetters[0] + goodMorningLetters[1] + goodMorningLetters[2] + goodMorningLetters[3] + goodMorningLetters[4] + goodMorningLetters[5] + goodMorningLetters[6] + goodMorningLetters[7] + goodMorningLetters[8] + goodMorningLetters[9] + goodMorningLetters[10]);


        for (int i = 0; i < goodMorningLetters.length; i++) {
            System.out.println("Zawartość goodMorningLetters [" + i + "]=" + goodMorningLetters[i]);

        }
        for (char letter : goodMorningLetters) {
            System.out.println("Wartość tablicy: " + letter);
        }
    }
}
