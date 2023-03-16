package org.example.Loops;

public class Loops {
    public static void main(String[] args){

    //Do czego służy pętla, rodzaje pętli, zasięg zmiennych
        //pętla for
        //inicjacja licznika ; warunek ; sposob zmiany licznika
        for(int i = 0; i < 5; i++){
            System.out.println("Witaj świecie z pęli for. Licznik: " + i);
        }

        //pętla while
        // wykonuje blok tak długo dopóki warunek jest true
        int j = 0;
        while(j < 5){
            System.out.println("Witaj świecie z pętli while. Licznik: " + j);
            j++;
            //j = j + 1;
            //j += 1;
        }

        //pętla do .. while - zawsze wykona się co najmniej raz
        int k = 0;
        do {
            System.out.println("Witaj świecie z pętli do while. Licznik: " + k);
            k++;
        } while (k < 0);
    }
}
