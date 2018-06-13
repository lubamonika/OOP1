package com.infoshare;

public class Suka extends Pies {

    public Suka(String rasa, Double waga, String imie, int wzrost){
        super(rasa, waga, imie, wzrost);
    }

    public Suka(String rasa, Double waga, String imie) {
        super(rasa, waga, imie, 0);
    }

    @Override
    public void szczekaj() {
        System.out.println(rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " cm zrobiła chał hał hau.");
    }

    public void szczekajSuko() {
        System.out.println(rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " cm zrobiła chał hał hau auuuuuuu.");
    }

}
