package org.example.Functions;

public class Zadanie_10 {
    public static void main(String[] args) {
        //Napisz funkcję, która sprawdzi czy podane w parametrze hasło (String) spełnia poniższe zasady:
        //   - hasło musi mieć co najmniej 10 znaków
        //   - hasło musi zawierać co najmniej jedną liczbę
        //   - hasło musi zawierać znak specjalny: !, @, #, $, %, ^, &, *, ., (, lub )

        String password = "Testerka9!";
        int amountOfPassword = 10;
        char specialDigit = '!';
        int num = 9;
        boolean correctPassword = rulesOfPassword(amountOfPassword, specialDigit, num);
        System.out.println("Poprawne hasło: " + password);
    }

    public static boolean rulesOfPassword(int amountOfPassword, char specialDigit, int num) {
        if (amountOfPassword == 10 && specialDigit == '!' && num == 9) {
            System.out.println("Ta metoda zwraca poprawne hasło: ");
            return true;
        } else {
            System.out.println("Niepoprawne hasło: ");
            return false;
        }
    }
}
