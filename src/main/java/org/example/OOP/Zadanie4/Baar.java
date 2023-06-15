package org.example.OOP.Zadanie4;

public class Baar {
    public static void main(String[] args) {
        //Drink drink = new Drink("Sok ananasowy", "Likier Malibu", "Mleko kokosowe", 100, 50, 100);
        Barman barman = new Barman();
        Drink drink = barman.createDrink("Sok ananasowy", 100, "Likier Malibu", 50, "Mleko kokosowe", 100);
        barman.printDrink(drink);


    }
}
