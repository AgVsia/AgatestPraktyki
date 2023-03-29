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
        String Login = in.nextLine();
        System.out.println("Podaj hasło:");
        String Password = in.nextLine();
        String Log = "janek123";
        String Pass = "qwerty";
        for (int i = 0; i <= 0; i++) {
            if (Login == Log && Password == Pass) {
            }
            System.out.println("Hasło poprawne!!!!:)");

        }
        System.out.println("Podaj login: ");
        String Login1 = in.nextLine();
        System.out.println("Podaj hasło:");
        String Password1 = in.nextLine();
        String Log1 = "janek123";
        String Pass1 = "qwerty";
        int i = 0;
        while(i<=0){
            if (Login == Log && Password == Pass) {
            }
            System.out.println("Hasło poprawne!!!!:)");
            i++;
        }
        System.out.println("Podaj login: ");
        String Login2 = in.nextLine();
        System.out.println("Podaj hasło:");
        String Password2 = in.nextLine();
        String Log2 = "janek123";
        String Pass2 = "qwerty";
        int j=0;
        do{
            if (Login == Log && Password == Pass) {
            }

            System.out.println("Hasło poprawne!!!!:)");
            j++;
        }while(j<=0);
    }

}
