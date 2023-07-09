package org.example.OOP.Zadanie7;

public class Rectangle {
    private Point upperLeft;
    private Point lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
        System.out.println("Prostokąt o współrzędnych: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ").");
    }

    public Rectangle(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
        System.out.println("Prostokąt o współrzędnych: (" + upperLeft.getX() + "," + upperLeft.getY() + ") and ("
                + lowerRight.getX() + "," + lowerRight.getY() + ").");
    }

    public void displayInfo() {
        System.out.println("Prostokąt o współrzędnych: (" + upperLeft.getX() + "," + upperLeft.getY() + ") and ("
                + lowerRight.getX() + "," + lowerRight.getY() + ").");
    }

    public double calculateArea() {
        int width = Math.abs(lowerRight.getX() - upperLeft.getX());
        int height = Math.abs(lowerRight.getY() - upperLeft.getY());
        return width * height;
    }

    public boolean isPointInside(Point point) {
        int x = point.getX();
        int y = point.getY();

        int minX = Math.min(upperLeft.getX(), lowerRight.getX());
        int maxX = Math.max(upperLeft.getX(), lowerRight.getX());
        int minY = Math.min(upperLeft.getY(), lowerRight.getY());
        int maxY = Math.max(upperLeft.getY(), lowerRight.getY());

        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }
}