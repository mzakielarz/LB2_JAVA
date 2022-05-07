package com.company;

public class Klient {
    String imie, nazwisko;
    Klient(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    String przedstawSie(){
        return imie+" "+nazwisko;
    }

}
