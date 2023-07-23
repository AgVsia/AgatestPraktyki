package org.example.OOP.Zadanie13;

public class Manager extends Employee {
    public Manager(String name, double salary){
        super(name,salary);
    }
    @Override
    public void work(){
        System.out.println("Zarządza zespołem: ");
    }
}
