package org.example.OOP.Zadanie2;

class Plant {
    private String name;
    private String description;
    private double waterRequirements;

    public Plant(String name, String description, double waterRequirements) {
        this.name = name;
        this.description = description;
        this.waterRequirements = waterRequirements;
    }

    public double getWaterRequirements() {
        return waterRequirements;
    }
}