package org.example.Loops;

public class Zadanie5 {
    public static void main(String[] args) {
        //Napisz program wyświetlający liczby naturalne parzyste od 100 do 2.

        for (int i = 100; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int i = 100;
        if (i % 2 == 0) {
            while (i >= 2) {
                System.out.println(i);
                i--;
            }
        }
        int j = 100;
        do {
            if (j % 2 == 0)
                System.out.println(j);
            j--;
        } while (j >= 2);
    }
}


