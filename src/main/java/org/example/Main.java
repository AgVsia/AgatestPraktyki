package org.example;

public class Main {
    public static void main(String[] args) {
        //zadanie 1 Wyświetl pierwszą literę wyrażenia "Ala ma kota."
        String phrase = "Ala ma kota";
        char firstLetter = phrase.charAt(0);
        System.out.println(firstLetter);
        //zadanie 2 Wyświetl ostatni znak wyrażenia "Ala ma kota."
        char lastLetter = phrase.charAt(10);
        System.out.println(lastLetter);
        //Wyświetl długość wyrażenia "Ala ma kota."
        int lengthOfPhrase = phrase.length();
        System.out.println("length of phrase" + " " + lengthOfPhrase);
        // Wyświetl wyrażenie "Ala ma kota." wielkimi literami
        String phraseOfUpperCase = phrase.toUpperCase();
        System.out.println(phraseOfUpperCase);
        //Wyświetl wyrażenie "Ala ma kota." małymi literami
        String phraseOfLowerCase = phrase.toLowerCase();
        System.out.println(phraseOfLowerCase);
        //Wyświetl pod jakim indeksem znajduje się litera "m" w wyrażeniu "Ala ma kota."
        int indexOfSpecificLetter = phrase.indexOf("m");
        System.out.println("index of letter m " + indexOfSpecificLetter);
        //Zamień wyrażenie "Ala ma kota." na "Ala ma koty."
        String replacedPhrase = phrase.replace("kota","koty");
        System.out.println(replacedPhrase);
        //Zamień wszystkie litery "a" na "b" w wyrażeniu "Ala ma kota."
        String replacedPhraseFromAToB = phrase.replace("a","b");
        System.out.println(replacedPhraseFromAToB);
        //Z wyrażenia "Ala ma kota." wyłuskaj wyraz "ma"
        String substringOfprase = phrase.substring(4,6);
        System.out.println(substringOfprase);
        //Do wyrażenia "Ala ma kota." dodaj wyrażenie "A kot ma Alę" tak by wyświetliły się w jedenj linii.
        String concatenatePhrase = phrase.concat(", A kot ma Alę");
        System.out.println(concatenatePhrase);
        System.out.print(concatenatePhrase);
    }
}