package org.example.OOP.Zadanie6;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Utworzony punkt (" + x + "," + y + ").");
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
        System.out.println("Utworzony punkt (" + x + "," + y + ").");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point getCoordinates() {
        return new Point(x, y);
    }

    public void display() {
        System.out.println("Współrzędne punktu (" + x + ", " + y + ").");
    }
}

