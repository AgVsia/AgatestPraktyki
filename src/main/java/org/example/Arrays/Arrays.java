package org.example.Arrays;

public class Arrays {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "Ola";
        names[1] = "Tomek";

        int[] numbers = new int[10];
        System.out.println("Rozmiar tablicy: " + numbers.length);
        //nadajemy wartość w tablicy
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Wartość numbers["+i+"] = " + i);
            numbers[i] = i;
        }

        //wyświetlamy zawartość tablicy
        for (int number : numbers) {
            System.out.println("Wartość z tablicy: " + number);
        }

        //System.out.println("Najpiękniejsze imię na świecie: " + args[0]);
    }
}
