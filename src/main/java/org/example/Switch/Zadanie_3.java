package org.example.Switch;

import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[]args){
        //Napisz program, który wczytuje od usera kwotę w złotych,
        // a następnie przelicza ją na taka walutę, jaką wybierze użytkownik: funty, dolary, euro.
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kwotę w zł");
        double value=in.nextDouble();
        double valueOfUsd= value*4.32;
        double valueOfEuro = value*4.69;
        double valueOfFunt= value* 5.33;
        System.out.println(("Wybierz walutę na którą chcesz przeliczyć podaną kwotę 1.funty,2.dolary,3.euro"));
        int choice= in.nextInt();
        switch(choice){
            case 1:
                System.out.println("Wybrano 1");
                System.out.println(valueOfFunt);
                break;
            case 2:
                System.out.println("Wybrano 2");
                System.out.println(valueOfUsd);
                break;
            case 3:
                System.out.println("Wybrano 3");
                System.out.println(valueOfEuro);
            default:
                System.out.println("Nieprawidłowa wartość");
        }
    }
}
