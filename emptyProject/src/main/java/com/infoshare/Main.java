package com.infoshare;

public class Main {

    public static void main( String[] args ) {

        Suka suka1 = new Suka("Chihuahua", 1.8, "Ewita");
        Pies suka2 = new Suka("Chihuahua", 5.2, "Lola", 27);
        Pies suka3 = new Suka("Kundel", 54.0, "Gertruda", 164);
        Pies pies4 = new PiesSamiec();


        suka1.szczekaj();
        suka1.bmi();
        suka2.szczekaj();
        suka2.bmi();
        suka3.szczekaj();
        suka3.bmi();
        pies4.szczekaj();
        pies4.bmi();
        suka1.szczekajSuko();
    }

}
