package com.infoshare;

public class Pies {
    String rasa;
    Double waga;
    String imie;
    int wzrost;

    public Pies () {
        this("Jamnik", 100.0, "Szarik", 180); // refaktoryzacja - zaoszczędza kod
        System.out.println("to jest konstruktor obiektu psa 3");
        /*
        rasa = "Jamink"; //tutaj nie muszę używać this ponieważ w ogóle nie ma argumentów wejściowych - więc kompilator nie ma wątpliwości co ustawić
        imie = "Szarik";
        waga = 100.0;
        wzrost = 180;
        */

    }


    public Pies(String rasa, Double waga, String imie, int wzrost) {

        this.rasa = rasa;  //this.rasa = rasa -> this wskazuje na pole klasy jeśli nazwa argumentu jest tożsama z nazwą pola
        this.waga = waga; // tutaj this może być ominięte, równie dobrz emożemy napisać waga = weight;
        this.imie = imie;   // czyli: imie=imie; NIE OK! imie=name; OK!
        this.wzrost = wzrost;
        System.out.println("to jest konstruktor obiektu psa 2");
    }

    public Pies(String rasa, Double waga, String imie) {
        this(rasa, waga, imie, 0);
        System.out.println("to jest konstruktor obiektu psa 1" );
        /*
        this.rasa = rasa;  //this.rasa = rasa -> this wskazuje na pole klasy jeśli nazwa argumentu jest tożsama z nazwą pola
        this.waga = waga; // tutaj this może być ominięte, równie dobrz emożemy napisać waga = weight;
        imie = name;   // czyli: imie=imie; NIE OK! imie=name; OK!
        this.wzrost = wzrost;
        */
    }

    public void szczekaj() {
        System.out.println(rasa + " " + imie + " o wadze " + waga + " kg i wzroście " + wzrost + " cm zaszczekał.");
    }


    public double bmi() {
        double wzrostMetry = (wzrost / 100.0);
        double bmi = (waga / (wzrostMetry * wzrostMetry));
        if (wzrost >0) {
            System.out.println(imie + " ma BMI " + bmi);
        }
        else {
            System.out.println("Nie można wyliczyć BMI dla wzrostu 0. Podaj prawidłowy wzrost psa.");
        }
        return bmi;
    }

    public void kupa(){
        System.out.println(imie + " zrobił kupkę!");
    }


}
