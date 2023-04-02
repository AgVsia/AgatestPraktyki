package org.example.Switch;

import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        //Napisz program, który wczyta od usera dwie liczby, a następnie w zależności od wyboru usera wypiszę:
        // sumę, różnicę, iloraz, iloczyn.
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double firstNum = in.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double secondNum = in.nextDouble();

        System.out.println(("Wybierz działanie: 1.dodawanie,2.odejmowanie,3.mnożenie,4.dzielenie"));
        int choice = in.nextInt();

        double addNum = firstNum + secondNum;
        double substructNum = firstNum - secondNum;
        double multiplyNum = firstNum * secondNum;
        double divideNum = firstNum / secondNum;


        if (choice == 4) {
            boolean denominator = secondNum == 0;
            divideNum = firstNum / secondNum;
            System.out.println("Nie dziel przez zero");
        }

            switch (choice) {
                case 1:
                    System.out.println("Wybrano 1");
                    System.out.println(addNum);
                    break;
                case 2:
                    System.out.println("Wybrano 2");
                    System.out.println(substructNum);
                    break;
                case 3:
                    System.out.println("Wybrano 3");
                    System.out.println(multiplyNum);
                    break;
                case 4:
                    System.out.println("Wybrano 4");

                    System.out.println(divideNum);
                    break;


            }
        }
    }

