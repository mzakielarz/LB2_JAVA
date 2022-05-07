package com.company;


class Prostokat extends Figura {
    double wys=0, szer=0;
    String kolor;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    Prostokat(float wys,float szer, String kolor){
        this.wys=wys;
        this.szer=szer;
        this.kolor=kolor;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(float x, float y){
        this.wys+=x;
        this.szer+=y;
    }

    @Override
    void opis() {
        super.opis();
        System.out.println("Prostokąt o wys.: "+wys+" szer.: "+szer);
    }
}