package org.example.Tasks.Answers.Loops;

public class Zadanie4 {
    public static void main(String[] args) {
        //Napisz program wyświetlający liczby naturalne parzyste od 2 do 100.
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int i = 2;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        int j = 2;
        do {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 100);

    }
}
