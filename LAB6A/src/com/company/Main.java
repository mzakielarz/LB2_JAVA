package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*  Punkt pkt1 = new Punkt();
        Punkt pkt2 = new Punkt(2.5,3.43);
        Punkt pkt3 = new Punkt(-21,2);

        pkt1.opis();
        pkt1.przesun(2,3);
        pkt1.opis();

        pkt2.opis();
        pkt2.przesun(1,5);
        pkt2.opis();

        pkt3.opis();
        pkt3.przesun(4,4);
        pkt3.opis();

        Prostokat p1 = new Prostokat(2.3,23.2);
        Trojkat t1 = new Trojkat(4.54,14.23);
        Figura f1 = new Figura();

        System.out.println(p1.getPowierzchnia());
        System.out.println("Trójkąt o wysokości:"+t1.wys+" "+t1.podst);
        t1.wys=1;
        t1.podst=2.32;
        System.out.println("Trójkąt o wysokości:"+t1.wys+" "+t1.podst);
        p1.przesun(3,5);
        System.out.println("Prostokąt Wysokość:"+p1.wys+" Szerokość: "+p1.szer);
        Kwadrat kw1 = new Kwadrat(5,5,"czarny");
        System.out.println("//////");
        kw1.opis();
        System.out.println("//////");
        t1.opis();
        System.out.println("//////");
        p1.opis();*/

        //ZADANIE2
 /*   Samochod s1 = new Samochod();
    Samochod s2 = new Samochod();
    s1.wypisz();
    s2.wypisz();
    SamochodOsobowy so1 = new SamochodOsobowy();
    so1.wypisz();*/

        //Zadanie3
    Ksiegarnia ksieg1=new Ksiegarnia("Amorek",33,12345);
    Podrecznik p1= new Podrecznik("PO dla studentow","Andrzej","Szwed",2010);
    Powiesc pow1=new Powiesc("Tomek w krainie Kangurów","Alfred","Szklarski",1997,"przygodowa");
    Klient k1 = new Klient("Krzysztof","Bartczak");
    Ksiazka ks1= new Ksiazka("Alfabet morsea","Jan","Morse",1990);
    ksieg1.wypisz();
        System.out.println("////");
    p1.wypisz();
        System.out.println("////");
    pow1.wypisz();
        System.out.println("////");
    ks1.wypisz();
        System.out.println("////");
    System.out.println(k1.przedstawSie());





//ZADANIE1 DOKOŃCZ
    }
}