package org.example.OOP.Zadanie7;
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 4);
        Point point2 = new Point(6, 1);

        Rectangle rectangle1 = new Rectangle(2, 3, 5, 2);
        Rectangle rectangle2;
        rectangle2 = new Rectangle(point1, point2);

        rectangle1.displayInfo();
        rectangle2.displayInfo();

        double area1 = rectangle1.calculateArea();
        double area2 = rectangle2.calculateArea();

        System.out.println("Area of rectangle 1: " + area1);
        System.out.println("Area of rectangle 2: " + area2);

        Point point3 = new Point(3, 2);
        Point point4 = new Point(4, 5);

        boolean isInside1 = rectangle1.isPointInside(point3);
        boolean isInside2 = rectangle2.isPointInside(point4);

        System.out.println("Is point 3 inside rectangle 1? " + isInside1);
        System.out.println("Is point 4 inside rectangle 2? " + isInside2);
    }
}