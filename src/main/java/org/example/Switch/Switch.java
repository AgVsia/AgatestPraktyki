package org.example.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        //wykonywanie programu zacznie się od etykiety case, która pasuje do wybranej opcji
        // i jest kontunowane aż do napotkania instrukcji break
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz opcję (1, 2, 3, 4)");
        int choice = in.nextInt();

        switch (choice){
            case 1, 0:
                System.out.println("Wybrano opcję 1 lub 0");
                System.out.println("bla bla");
                System.out.println("dalsze instrukcje ...");
                break;
            case 2:
                System.out.println("Wybrano opcję 2");
                break;
            case 3:
                System.out.println("Wyborano opcję 3");
                break;
            case 4:
                System.out.println("Wybrano opcję 4");
                break;
            default:
                System.out.println("Niepoprawna wartość");
                break;
        }

    }
}
