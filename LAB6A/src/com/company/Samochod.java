package com.company;

import java.util.Scanner;

public class Samochod {
    String marka, model, nadwozie, kolor;
    int rok_produkcji, przebieg;

    Samochod( ){
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

    }

   void wypisz(){
       System.out.println("Klasa Samochód, marka:"+marka+" model: "+model+" nadwozie: "+nadwozie+" kolor: "+kolor+" rok produkcji: "+rok_produkcji+" Przebieg"+przebieg);
   }

}
