package org.example.Functions;

public class Zadanie_2 {
    public static void main(String[]args){
      //Zmodyfikuj funkcję z zadania 9.1 tak, aby zwracała napis "Witaj świecie", a nie go wyświetlała.
        // Wywołaj tę funkcję tak aby na wyjściu
        String phrase = welcome();
        System.out.println(phrase);
        System.out.println(welcome());
    }
    public static String welcome(){
        String helloWorld = "Witaj świecie";
        return helloWorld ;
    }
}
