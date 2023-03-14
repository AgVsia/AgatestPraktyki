package org.example.Conditions;

import java.util.Scanner;

public class Zadanie2_7pdf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Napisz program, który wczyta od użytkownika jego wzrost h (w m) oraz masę m (w
        //kg). Program ma obliczyć indeks masy ciała (BMI) według wzoru: BMI = m/h2.
        //Program ma wypisać wynik na ekranie, a następnie wyświetlić informację o wadze
        //ciała użytkownika według reguły:
        //Dla BMI ≤ 18.5 program ma wyświetlić komunikat „niedowaga”,
        //Dla 18.5 < BMI ≤ 25 program ma wyświetlić komunikat „prawidłowa waga”,
        //Dla 25 < BMI ≤ 30 program ma wyświetlić komunikat „lekka nadwaga”,
        //Dla 30 < BMI program ma wyświetlić komunikat „nadwaga”.
        System.out.println("Wpisz wzrost w [m]:");
        double high = in.nextDouble();
        System.out.println("Wpisz wagę w [kg]:");
        double weigh = in.nextDouble();
        double valueOfBMI = weigh / (high * high);
        if (valueOfBMI > 30) {
            System.out.println("Nadwaga: " + valueOfBMI);
        } else if (valueOfBMI > 25 && valueOfBMI <= 30) {
            System.out.println("Lekka nadwaga: " + valueOfBMI);
        } else if (valueOfBMI > 18.5 && valueOfBMI <= 25) {
            System.out.println("Prawidłowa waga: " + valueOfBMI);
        } else if (valueOfBMI <= 18.5) {
            System.out.println("Niedowaga: " + valueOfBMI);
        }
    }
}


