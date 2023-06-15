package org.example.OOP.Zadanie4;

public class Barman {
    public Drink createDrink(String ingredient1, double amount1, String ingredient2, double amount2, String ingredient3, double amount3) {
        return new Drink(ingredient1, ingredient2, ingredient3, amount1, amount2, amount3);
    }

    public void printDrink(Drink drink) {
        double ingredientSum = drink.getIngredient1().getAmount() + drink.getIngredient2().getAmount() + drink.getIngredient3().getAmount();
        double firstValueOfIngredient = drink.getIngredient1().getAmount() / ingredientSum;
        double secondValueOfIngredient = drink.getIngredient2().getAmount() / ingredientSum;
        double thirdValueOfIngredient = drink.getIngredient3().getAmount() / ingredientSum;

        System.out.println("Składnik drinka to: " + drink.getIngredient1().getName() +", " +drink.getIngredient2().getName() +", "+ drink.getIngredient3().getName());
        System.out.println("Proporcja pierwszego składnika drinka: " + firstValueOfIngredient);
        System.out.println("Proporcja drugiego składnika drinka: " + secondValueOfIngredient);
        System.out.println("Proporcja trzeciego składnika drinka: " + thirdValueOfIngredient);
        System.out.println("Pojemność drinka: " + ingredientSum);
    }
}
