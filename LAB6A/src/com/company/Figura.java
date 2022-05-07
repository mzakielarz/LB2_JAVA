package com.company;

public class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    Figura(){
        punkt = new Punkt(0,0);
    }

    Figura(String kolor){
        this.kolor=kolor;
    }

    Figura(Punkt punkt){
        this.punkt=punkt;
    }

    String getKolor(){
        return kolor;
    }

     void  opis(){
        System.out.println("Klasa Figura");
    }


}
