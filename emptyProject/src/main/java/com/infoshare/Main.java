package com.infoshare;

public class Main {

    public static void main( String[] args ) {
/*
        Suka suka1 = new Suka("Chihuahua", 1.8, "Ewita");
        Suka suka2 = new Suka("Chihuahua", 5.2, "Lola", 27);
        Suka suka3 = new Suka("Kundel", 54.0, "Gertruda", 164);
  */


        //      PiesSamiec pies4 = new PiesSamiec();

        //Suka suka różni się od Pies suka. Pierwsza ma dostęp do metod klasy Suka i Pies, druga suczka ma dostęp tylko do motod rodzica
/*

        suka1.szczekaj();
        suka1.kupa();
        suka1.bmi();
        suka2.szczekaj();
        suka2.bmi();
        suka3.szczekaj();
        suka3.bmi();
        pies4.szczekaj();
        pies4.kupa();
        pies4.bmi();
        suka1.szczekajSuko();
        */

        Pies p1 = new Pies("Chihuahua", 5.2, "Anton", 27);
        Suka s1 = new Suka("Kundel", 54.0, "Gertruda", 164);

        Wataha stado = new Wataha();
        stado.addDogsToList(p1);//dodaje Psa - ok
        stado.addDogsToList(s1);//uwaga, metoda działa też dla suki, która dziedziczy po psie ale nie jest bezpośrednio psem. To jest wlasnie polimorfizm!
        System.out.println(stado.ktoWStadzie());
    }

}
