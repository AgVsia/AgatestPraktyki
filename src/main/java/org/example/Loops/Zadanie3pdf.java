package org.example.Loops;

import java.util.Scanner;

public class Zadanie3pdf {
    public static void main(String[] args) {
//Zmodyfikuj poprzedni program tak, aby user miał tylko 3 próby złamania hasła.

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login = in.nextLine();
        System.out.println("Podaj hasło:");
        String password = in.nextLine();
        String log = "janek123";
        String pass = "qwerty";
        for (int i = 1; i < 3; i++) {
            if (!login.equals(log) && !password.equals(pass)) {
                System.out.println("Podaj login:  " + login + " " + log);
                login = in.nextLine();
                System.out.println("Podaj hasło: " + password + " " + pass);
                password = in.nextLine();

            } else {
                System.out.println("Hasło poprawne ");

            }

        }
        System.out.println("Hasło niepoprawne!!!!:)");

    }
}

