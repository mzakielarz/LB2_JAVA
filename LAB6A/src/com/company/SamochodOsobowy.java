package com.company;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    double waga, pojemnosc_silnika;
    int ilosc_osob;

    SamochodOsobowy() {
        Scanner scan = new Scanner(System.in);
        System.out.println("marka:");
        this.marka=scan.next();
        System.out.println("model:");
        this.model=scan.next();
        System.out.println("nadwozie:");
        this.nadwozie=scan.next();
        System.out.println("kolor:");
        this.kolor=scan.next();
        System.out.println("rok produkcjo:");
        this.rok_produkcji= scan.nextInt();
        System.out.println("przebieg:");
        this.przebieg= scan.nextInt();
        System.out.println("waga:");
        this.waga=scan.nextDouble();
        System.out.println("poj.silnika:");
        this.pojemnosc_silnika=scan.nextDouble();
        System.out.println("ilosc osob:");
        this.ilosc_osob=scan.nextInt();
    }


    @Override
    void wypisz() {
        super.wypisz();
        System.out.println("waga: "+waga+" Poj.silnika:"+pojemnosc_silnika+" ilosc osob: "+ilosc_osob);
    }

}
