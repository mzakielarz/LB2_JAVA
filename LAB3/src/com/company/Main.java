package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void zadanie1() {
        int n;
        double pkt;
        double srednia = 0;
        double suma = 0;
        int ile=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe studentów w grupie: ");
        n = input.nextInt();

        if (n > 0) {
            while (n > 0) {
                System.out.println("Podaj liczbe punktów od 0 do 50 ");
                pkt = input.nextDouble();
                if (pkt >= 0 && pkt <= 50) {
                    suma = suma + pkt;
                    ile++;
                    n--;
                }
                continue;
            }//koniec while
            System.out.println("suma punktów wynosi: "+suma);
            System.out.println("średnia wynosi: "+suma/ile);

        }
        else System.out.println("W grupie musi byc conajmniej 1 student");
    }

    public static double wczytaj() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double n = input.nextDouble();
        return n;
    }

    public static void zadanie2() {
        int ile_d = 0;
        int ile_u = 0;
        double suma_d = 0, suma_u = 0;

       // System.out.println(wczytaj());
        for (int i = 0; i <3 ; i++) {

            double liczba = wczytaj();
            if (liczba > 0) {
                ile_d++;
                suma_d += liczba;
            } else {
                ile_u++;
                suma_u += liczba;
            }
        }//koniec for
        System.out.println("Ilość dodatnich: "+ile_d+" suma: "+suma_d);
        System.out.println("Ilość ujemnych: "+ile_u+" suma: "+suma_u);
    }
    public static void zadanie3(){
        double liczba, suma=0;
        double n = wczytaj();
        if(n>0){
            for (int i = 1; i < 3; i++) {
                liczba=wczytaj();
                if(liczba%2==0){
                    suma+=liczba;
                }
            }System.out.println("Suma liczb parzystych: "+suma);//koniec for
        }
        else
            System.out.println("Podano błędne dane");
    }

        public static void zadanie4(){
            // stworzenie obiektu klasy random

            Random liczba = new Random();
            int suma=0;
            // losowanie liczby z zakresu [0;100] i przypisianie do zmiennej całkowitej
            for (int i = 0; i < 5; i++) {
                int los = liczba.nextInt(-10,45);
               // System.out.println(los);
                if(los%2==0){
                    suma+=los;
                    System.out.println(los);
                }
                }
            System.out.println("suma: "+suma);
            }

    public static boolean Palindrom(String tekst){
        for (int i = 0; i < tekst.length()/2; i++) {
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length() - 1 - i);

            if (znak != przeciwnyZnak) return false;
        }
        return true;
    }

    public static boolean Palindrom(long liczba){
        return Palindrom(Long.toString(liczba));
    }


    public static void main(String[] args) {
        // zadanie1();
        //zadanie2();
        // zadanie3();
        // zadanie4();
      /* System.out.println(Palindrom("kajak"));
       System.out.println(Palindrom("ala"));
       System.out.println(Palindrom("kamil"));
       System.out.println(Palindrom("mama"));*/
    }





}