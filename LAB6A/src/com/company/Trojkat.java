package com.company;

class Trojkat extends Figura
{
    double wys=0, podst=0;
    String kolor;

    Trojkat(double wys, double podst)
    {
        this.wys = wys;
        this.podst = podst;
    }

    Trojkat(float wys, float podst, String kolor){
        this.wys=wys;
        this.podst=podst;
        this.kolor=kolor;
    }

    @Override
    void opis() {
        super.opis();
        System.out.println("Trójkąt o wys:"+wys+" podstawie "+podst+" kolorze: "+kolor);
    }
}