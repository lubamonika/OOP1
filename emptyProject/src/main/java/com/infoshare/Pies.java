package com.infoshare;

public class Pies {
    String rasa;
    Double waga;
    String imie;
    int wzrost;

    public Pies(String rasa, Double waga, String imie, int wzrost) {
        this.rasa = rasa;
        this.waga = waga;
        this.imie = imie;
        this.wzrost = wzrost;
    }

    public void szczekaj() {
        System.out.println(rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " cm zaszczekał.");
    }

    public double bmi() {
        double wzrostMetry = (wzrost/100.0);
        double bmi = (waga/(wzrostMetry*wzrostMetry));
        System.out.println("BMI psa wynosi " + bmi);
        return bmi;
    }


}
