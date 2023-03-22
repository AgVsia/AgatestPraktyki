package org.example.Loops;

public class Zadanie4 {
    public static void main(String[] args) {
        //Napisz program wyświetlający liczby naturalne parzyste od 2 do 100.
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        int i = 2;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
        int j = 2;
        do {
            System.out.println(j);
            j = j + 2;
        } while (j <= 100);
    }
}




