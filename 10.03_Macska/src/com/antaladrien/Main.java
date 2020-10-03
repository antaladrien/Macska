package com.antaladrien;

public class Main {

    public static void main(String[] args) {
        Macska m1 = new Macska("Kormi",4.0,false);
        Macska m2 = new Macska("Cirmi", 3.5);

        if (m1.eszik(0.2))
            System.out.println(m1.nev + " macska evett");
        else
            System.out.println(m1.nev + " macska nem volt ehes");
        if (m2.eszik(0.2))
            System.out.println(m2.nev + " macska evett");
        else
            System.out.println(m1.nev + " macska nem volt ehes");

        m1.futkos();
        System.out.println(m1);
        m2.futkos();
        System.out.println(m2);
    }
}
