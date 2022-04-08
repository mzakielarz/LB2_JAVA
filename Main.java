import java.util.Scanner;

public class Main {

  /*public static void  imie(){
        String imie = "Michał";
        int wiek = 21;
      System.out.println(imie+" "+ wiek);

  }*/


/*public static void zadanie2 (double a,double b){
    double suma = 0;
    double roznica = 0;
    double iloczyn = 0;
    suma = a+b;
    roznica=a-b;
    iloczyn= a*b;
    System.out.println(suma+" "+roznica+" "+iloczyn);

}*/
/*public static boolean zadanie3(int a){
        if(a%3==0 && a%5==0)
            return true;
        else
            return false;

    }*/
   /* public static boolean zadanie5(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2))
            return true;
        else;
        return false;
    }*/

   /* public static void zadanie1a(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a==0)
            System.out.println("To nie jest równanie kwadratowe xDDDDD");
        else;
        if ( a!=0){
            double delta = 0;
            delta = Math.pow(b,2)-4*(a*c);
            if(delta < 0)
                System.out.println("Nie będę liczył zespolonych. Dominik policzy");
            else if(delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Rozwiązania: "+x1+" "+x2);
            }
            if(delta == 0){
                double x3 = -b/2*a;
                System.out.println("Rozwiązanie: "+x3);
            }
        }


    }*/
    /*public static double zadanie2a(double x){

        if(x>2) return 2+x;
        if (x==2) return 8;
        return x-4;
    }*/
 /*  public static void zadanie3av2(double a, double b, double c){
    if(a<c && a<b && b<c) System.out.println(a+" "+b+" "+c); //1,2,3
    if(b<a && b<c && c<a) System.out.println(b+" "+c+" "+a); //2,3,1
    if(c<b && c<a && a<b) System.out.println(c+" "+a+" "+b); //3,2,1
    if(a<c && a<b && bc) System.out.println(c+" "+b+" "+a); //3,1,2
    if(b<a && b<c && ca) System.out.println(a+" "+c+" "+b); //1,3,2
    if(c<b && c<a && ab) System.out.println(b+" "+a+" "+c); //2,1,3
   }*/



  /*public static void zadanie4(){
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
  }*/

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
                System.out.println("nie dzieli sie przez 0 debilu, ale Dominik policzy granice <3");
            iloraz = a/b;
            System.out.println(iloraz);
        }

        if(choice==5){
            reszta = a%b;
        System.out.println(reszta);
        }


    }

    public static void main(String[] args) {
        // imie();
        // adanie2(1,2);
        // System.out.println(zadanie3(7));
        // System.out.println(zadanie5());
        // zadanie1a();
       // System.out.println(zadanie2a(1));
        /*zadanie3av2(1,2,3);
        System.out.println();
        zadanie3av2(2,3,1);
        System.out.println();
        zadanie3av2(3,2,1);
        System.out.println();
        zadanie3av2(3,1,2);
        System.out.println();
        zadanie3av2(1,3,2);
        System.out.println();
        zadanie3av2(2,1,3);*/
      //  zadanie4();
        zadanie6();



    }
}
