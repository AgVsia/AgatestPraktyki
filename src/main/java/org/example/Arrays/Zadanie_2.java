package org.example.Arrays;

public class Zadanie_2 {
    public static void main(String[] args) {
        //Utwórz tablicę znaków zawierającą słowo "Dom". Wyświetl znaki zawarte w tablicy w odwrtonej kolejności. (zrób to na dwa sposoby, ręcznie i pętlą)
        char[] houseLetters = new char[3];
        houseLetters[0] = 'm';
        houseLetters[1] = 'o';
        houseLetters[2] = 'D';
        System.out.println("Napisz nasze słowo: " + houseLetters[0] + houseLetters[1] + houseLetters[2]);

        for (int i = 0; i < houseLetters.length; i++) {
            System.out.println("Wartość houseLetters [" + i + "] = " + houseLetters[i]);
        }
        for (char letter : houseLetters) {
            System.out.println("Wartość houseLetters: " + letter);
        }
    }
}
