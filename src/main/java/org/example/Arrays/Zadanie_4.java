package org.example.Arrays;

public class Zadanie_4 {
    public static void main(String[] args) {
        //Utwórz tablicę stringów zawierającą twoje imię i nazwisko
        String[] nameAndSurnameLetters = new String[1];
        nameAndSurnameLetters[0] = "Agnieszka Gatak";

        System.out.println("Napisz napis z tablicy: " + nameAndSurnameLetters[0]);

        for (int i = 0; i < nameAndSurnameLetters.length; i++) {
            System.out.println("Wartość z tablicy: " + nameAndSurnameLetters[i]);
        }
        for (String letter : nameAndSurnameLetters) {
            System.out.println("Wartość z tablicy: " + letter);
        }
    }
}

