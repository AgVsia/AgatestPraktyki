package org.example.Loops;

public class Zadanie1 {
    public static void main(String[] args) {
        //Napisz program, który wypisze na standardowym wyjściu twoje imię 10 razy, w dziesięciu osobnych wierszach.
        // (Użyj pętli for, while i do...while)

        for (int i = 0; i < 10; i++) {
            System.out.println("Agnieszka z pętli for.Licznik:" + i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println("Agnieszka z pętli while.Licznik:" + i);
            i++;
        }
        int j = 0;
        do {
            System.out.println("Agnieszka z pętli do while.Licznik:" + j);
            j ++;
        } while (j < 10);

    }
}
