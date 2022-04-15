import java.util.Scanner;

public class Main {


    public static void zadanie1(){
        double N;
        int a;
        int b;
        int ileN = 0;
        int ileAB = 0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if(i%3==0) ileN++;
        }
        for (int i = a; i <=b ; i++) {
            if(i%3==0) ileAB++;
        }
        System.out.println("Liczba podizelnych przez 3 w przedziale N: "+ileN);
        System.out.println("Liczba podizelnych przez 3 w przedziale ab: "+ileAB);
    }

    public static void zadanie2(double z){
        double[] T = new double[50];
        double fx = 0;
        int x=0;
        int y=0;
        double suma = 0;
        double sumaD = 0;
        double sumaU = 0;

        for (int i = 0; i < 50; i++) {
            T[i] = Math.cos(i+1)-2*Math.sin(i);
            System.out.println(T[i]);
            suma = suma +T[i];
            if(T[i]>=0) sumaD +=T[i];
            if(T[i]<0) sumaU += T[i];
        }
        double max = T[0];
        double min = T[0];
        for (int i = 1; i < 50; i++) {
            if(T[i]>max){
                max = T[i];
                x=i;
            }
            if(T[i]<min){
                min = T[i];
                y=i;
            }
        }



        System.out.println("Max tablicy T: "+max+" "+"Min: "+min);
        System.out.println("Kolejno znajdują się na miejscach: "+x+" i "+y);
        System.out.println("Suma: "+suma);
        System.out.println("SumaD: "+sumaD);
        System.out.println("SumaU: "+sumaU);

    }



    public static void main(String[] args) {
        // zadanie1();
       // zadanie2(0);
    Student s1 = new Student("Jan","Kowalski",122983,2);

    Student s2 = new Student("Jan","Duda",2321,1,3);
       s2.metoda1();
        System.out.println(s2.metoda2());
        System.out.println(s2.metoda3());
        System.out.println(s2.metoda4());
        System.out.println(s2.metoda5());




    }
}
