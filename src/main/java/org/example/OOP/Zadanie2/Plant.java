package org.example.OOP.Zadanie2;

public class Plant {
    public static void main(String[] args) {
        Garden garden1 = new Garden();
        garden1.setName("Fiołek");
        garden1.setInfoOfPlant("Fiołek (Viola L.) – rodzaj roślin z rodziny fiołkowatych (Violaceae). \nObejmuje około 525-600 gatunków[4][5], rosnących głównie w Europie (92 gatunki, w tym w Polsce 25), w Azji, Ameryce Północnej i Południowej, poza tym także w Australii. \nWiększość gatunków rośnie w strefie klimatu umiarkowanego oraz na obszarach górskich. Zasiedlają bardzo zróżnicowane siedliska – lasy, łąki i mokradła, ale najczęściej murawy wysokogórskie i miejsca skaliste w górach. Liczne odmiany uprawne fiołków ");
        garden1.setDailyAmountOfWater(" 2 litry");
        garden1.setWeeklyAmountOfWater("14 litrów");
        garden1.setYearlyAmountOfWater("5110 litrów");

        System.out.println("Nazwa: " + garden1.getName());
        System.out.println("Opis: " + garden1.getInfoOfPlant());
        System.out.println("Dzienna ilość wody: " + garden1.getDailyAmountOfWater());
        System.out.println("Tygodniowa ilość wody: " + garden1.getWeeklyAmountOfWater());
        System.out.println("Roczna ilość wody: " + garden1.getYearlyAmountOfWater());


        Garden garden2 = new Garden();

        garden2.setName("Kaktus");
        garden2.setInfoOfPlant(" rodzina sukulentów łodygowych (wieloletnich, zielnych lub częściowo zdrewniałych),\n należąca do rzędu goździkowców. ");
        garden2.setDailyAmountOfWater(" 0.5 litra");
        garden2.setWeeklyAmountOfWater("7 litrów");
        garden2.setYearlyAmountOfWater("2555 litrów");

        System.out.println("Nazwa: " + garden2.getName());
        System.out.println("Opis: " + garden2.getInfoOfPlant());
        System.out.println("Dzienna ilość wody: " + garden2.getDailyAmountOfWater());
        System.out.println("Tygodniowa ilość wody: " + garden2.getWeeklyAmountOfWater());
        System.out.println("Roczna ilość wody: " + garden2.getYearlyAmountOfWater());

        Garden garden3 = new Garden();

        garden3.setName("Stokrotka");
        garden3.setInfoOfPlant("Stokrotka (Bellis L.) – rodzaj z rodziny astrowatych. Obejmuje 14 gatunków[3]." +
                "\n Zasięg rodzaju obejmuje całą Europę, północno-zachodnią Afrykę (od Maroka po Libię) i zachodnią Azję (od Jordanii po Iran i Kazachstan)[3]. \nW Polsce występuje jeden gatunek – stokrotka pospolita B. perennis[5]. " +
                "\nRośliny te występują na pastwiskach, w murawach, na terenach skalistych i w lasach.");
        garden3.setDailyAmountOfWater(" 1.5 litra");
        garden3.setWeeklyAmountOfWater("10.5 litrów");
        garden3.setYearlyAmountOfWater("3832.5 litrów");

        System.out.println("Nazwa: " + garden3.getName());
        System.out.println("Opis: " + garden3.getInfoOfPlant());
        System.out.println("Dzienna ilość wody: " + garden3.getDailyAmountOfWater());
        System.out.println("Tygodniowa ilość wody: " + garden3.getWeeklyAmountOfWater());
        System.out.println("Roczna ilość wody: " + garden3.getYearlyAmountOfWater());


    }


}
