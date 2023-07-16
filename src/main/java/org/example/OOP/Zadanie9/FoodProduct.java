package org.example.OOP.Zadanie9;

import java.time.LocalDate;

public class FoodProduct extends Product {
    private LocalDate expiredDate;

    public FoodProduct(String name, double price, double weight, LocalDate expiredDate) {
        super(name, price, weight);
        this.expiredDate = expiredDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }
}
