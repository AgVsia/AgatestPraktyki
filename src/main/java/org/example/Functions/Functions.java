package org.example.Functions;

import java.util.Scanner;

public class Functions {

    //public odyfikator dostępu
    //void oznacza, że funkcji nic nie zwraca
    //greeting to nazwa funkcji
    //() - tu będziemy przyjmować parametry funkcji
    public static void greetings1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = in.nextLine();
        System.out.println("Witaj! " + name);

    }

    public static void greetings2(String name){
        System.out.println("Witaj! " + name);
    }

    public static int sum(int x, int y){
        System.out.println("Ta metoda zwraca sumę dwóch liczb: " + x + " i " + y);
        return x + y;
    }

    public static void main(String[] args){
        //napiszę program, który 4 razy pobierze od użytkownia jego imię i wyświetli na wyjściu powiatnie dla tego użytkownika

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Podaj imię: ");
//        String name1 = in.nextLine();
//        System.out.println("Witaj! " + name1);
//
//        System.out.println("Podaj imię: ");
//        String name2 = in.nextLine();
//        System.out.println("Witaj! " + name2);
//
//        System.out.println("Podaj imię: ");
//        String name3 = in.nextLine();
//        System.out.println("Witaj! " + name3);
//
//        System.out.println("Podaj imię: ");
//        String name4 = in.nextLine();
//        System.out.println("Witaj! " + name4);

//        greetings1();
//        greetings1();
//        greetings1();
//        greetings1();

        String myName = "Agnieszka";
        greetings2(myName);

        int number1 = 10;
        int number2 = 50;
        int suma = sum(number1, number2);
        System.out.println("Suma dwóch liczb: " + suma);



    }
}
