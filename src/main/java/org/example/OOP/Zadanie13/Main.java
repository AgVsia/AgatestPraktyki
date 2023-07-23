package org.example.OOP.Zadanie13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Developer("Marek Trąbka", 2500));
        employees.add(new Manager("Aga Łamaga", 7000));
        for(Employee employee : employees){
            employee.work();
        }

        // Developer developer = new Developer("Marek Trąbka", 2500);
      //  developer.work();
     //   Manager manager = new Manager("Aga Łamaga", 3500);
      //  manager.work();
    }

}
