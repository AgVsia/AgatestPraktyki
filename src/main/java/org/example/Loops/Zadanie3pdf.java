package org.example.Loops;

import java.util.Scanner;

public class Zadanie3pdf {
    public static void main(String[] args) {
//Zmodyfikuj poprzedni program tak, aby user miał tylko 3 próby złamania hasła.
        Scanner in = new Scanner(System.in);
        System.out.println("1 próba Podaj login: ");
        String Login1 = in.nextLine();
        System.out.println("1 próba Podaj hasło:");
        String Password1 = in.nextLine();
        System.out.println("2 próba Podaj login: ");
        String Login2 = in.nextLine();
        System.out.println("2 próba Podaj hasło:");
        String Password2 = in.nextLine();
        System.out.println("3 próba Podaj login: ");
        String Login3 = in.nextLine();
        System.out.println("3 próba Podaj hasło:");
        String Password3 = in.nextLine();
        String Log = "janek123";
        String Pass = "qwerty";

        for (int i = 0; i <= 0; i++) {

            if (Login1 != Log || Password1 == Pass) {

            } else if (Login2 != Log && Password2 != Pass) {

            } else if (Login3 == Log || Password3 != Pass) {

            }
            System.out.println("Blokada hasła po 3 nieudanych próbach!!!!:)P");
        }

        System.out.println("1 próba Podaj login: ");
        String LoginA = in.nextLine();
        System.out.println("1 próba Podaj hasło:");
        String PasswordA = in.nextLine();
        System.out.println("2 próba Podaj login: ");
        String LoginB = in.nextLine();
        System.out.println("2 próba Podaj hasło:");
        String PasswordB = in.nextLine();
        System.out.println("3 próba Podaj login: ");
        String LoginC = in.nextLine();
        System.out.println("3 próba Podaj hasło:");
        String PasswordC = in.nextLine();
        String Log1 = "janek123";
        String Pass1 = "qwerty";
        int i = 0;
        while (i <= 0) {
            if (LoginA != Log1 || PasswordA == Pass1) {

            } else if (LoginB != Log1 && PasswordB != Pass1) {

            } else if (LoginC == Log || PasswordC != Pass) {

            }
            i++;
            System.out.println("Blokada hasła po 3 nieudanych próbach!!!!:)P");
        }
        System.out.println("1 próba Podaj login: ");
        String LoginI = in.nextLine();
        System.out.println("1 próba Podaj hasło:");
        String PasswordI = in.nextLine();
        System.out.println("2 próba Podaj login: ");
        String LoginII = in.nextLine();
        System.out.println("2 próba Podaj hasło:");
        String PasswordII = in.nextLine();
        System.out.println("3 próba Podaj login: ");
        String LoginIII = in.nextLine();
        System.out.println("3 próba Podaj hasło:");
        String PasswordIII = in.nextLine();
        String LogI = "janek123";
        String PassI = "qwerty";
        int j = 0;
        do {
            if (LoginI != LogI || PasswordI == PassI) {

            } else if (LoginII != LogI && PasswordII != PassI) {

            } else if (LoginIII == LogI || PasswordIII != PassI) {

            }
            j++;
            System.out.println("Blokada hasła po 3 nieudanych próbach!!!!:)P");
        } while (j <= 0);
    }
}

