package org.example;

import java.util.Scanner;

public class InOutTasks {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Wpisz string: ");
        String stringValueFromUser = in.nextLine();
        System.out.println("User wpisał: " + stringValueFromUser);

        System.out.print("Wpisz int: ");
        int intValueFromUser = in.nextInt();
        System.out.println("User wpisał: " + intValueFromUser);
    }
}
