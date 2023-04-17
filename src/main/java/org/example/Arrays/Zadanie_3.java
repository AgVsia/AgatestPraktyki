package org.example.Arrays;

public class Zadanie_3 {
    public static void main(String[] args) {
        //Utwórz tablicę zawierającą wszystkie cyfry 0-9 (zrób to na dwa sposoby, ręcznie i pętlą)
        int[] numbers = new int[10];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;
        System.out.println("Wypisz liczby z tablicy: " + numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3] + "," + numbers[4] + "," + numbers[5] + "," + numbers[6] + "," + numbers[7] + "," + numbers[8] + "," + numbers[9]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Wartość numbers[" + i + "]=" + numbers[i]);
        }
        for (int number : numbers) {
            System.out.println("Wartość numbers: " + number);
        }
    }
}
