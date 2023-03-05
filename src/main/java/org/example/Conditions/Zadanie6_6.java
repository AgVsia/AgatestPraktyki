package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_6 {
    public static void main(String[]args ){
        Scanner in = new Scanner(System.in);
        //Napisz program, który w zależności od wyboru użytkownika wczytuje ze standardowego wejścia wymiary: kwadratu, prostokąta lub trójkąta i wypisuje na standardowym wyjściu pole figury o wczytanych wymiarach.
        System.out.println("Podaj liczbę całkowitą: ");
        int lengthOfSide = in.nextInt();
        int lengthOfSide2 = in.nextInt();
        int lengthOfSide3 = in.nextInt();
        int widthOfSide = in.nextInt();
        int lengthOfHigh = in.nextInt();
        int squareArea = lengthOfSide * lengthOfSide;
        int rectangleArea = lengthOfSide * widthOfSide;
        int triangleArea = lengthOfSide * lengthOfHigh /2;
        if (lengthOfSide ==2){
            System.out.println("Pole kwadratu:" + squareArea);
        } else if(lengthOfSide2 == 4 && widthOfSide ==12){
            System.out.println("Pole prostokąta:" + rectangleArea);
        } else if (lengthOfSide3 ==7 && lengthOfHigh ==9){
            System.out.println("Pole trójkąta:" + triangleArea);
        }

    }

}
