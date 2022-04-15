package com.company;
import java.util.Scanner;

public class Main {

    // z1. Napisz metodę określania oraz rozwiązywania równania kwadratowego ax2+bx+c=0 , gdzie a, b i
    //c są dowolnymi stałymi podawanymi przez użytkownika.
    public static void zadanie1(int a,int b, int c){
         double delta;
         if(a==0)
             System.out.println("To nie jest równanie kwadratowe, lecz liniowe");
         if(a!=0){
             delta=(b*b)-4*a*c;
             if(delta>0){
                 double x1= ((-b)-Math.sqrt(delta))/(2*a);
                 double x2= ((-b)+Math.sqrt(delta))/(2*a);
                 System.out.println("x1 to: "+x1+" "+ "x2 to: "+x2);
             }
            if(delta==0){
                double x0=-b/(2*a);
                System.out.println("x0 to: "+x0);
            }
            if(delta<0)
                 System.out.println("Brak pierwiastków");
         }

    }
    //Zadanie 2
    public static double zadanie2a(double x){
        if(x>0) return 2*x;
        if(x==0) return 0;
        else return -3*x;

    }
    public static double zadanie2b(double x){
        if(x>=1) return x*x;
        else return x;
    }
    public static double zadanie2c(double x){
        if(x>2) return 2+x;
        if(x==2) return 8;
        else return x-4;
    }

    //zadanie 3 Napisz metodę porządkowania trzech liczb x, y i z. Od najmniejszej do największej.
  public static void Zadanie3(double a, double b, double c) {
       if (a > b && a > c && b > c) System.out.println("Wynik od min do max = " + c + " " + b + " " + a);
       else if (b > a && b > c && a > c) System.out.println("Wynik od min do max = " + c + " " + a + " " + b);
       else if (c > b && c > a && b > a) System.out.println("Wynik od min do max = " + a + " " + b + " " + c);
       else if (c > b && c > a && a > b) System.out.println("Wynik od min do max = " + b + " " + a + " " + c);
   }

   //4.Z wykorzystaniem operatorów logicznych ! (negacja), && (and) napisz metodę, który wzależności od spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
   // •Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”;
   // •Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”;
   // •Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”, „Miłego dnia i pięknej pogody” .

    public static void zadanie4(){
      boolean znizka;
      boolean premia;
      Scanner scan = new Scanner(System.in);
      znizka = scan.nextBoolean();
      premia = scan.nextBoolean();

          if (!znizka || premia) {
              System.out.println("Zniżki na samochód nie ma");
          }

          if (!znizka || !premia) {
              System.out.println("Zakup odłożony, brak zniżki");

          }
          if (znizka || premia) {
              System.out.println("Kupujemy fure");

          }
  }




    // zadanie 5 . Z wykorzystaniem operatorów logicznych ! (negacja), && (and) napisz metodę, który w zależności
    //od spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
    //• Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”;
    //• Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”;
    //• Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”, „Miłego dnia
    //i pięknej pogody” .
    //Użytkownik podaje informacje o tym czy pada i czy jest autobus.
    public static void zadanie5() {
        boolean deszcz ;
        boolean autobus;
        Scanner scan = new Scanner(System.in);
        deszcz = scan.nextBoolean();
        autobus = scan.nextBoolean();
        if (deszcz && autobus)
            System.out.println("„Weź parasol, „Dostaniesz się na uczelnie");
        if (deszcz && !autobus)
            System.out.println("Nie dostaniesz się na uczelnię");
        if (!deszcz && autobus)
            System.out.println("Dostaniesz się na uczelnie, „Miłego dnia i pięknej pogody");

    }
    // zadanie 6 Napisz program który w zależności od wyboru użytkownika pozwoli na wykonywanie działań
    //dodawania, odejmowania, iloczynu, ilorazu i reszty z dzielenia

      public static void zadanie6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź a: ");
        double a = scan.nextDouble();
        System.out.println("Wprowadź b: ");
        double b = scan.nextDouble();
        System.out.println("1.Dodawanie: ");
        System.out.println("2.Odejmowanie: ");
        System.out.println("3.Mnozenie: ");
        System.out.println("4.Dzielenie: ");
        System.out.println("5.Reszta z dzielenia: ");

        double suma = 0, roznica = 0, iloczyn = 0, iloraz = 0, reszta = 0;
        System.out.println("Wybierz opcje: ");
        int choice;
        choice = scan.nextInt();
        if(choice==1){
            suma = a+b;
        System.out.println(suma);
        }
        if(choice==2) {
            roznica = a - b;
            System.out.println(roznica);
        }
        if(choice==3) {
            iloczyn = a * b;
            System.out.println(iloczyn);
        }
        if(choice==4) {
            if (b == 0)
                System.out.println("nie dzieli sie przez 0");
            iloraz = a/b;
            System.out.println(iloraz);
        }

        if(choice==5){
            reszta = a%b;
        System.out.println(reszta);
        }


    }


    public static void main(String[] args) {

        // zadanie1(1,3,-4);
        //zadanie2a(3);
        // zadanie3(1,2,3);
        //zadanie4();
        //zadanie5();
        //zadanie6();

    }


}


