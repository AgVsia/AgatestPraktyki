package org.example.OOP.Zadanie2;


public class PlantWaterConsumption {
    public static void main(String[] args) {

        Plant plant1 = new Plant("róża", "Piękny kwiat", 1.5);
        Plant plant2 = new Plant("Kaktus", "RoĹ›lina pustynna", 0.2);
        Plant plant3 = new Plant("Paproć‡", "Zielona roslina", 0.8);

        double dailyWaterConsumption = plant1.getWaterRequirements() + plant2.getWaterRequirements() + plant3.getWaterRequirements();
        double weeklyWaterConsumption = dailyWaterConsumption * 7;
        double annualWaterConsumption = dailyWaterConsumption * 365;

        System.out.println("Dzienna ilość wody: " + dailyWaterConsumption + " litra");
        System.out.println("Tygodniowa ilość wody: " + weeklyWaterConsumption + " litrów");
        System.out.println("Roczna ilość  wody: " + annualWaterConsumption + " litrów");
    }
}
