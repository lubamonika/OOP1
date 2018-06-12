package com.infoshare;

public class Main {

    public static void main( String[] args ) {

        Pies pies1 = new Pies("Chihuahua", 1.8, "Ewita", 20);
        Pies pies2 = new Pies("Chihuahua", 5.2, "Lola", 27);
        Pies pies3 = new Pies("Kundel", 54.0, "Gertruda", 164);

        pies1.szczekaj();
        pies1.bmi();
        pies2.szczekaj();
        pies2.bmi();
        pies3.szczekaj();
        pies3.bmi();
    }

}
