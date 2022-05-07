package com.company;

public class Kwadrat extends Prostokat {

    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public Kwadrat(float wys, float szer, String kolor) {
        super(wys, szer, kolor);
    }


     void  opis(){
       super.opis();
        System.out.println("Kwadrat o boku: "+wys);
    }


}
