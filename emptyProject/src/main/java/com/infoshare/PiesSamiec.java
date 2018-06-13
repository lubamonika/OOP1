package com.infoshare;

public class PiesSamiec extends Pies {

    public PiesSamiec(String rasa, Double waga, String imie, int wzrost){
        super(rasa, waga, imie, wzrost);
    }

    public PiesSamiec(String rasa, Double waga, String imie) {
        super(rasa, waga, imie, 0);
    }

    public PiesSamiec () {
        super();
    }
}
