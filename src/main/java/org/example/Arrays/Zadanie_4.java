package org.example.Arrays;

public class Zadanie_4 {
    public static void main(String[] args) {
        //Utwórz tablicę stringów zawierającą twoje imię i nazwisko
        char[] nameAndSurnameLetters = new char[15];
        nameAndSurnameLetters[0] = 'A';
        nameAndSurnameLetters[1] = 'g';
        nameAndSurnameLetters[2] = 'n';
        nameAndSurnameLetters[3] = 'i';
        nameAndSurnameLetters[4] = 'e';
        nameAndSurnameLetters[5] = 's';
        nameAndSurnameLetters[6] = 'z';
        nameAndSurnameLetters[7] = 'k';
        nameAndSurnameLetters[8] = 'a';
        nameAndSurnameLetters[9] = ' ';
        nameAndSurnameLetters[10] = 'G';
        nameAndSurnameLetters[11] = 'a';
        nameAndSurnameLetters[12] = 't';
        nameAndSurnameLetters[13] = 'a';
        nameAndSurnameLetters[14] = 'k';
        System.out.println("Napisz napis z tablicy: " + nameAndSurnameLetters[0] + nameAndSurnameLetters[1] + nameAndSurnameLetters[2] + nameAndSurnameLetters[3] + nameAndSurnameLetters[4] + nameAndSurnameLetters[5] + nameAndSurnameLetters[6] + nameAndSurnameLetters[7] + nameAndSurnameLetters[8] + nameAndSurnameLetters[9] + nameAndSurnameLetters[10] + nameAndSurnameLetters[11] + nameAndSurnameLetters[12] + nameAndSurnameLetters[13] + nameAndSurnameLetters[14]);

        for (int i = 0; i < nameAndSurnameLetters.length; i++) {
            System.out.println("Wartość z tablicy: " + nameAndSurnameLetters[i]);
        }
        for (char letter : nameAndSurnameLetters) {
            System.out.println("Wartość z tablicy: " + letter);
        }
    }
}

