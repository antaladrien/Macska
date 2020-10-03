package com.antaladrien;

public class Macska {
    String nev;
    double suly;
    boolean ehes;

    public Macska(String nev, double suly, boolean ehes) {
        this.nev = nev;
        this.suly = suly;
        this.ehes = ehes;
    }

    public Macska (String nev, double suly){
        this(nev, suly, true);
    }

    public boolean eszik(double etel){
        if(ehes){
            this.suly += etel;
            ehes = false;
            return true;
        }
        return false;
    }

    public void futkos(){
        if(suly-0.1>0);
        suly -= 0.1;
        ehes = false;
    }

    public String toString() {
        return nev + " macska, " + suly + " kg, " + (ehes?"ehes":"nem ehes");
    }
}
