package com.infoshare;

import java.util.ArrayList;
import java.util.List;

public class Wataha {

    public List<Pies> czlonkowie = new ArrayList<>();

    //konstruktor domyślny - czyli go nie musimy pisać ale jest :)

    public void addDogsToList (Pies p) {
        czlonkowie.add(p);
    }

    public String ktoWStadzie(){
        StringBuilder out = new StringBuilder();
        out.append("członkowie stada = ");
        for(Pies pies:czlonkowie){
            out.append(pies.imie);
            out.append(", ");
        }
        out.append(";");
        return out.toString();
    }

}
