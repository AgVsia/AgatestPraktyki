package org.example.Conditions;

public class IfElse {
    public static void main(String[] args){

        int BMI = 20;
        if (BMI < 20) {
            System.out.println("Masz niedowagę!");
        } else if (BMI >= 20 && BMI <= 25) {
            System.out.println("Waga w normie");
        } else if (BMI > 25 && BMI <= 30){
            System.out.println("Nadwaga");
        } else if (BMI > 30 && BMI <= 40){
            System.out.println("Otyłość");
        } else if (BMI > 40) {
            System.out.println("Nadmierna otyłość");
        }
    }
}
