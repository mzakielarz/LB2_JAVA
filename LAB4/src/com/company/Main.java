package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void zadanie1(){
        double suma = 0;
        double srednia = 0;
        int[] tab1 = {1,2,3,4};
        for (int i = 0; i < tab1.length; i++) {
            suma = suma + tab1[i];

        }
        System.out.println("Suma: "+suma);
        System.out.println("Średnia: "+suma/ tab1.length);
    }


   public static void zadanie2() {
       boolean[] tab1 = new boolean[20];
       for (int i = 0; i < tab1.length; i++) {
           if(i==0 || i%2==0) System.out.println(tab1[i]=true);
           else System.out.println(tab1[i] = false);
       }
   }

    public static double losowanie(){
        Random rand = new Random();
        double liczba = rand.nextInt(45)-10;
        return liczba;
    }

    public static void zadanie3(){
        double[] array = new double[20];
        double suma = 0;
        double sumaRoznic = 0, srednia = suma/(double) array.length;
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < array.length; i++) {
            array[i]= losowanie();
            suma += array[i];
            System.out.print(array[i]+"\t");
        }
        srednia = suma/(double) array.length;
        System.out.println("\n suma: "+suma+"\n średnia:"+suma/(double) array.length);

        for (int i = 0; i < array.length; i++) {
            sumaRoznic += (array[i] - srednia)*(array[i]-srednia);

        }

        System.out.println("suma roznic: "+sumaRoznic);
        System.out.println("Wariancja: "+sumaRoznic/((array.length)-1));

    }



    public static void main(String[] args) {

        // zadanie1();
        // zadanie2();
        zadanie3();

    }
}