package org.example.Functions;

public class Zadanie_12 {
    public static void main(String[] args) {
        // Napisz funkcję max2, która zwraca większą z dwóch podanych, jako jej parametry liczb, następnie funkcję max3,
        // zwracającą największą spośród trzech podanych liczb. Funkcja max3 ma do tego celu używać funkcji max2.
        int num1 = 2;
        int num2 = 4;
        int biggestNum = max2(num1, num2);
        System.out.println("Największa z liczb: " + biggestNum);
    }

    public static int max2(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Ta metoda zwraca największa z podanych dwóch liczb: " + num1);
            return num1;
        } else {
            System.out.println("Ta metoda zwraca największa z podanych liczb: " + num2);
            return num2;
        }
    }
}
