package org.example.OOP.Zadanie4;

public class Drink {
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    Drink(String ingredient1, String ingredient2, String ingredient3, double amount1, double amount2, double amount3) {
        this.ingredient1 = new Ingredient(ingredient1, amount1);
        this.ingredient2 = new Ingredient(ingredient2, amount2);
        this.ingredient3 = new Ingredient(ingredient3, amount3);
    }
    public void setIngredient1(Ingredient ingredient){this.ingredient1=ingredient;}
    public Ingredient getIngredient1(){ return ingredient1;}
    public void setIngredient2(Ingredient ingredient){this.ingredient2=ingredient;}
    public Ingredient getIngredient2(){return ingredient2;}
    public void setIngredient3(Ingredient ingredient){this.ingredient3=ingredient;}
    public Ingredient getIngredient3(){return ingredient3;}
}
