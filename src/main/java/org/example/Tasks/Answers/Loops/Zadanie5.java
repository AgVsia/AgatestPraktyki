package org.example.Tasks.Answers.Loops;

public class Zadanie5 {
    public static void main(String[] args) {
        //Napisz program wyświetlający liczby naturalne parzyste od 100 do 2.
        for (int i = 100; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int i = 100;
        while (i >= 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        System.out.println();

        int j = 100;
        do {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j--;
        } while (j >= 2);

    }
}
