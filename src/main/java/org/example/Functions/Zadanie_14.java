package org.example.Functions;

import static org.example.Functions.Zadanie_7.average;

public class Zadanie_14 {
    public static void main(String[] args) {
        //Napisz funkcję, która dostaje jako argumenty: tablicę liczb całkowitych oraz jej rozmiar i
        // zwraca jako wartość średnią arytmetyczną wartości elementów tablicy.
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 8;
        numbers[3] = 6;
        int averageOfNumbers= average(numbers);
        System.out.println("Rozmiar tablicy:" + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Wartość numbers[" + i + "]=" + numbers[i]);
            numbers[i] = i;

        }
        public static int average(int numbers){

        }
    }


}
