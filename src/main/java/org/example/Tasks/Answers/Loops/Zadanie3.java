package org.example.Tasks.Answers.Loops;

public class Zadanie3 {
    public static void main(String[] args) {
        //Napisz program wyświetlający 10 początkowych liczb naturalnych zaczynając od 1. (Użyj pętli for, while i do...while)
        for (int i = 1; i < 10; i++) System.out.print(i);

        System.out.println();

        int i = 1;
        while (i < 10) {
            System.out.print(i);
            i++;
        }

        System.out.println();

        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j < 10);

    }
}
