package org.example;

import java.util.Scanner;

public class InOutTasks {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Program prosi o wartość: ");
        String stringValueFromUser = in.nextLine();
        System.out.println("User wpisał: " + stringValueFromUser);

        System.out.print("Program prosi o wartość: ");
        int intValueFromUser = in.nextInt();
        System.out.println("User wpisał taki int: " + intValueFromUser);
    }
}
