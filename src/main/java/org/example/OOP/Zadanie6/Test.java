package org.example.OOP.Zadanie6;


public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(5, 3);

        point1.display();
        point2.display();

        int x1 = point1.getX();
        int y1 = point1.getY();
        int x2 = point2.getX();
        int y2 = point2.getY();

        System.out.println("Współrzędne punktu pierwszego: (" + x1 + ", " + y1 + ").");
        System.out.println("Współrzędne punktu drugiego: (" + x2 + ", " + y2 + ").");

       // Point point3 = new Point(); //metoda setXY w klasie Point oczekuje dwóch argumentów typu int, ale podajesz tylko jeden argument,
        // który jest obiektem typu Point. Dlatego IntelliJ sygnalizuje błąd kompilacji.
       // point3.setXY(point2.getX(), point2.getY());
       // point3.display();
       // tutaj poprawiona wersja, aby błędu nie było  używam metody getX i getY na obiekcie point2, aby pobrać wartości x i y,
      // a następnie przekazać je jako oddzielne argumenty do metody setXY.
        Point point3 = new Point(0,0);
        point3.setXY(point2.getX(), point2.getY());
        point3.display();
        //tworzymy obiekt point3 z domyślnymi wartościami (0, 0), a następnie korzystamy z metod getX i getY na obiekcie point2, aby pobrać wartości x i y.
        // Następnie przekazujemy te wartości jako oddzielne argumenty do metody setXY obiektu point3.
    }
}   
