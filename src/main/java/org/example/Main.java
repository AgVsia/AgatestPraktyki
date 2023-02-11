package org.example;

public class Main {
    public static void main(String[] args) {
        //Zadanie1 Wyświetl na wyjściu napis "Hello World"
        System.out.println("Hello World");

        //Zadanie2 Wyswietl swoje imie i nazwisko w osobnych wierszach
        System.out.println("Agnieszka");
        System.out.println("Gatak");

        //Zadanie3 Wyswietl swoja date urodzenia
        System.out.println("14.10.1988");

        int var; //deklaracja zmienej
        var = 10; //inicjalizacja zmiennej

        float varFloat = 3.99F;
        double varDouble = 3.99;
        System.out.println(3.99);

        char varChar = 'A';

        boolean varBoolean = false;

        System.out.println(varFloat);

        final int VAR_INT = 10;

        System.out.println(10 + 3);
        System.out.println(10 > 9);

        String varString1 = "Hej!";
        String varString2 = "Adam";
        System.out.println(varString1 + " " + varString2);
        System.out.println(varString1.charAt(0));
        char firstLetter = varString1.charAt(0);
        System.out.println(firstLetter);

    }
}