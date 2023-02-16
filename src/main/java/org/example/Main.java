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
        String replacedPhrase = phrase.replace("kota", "koty");
        System.out.println(replacedPhrase);

        //Zamień wszystkie litery "a" na "b" w wyrażeniu "Ala ma kota."
        String replacedPhraseFromAToB = phrase.replace("a", "b");
        System.out.println(replacedPhraseFromAToB);

        //Z wyrażenia "Ala ma kota." wyłuskaj wyraz "ma"
        String substringOfphrase = phrase.substring(4, 6);
        System.out.println(substringOfphrase);

        //Do wyrażenia "Ala ma kota." dodaj wyrażenie "A kot ma Alę" tak by wyświetliły się w jedenj linii.
        String concatenatePhrase = phrase.concat(", A kot ma Alę");
        System.out.println(concatenatePhrase);

        //Sprawdź czy wyrażenie "Ala ma kota." zaczyna się na "Ala". (Odpowiedniej metody szukaj w dokumentacji wyszukując "startsWith")
        boolean startOfPhrase = phrase.startsWith("Ala");
        System.out.println("The phrase starts with Ala:" + " " + startOfPhrase);

        //Sprawdź czy wyrażenie "Ala ma kota." kończy się na "kota". (Odpowiedniej metody szukaj w dokumentacji wyszukując "endsWith")
        boolean endOfPhrase = phrase.endsWith("kota");
        System.out.println("The phrase ends with kota:" + " " + endOfPhrase);

        //Sprawdź czy wyrażenie "Ala ma kota." zawiera w sobie słowo "ma" (Odpowiedniej metody szukaj w dokumentacji wyszukując "contains")
        boolean containOfPhrase = phrase.contains("ma");
        System.out.println("The phrase contains ma:" + " " + containOfPhrase);

        // Sprawdź czy wyrażenie "Ala ma kota." jest równe wyrażeniu "Ala ma psa." (Odpowiedniej metody szukaj w dokumentacji wyszukując "equals")
        boolean equalOfPhrase = phrase.equalsIgnoreCase("Ala ma psa");
        System.out.println("The phrase Ala ma kota equals Ala ma psa:" + " " + equalOfPhrase);

        //FIXME Stwórz zmienna "word" zawierającą słowo "programowanie". Stwórz zmienną logiczną (boolean) "isEquals10" która bedzie przechowywała odpowiedź (true/false) czy długość zmiennej word jest równa 10.  (Zrób to na dwa sposoby: w jednym wykorzystaj metodę z klasy String, a w drugim użyj operatora porównania)
        String word = "Programowanie";
        String substringOfWord = word.substring(0, 13);
        System.out.println(substringOfWord);

        boolean equalOfWord = word.equals("programowanie");
        System.out.println("The word is equals 10:" + " " + equalOfWord);

        //FIXME Stwórz zmienną x i nadaj jej wartość 10. Wyświetl wartość zmiennej x na standardowym wyjściu.
        int valueOfX = 10;
        System.out.println("x=" + valueOfX);

        //FIXME Stworz zmienną y i nadaj jej wartość 2. Wyświetl wartość zmiennej y na wyjściu.
        int valueOfY = 2;
        System.out.println("y=" + valueOfY);

        //FIXME Stwórz zmienną sum i umieść w niej sumę zmiennej x i y. Wyświetl wartość zmiennej z na wyjściu.
        int sumOfValue = valueOfX + valueOfY;
        System.out.println(sumOfValue);

        //FIXME Stwórz zmienną difference i umieść w niej różnice wartości x i y. Wyświetl wartość zmiennej roznica na wyjściu
        int differenceOfValue = valueOfX - valueOfY;
        System.out.println(differenceOfValue);

        //FIXME Stwórz stałą inflationOnDecember i nadaj jej wartość 16.6, na standardowym wyjściu wyświetl "Inflation in December was 16.6%!" (użyj słowa kluczowego final)

        final double valueOfInflation = 16.6;
        System.out.println("Inflation in December was" + " " + valueOfInflation + "%");

        //FIXME Stwórz stałą inflationOfNovember i nadaj jej wartość 17.4, na standardowym wyjściu wyświetl rożnicę inflationOfNovember i inflationOfDecember.

        final double valueOfInflation2 = 17.4;
        double differenceBetweenValueOfInflation = valueOfInflation2 - valueOfInflation;
        System.out.println("The difference between inflation of November and inflation of December is" + " " + differenceBetweenValueOfInflation + "%");

        //Dany masz kwadrat o boku 10 cm. Stwórz zmienna do przechowywania wartości boku kwadratu, a następnie stworz zmienne do przechowywania pola i obwodu tego kwadratu.

        int sideOfTheSquare = 10;
        int squareArea = sideOfTheSquare * sideOfTheSquare;
        int squarePerimeter = 4 * sideOfTheSquare;
        System.out.println("Pole kwadratu jest równe "+squareArea + "cm\u00B2");
        System.out.println("Obwód kwadratu jest równy "+ squarePerimeter + "cm");
    }

}
