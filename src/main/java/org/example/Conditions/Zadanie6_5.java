package org.example.Conditions;

import java.util.Scanner;

public class Zadanie6_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program obliczający pole trójkąta na podstawie wymiarów podanych przez użytkownika. Użytkownik powinien mieć możliwość podania długości podstawy i wysokości lub wszystkich boków trójkąta.
        System.out.println("Podaj wymiary trójkąta: ");
        double lengthOfTriangle1 = in.nextDouble();
        double highOfTriangle = in.nextDouble();
        double lengthOfTriangle2 = in.nextDouble();
        double lengthOfTriangle3 = in.nextDouble();
        double triangleArea = lengthOfTriangle1 * highOfTriangle / 2;
        double triangleArea2 = lengthOfTriangle1 * lengthOfTriangle2 * lengthOfTriangle3/2;// pole wzór sama wymysliłam <LOL2>
    if (lengthOfTriangle1 >0 && highOfTriangle >0){
            System.out.println("Pole trójkąta mając długość i wysokość: " + triangleArea);
    } else if (lengthOfTriangle1 >0 && lengthOfTriangle2 >0 && lengthOfTriangle3 >0);
            System.out.println("Pole trójkąta mając boki trójkąta: " + triangleArea2);
    }
    }


