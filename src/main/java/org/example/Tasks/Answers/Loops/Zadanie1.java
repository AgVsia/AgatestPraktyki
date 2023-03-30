package org.example.Tasks.Answers.Loops;

public class Zadanie1 {
    public static void main(String[] args) {
        //Napisz program, który wypisze na standardowym wyjściu twoje imię 10 razy, w dziesięciu osobnych wierszach. (Użyj pętli for, while i do...while)

        for (int i = 0; i < 10; i++) System.out.println("Agnieszka");

        int i = 0;
        while (i < 10) {
            System.out.println("Agnieszka");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Agnieszka");
            j++;
        } while (j < 10);

    }
}
