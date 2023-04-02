package org.example.Loops;

import java.util.Scanner;

public class Zadanie2_pdf {
    public static void main(String[] args) {
        //Napisz program służący do weryfikacji haseł, który pobiera od użytkownika login i hasło aż
        //do momentu, gdy wpisane dane umożliwią dostęp do systemu. Zdefiniuj w programie login i
        //hasło np:
        //String login = “janek123”
        //String password = “qwerty”

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login = in.nextLine();
        System.out.println("Podaj hasło:");
        String password = in.nextLine();
        String log = "janek123";
        String pass = "qwerty";
        for (; !login.equals(log) && !password.equals(pass); ) {
            System.out.println("Podaj login:  " + login + " " + log);
            login = in.nextLine();
            System.out.println("Podaj hasło: " + password + " " + pass);
            password = in.nextLine();

        }
        System.out.println("Hasło poprawne!!!!:)");
    }

}

