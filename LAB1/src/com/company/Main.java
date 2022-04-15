package com.company;

public class Main {

    public static void main(String[] args) {
        zadanie1();
        //obliczenia(5,6);(z.2)
        // czyParzysta(9); (z.3)
        //zadanie4(5);
        // System.out.println(potega(8)); z5
        // System.out.println(pierwiastekkwadratowy(8)); z6
     //   System.out.println(czyProstokatny(6,8,10));

    }
// 1.Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
   public static void zadanie1(){
       int wiek = 22;
        System.out.println("Imie: Michał");
       System.out.println("wiek: "+wiek);
   }

    //2.Napisz  metodę,  która  jako  argument  przyjmuje  2  liczby  i  wypisuje  ich  sumę,  różnicę  i  iloczyn.
    public static void obliczenia(double a, double b) {
        System.out.println("Suma liczb a i b wynosi: " + (a + b));
        System.out.println("Różnica liczb a i b wynosi: " + (a - b));
        System.out.println("Iloczyn liczb a i b wynosi: " + (a * b));
    }
    //zadanie 3
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
    public static void czyParzysta(int liczba)
    {
        if(liczba%2==0)
            System.out.println("Parzysta");
        else System.out.printf("Nieparzysta");
    }

    //zadanie 4
   // Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5.
    public static boolean zadanie4(int liczba){
        if (liczba%3==0 && liczba%5==0) return true;
        else return false;
    }

    //zadanie 5
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
    public static int potega(double a){

        return (int) Math.pow(a,3);
    }
    //zadanie 6
    // Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy

    public static double pierwiastekkwadratowy(double a){
        return Math.sqrt(a);
    }
    //7. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
     //z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
   // a2+b2=c2

    public static boolean czyProstokatny(double a, double b, double c) {
        if((Math.pow(a,2)+Math.pow(b,2))==(Math.pow(c,2)))
            return true;
            else return false;
    }

}


