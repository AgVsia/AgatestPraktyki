package org.example.Polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Tworzę zmienną o nazwie 'car' typu Vehicle i przypisuje do niej referencję do nowego obiektu typu Car - moge to zrobić, bo klasa Car dziedziczy po klasie Vehicle
        Vehicle car = new Car();
        //Tworzę zmienną o nazwie 'truck' typu Vehicle i przypisuje do niej referencję do nowego obiektu typu Truck - moge to zrobić, bo klasa Truck dziedziczy po klasie Vehicle
        Vehicle truck = new Truck();
        //Tworzę zmienną o nazwie 'motorcycle' typu Vehicle i przypisuje do niej referencję do nowego obiektu typu Motorcycle - moge to zrobić, bo klasa Motorcycle dziedziczy po klasie Vehicle
        Vehicle motorcycle = new Motorcycle();


        //tworzę kolekcję RÓŻNYCH obiektów, które mają wspólną klasę bazową Vehicle - to dzięki polimorfizmowi możemy to zrobić
        List<Vehicle> listOfVehicles = new ArrayList<>();
        listOfVehicles.add(car);
        listOfVehicles.add(truck);
        listOfVehicles.add(motorcycle);

        //wywołuje na każdym obiekcie z listy metodę drive
        //wywoła nam się metoda z danej klasy obiektu a nie z typu zmiennej
        //czyli dla zmiennej car wywoła nam się metoda drive() z klasy Car, a nie z klasy Vehicle, mimo że zmienna car jest typu Vehicle
        for(Vehicle vehicle: listOfVehicles){
            vehicle.drive();
        }

        for(Vehicle vehicle: listOfVehicles){
            //sprawdzamy który obiekt na liście ma instancję klasy Truck i na nim wykonujemy metodę stop()
            if (vehicle instanceof Truck) vehicle.stop();
        }

    }
}
