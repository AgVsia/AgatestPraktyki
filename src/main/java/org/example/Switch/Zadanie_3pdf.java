package org.example.Switch;

import java.util.Scanner;

public class Zadanie_3pdf {
    public static void main (String[]args){
        //Przy założeniu, że zmienna status jest typu int instrukcję warunkową zamień na
        //równoważną instrukcję switch:
        //if (status < 0) {
        //if (status == -1) {
        //System.out.println("Wystąpił błąd");
        //} else {
        //System.out.println("Podano błędne dane");
        //}
        //} else {
        //if (status == 1) {
        //System.out.println("Operacja zakończona pomyślnie");
        //} else {
        //System.out.println("Podano błędne dane");
        //}
        //}
        Scanner in= new Scanner(System.in);
        System.out.println(("Wybierz cyfrę: -1,1"));
        int choice=in.nextInt();

        switch(choice){
            case -1:
                System.out.println("Wybrano -1");
                System.out.println("Wystąpił błąd");
                break;
            case 1:
                System.out.println("Wybrano 1");
                System.out.println("Operacja zakończona pomyślnie");
                break;
            default:
                System.out.println("Podano błędne dane");
        }

    }
}