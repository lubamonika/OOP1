package com.infoshare;

public class Suka extends Pies {

    public Suka(){
        this("Spaniel", 20.0, "Megi", 40);
        System.out.println("to jest konstruktor suki");
    }

    public Suka(String rasa, Double waga, String imie, int wzrost){
        super(rasa, waga, imie, wzrost);
        System.out.println("to jest konstruktor suki");
    }

    public Suka(String rasa, Double waga, String imie) {
        super(rasa, waga, imie, 0);
        System.out.println("to jest konstruktor suki");
    }

    @Override
    public void szczekaj() {
        System.out.println(rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " cm zrobiła chał hał hau.");
    }

    public void szczekajSuko() {
        System.out.println(rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " cm zrobiła chał hał hau auuuuuuu.");
    }

}
