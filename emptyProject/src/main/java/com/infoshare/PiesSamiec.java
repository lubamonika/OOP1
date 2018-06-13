package com.infoshare;

public class PiesSamiec extends Pies {

    public PiesSamiec(String rasa, Double waga, String imie, int wzrost){
        super(rasa, waga, imie, wzrost);
        System.out.println("to jest konstruktor samca");
    }

    public PiesSamiec(String rasa, Double waga, String imie) {
        super(rasa, waga, imie, 0);
        System.out.println("to jest konstruktor samca");
    }

    public PiesSamiec () {
        super();
        //System.out.println(PiesSamiec.class);
        System.out.println("to jest konstruktor samca");
    }
}
