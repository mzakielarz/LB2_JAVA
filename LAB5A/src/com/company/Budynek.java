package com.company;
import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rok_budowy;
    int liczba_pieter;

    public Budynek(String nazwa, int rok_budowy,int liczba_pieter){
        this.nazwa = nazwa;
        this.rok_budowy = rok_budowy;
        this.liczba_pieter = liczba_pieter;
    }
    public void info(){
        System.out.println(nazwa);
        System.out.println(rok_budowy);
        System.out.println(liczba_pieter);
    }
    public int wiek(int  rok){

        return rok-rok_budowy;
    }

}
