package org.example.Loops;

public class Zadanie2 {
    public static void main(String[] args) {
        //Napisz program, który wypisze na standardowym wyjściu twoje imie 10 razy,
        // w jednej linii oddzielone spacjami. (Użyj pętli for, while i do...while)

        for (int i = 0; i < 10; i++) {
            System.out.print(" " +"Agnieszka for.Licznik" + " " + i);
        }
        System.out.println();
        int i = 0;
        while (i < 10) {
            System.out.print(" " +"Agnieszka while.Licznik" + " " + i);
            i++;
        }
        System.out.println();
        int j =0;
        do{
            System.out.print(" " + "Agnieszka do while.Licznik" + " " + j);
            j++;
        }while(j<10);
    }
}

