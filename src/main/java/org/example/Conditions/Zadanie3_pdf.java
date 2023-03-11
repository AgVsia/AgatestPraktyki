package org.example.Conditions;

import java.util.Scanner;

public class Zadanie3_pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisać program, który sprawdza, czy podana przez użytkownika liczba całkowita jest poprawnym numerem miesiąca.
        System.out.println("Wybierz liczbę odpowiadającą danemu miesiącowi: ");
        System.out.println("1.Styczeń");
        System.out.println("2.Luty");
        System.out.println("3.Marzec");
        System.out.println("4.Kwiecień");
        System.out.println("5.Maj");
        System.out.println("6.Czerwiec");
        System.out.println("7.Lipiec");
        System.out.println("8. Sierpień");
        System.out.println("9.Wrzesień");
        System.out.println("10.Październik");
        System.out.println("11.Listopad");
        System.out.println("12.Grudzień");
        int selectOption = in.nextInt();
        if (selectOption == 1) {
            System.out.println("Styczeń");
        } else if (selectOption == 2) {
            System.out.println("Luty");
        } else if (selectOption == 3) {
            System.out.println("Marzec");
        } else if (selectOption == 4) {
            System.out.println("Kwiecień");
        } else if (selectOption == 5) {
            System.out.println("Maj");
        } else if (selectOption == 6) {
            System.out.println("Czerwiec");
        } else if (selectOption == 7) {
            System.out.println("Lipiec");
        } else if (selectOption == 8) {
            System.out.println("Sierpień");
        } else if (selectOption == 9) {
            System.out.println("Wrzesień");
        } else if (selectOption == 10) {
            System.out.println("Październik");
        } else if (selectOption == 11) {
            System.out.println("Listopad");
        } else if (selectOption == 12){
            System.out.println("Grudzień");
        }else{
            System.out.println("Nieprawidłowa wartość miesiąca");
        }
    }
}
