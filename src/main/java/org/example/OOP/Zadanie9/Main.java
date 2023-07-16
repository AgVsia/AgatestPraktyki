package org.example.OOP.Zadanie9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(" Bread", 2.5, 0.5);
        System.out.println(" Nazwa produktu" + product.getName() + " cena produktu " + product.getPrice() + " Waga produktu" + product.getWeight());
        FoodProduct foodProduct = new FoodProduct(" Yogurt ", 1.2, 0.15, LocalDate.now().plusDays(14));
        System.out.println(" Nazwa produktu spożywczego" + foodProduct.getName() + " ena produktu  " + foodProduct.getPrice() + " Waga produktu" + foodProduct.getWeight() + " Data ważności" + foodProduct.getExpiredDate());
        ElectronicProduct electronicProduct = new ElectronicProduct("Phone", 2000, 0.3, 24);
        System.out.println((" Nazwa produktu elektronicznego" + electronicProduct.getName() + " Cena produktu  " + electronicProduct.getPrice() + " Waga produktu" + electronicProduct.getWeight() + " Gwarancja w miesiącach" + electronicProduct.getGuaranteeOfMonths()));
    }
}
