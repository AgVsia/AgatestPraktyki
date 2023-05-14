package org.example.Functions;

public class Zadanie_8 {
    public static void main(String[] args) {
        //Napisz funkcję, która przyjmuje w parametrze String'a i zwraca liczbę słów w tym String'u.

        String phrase = "Agnieszka jest mila";
        int numberOfWords = amount(phrase);
        System.out.println("Liczba słów: " + numberOfWords);
        //System.out.println(amonut("Ala ma kota"));
        //        System.out.println(amonut("Ala   ma kota"));
        //        System.out.println(amonut("Ala   ma kota "));
        //        System.out.println(amonut(" Ala   ma kota "));
        //        System.out.println(amonut(" "));
        //        System.out.println(amonut(""));
        //      System.out.println(amonut("  "));
        //     System.out.println(amonut("  Ala   ma kota  "));
        //   System.out.println(amonut("a"));
        // System.out.println(amonut("aaaa"));
    }

    public static int amount(String phrase) {
        int numberOfWords = 0;
        if (phrase.length() == 0) {
            return 0;
        } else if (phrase.length() == 1 && phrase.charAt(0) == ' ') {
            return 0;
        } else if (phrase.charAt(0) != ' ') {
            numberOfWords++;
        }
        for (int i = 0; i < phrase.length() - 1; i++) {
            if (phrase.charAt(i) == ' ') {
                numberOfWords++;
            } else if (phrase.charAt(i) == ' ' && phrase.charAt(i + 1) != ' ') {
                numberOfWords++;
            }
        }
        return numberOfWords;

    }

}
