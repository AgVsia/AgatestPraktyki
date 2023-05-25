package org.example.OOP.Zadanie3;

// Zdefiniuj klasę Cabrio reprezentującą samochód z otwieranym dachem.
// Samochód powinien przechowywać informację o nazwie, marce, ale także to, czy aktualnie się porusza oraz,
// czy dach jest otwarty. Ograniczeniem jest to, że nie powinno być możliwe otwarcie ani zamknięcie dachu w sytuacji,
// gdy samochód jest w ruchu. Jeśli samochód jest w ruchu i ktoś spróbuje otworzyć lub złożyć dach powinien zostać
// wyświetlony komunikat o błędzie a dach powinien zostać w swojej aktualnej pozycji.
//W osobnej klasie stwórz obiekt reprezentujący samochód i przetestuj otwieranie dachu w sytuacji,
// gdy samochód jest w ruchu oraz w spoczynku.
class Cabrio {
    private String name;
    private String brand;
    private boolean isMoving;
    private boolean isRoofOpen;

    public Cabrio(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.isMoving = false;
        this.isRoofOpen = false;
    }

    public void startMoving() {
        if (isRoofOpen()) {
            System.out.println("Błąd: Nie można ruszyć samochodem, dach jest otwarty.");
        } else {
            this.isMoving = true;
        }
    }

    public void stopMoving() {

        this.isMoving = false;
    }

    public void openRoof() {
        if (isMoving()) {
            System.out.println("BŁąd: Nie można otworzyć dachu, samochód się porusza.");
        } else {
            isRoofOpen = true;
            System.out.println("Dach jest teraz otwarty.");
        }
    }

    public void closeRoof() {
        if (isMoving()) {
            System.out.println("Bład: Nie można zamknąć dachu samochód się porusza.");
        } else {
            isRoofOpen = false;
            System.out.println("Dach zamknięty.");
        }
    }

    public boolean isRoofOpen()
    {
        return isRoofOpen;
    }

    public boolean isMoving() {
        return isMoving;
    }
}