package org.example.Loops;

public class Zadanie3 {
    public static void main(String[] args) {
//Napisz program wyświetlający 10 początkowych liczb naturalnych zaczynając od 1. (Użyj pętli for, while i do...while)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
