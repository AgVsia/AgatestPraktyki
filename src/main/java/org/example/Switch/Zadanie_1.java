package org.example.Switch;

import java.util.Scanner;

public class Zadanie_1 {
    public static void main (String[]args){
        //Napisz program, który dla wczytanej przez usera cyfry, wyświetli ją słownie. Użyj instrukcji switch.
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz cyfrę (0,1,2,3,4,5,6,7,8,9)");
        int chosenNum = in.nextInt();


        switch(chosenNum){
            case 0:
                System.out.println("Wybrano cyfrę 0");
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Wybrano cyfrę 1");
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Wybrano cyfrę 2");
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Wybrano cyfrę 3");
                System.out.println("Trzy");
                break;
            case 4:
                System.out.println("Wybrano cyfrę 4");
                System.out.println("Cztery");
                break;
            case 5:
                System.out.println("Wybrano cyfrę 5");
                System.out.println("Pięć");
                break;
            case 6:
                System.out.println("Wybrano cyfrę 6");
                System.out.println("Sześć");
                break;
            case 7:
                System.out.println("Wybrano cyfrę 7");
                System.out.println("Siedem");
                break;
            case 8:
                System.out.println("Wybrano cyfrę 8");
                System.out.println("Osiem");
                break;
            case 9:
                System.out.println("Wybrano cyfrę 9");
                System.out.println("Dziewięć");
                break;
            default:
                System.out.println("Niepoprawna wartość");
                break;
        }
    }
}
