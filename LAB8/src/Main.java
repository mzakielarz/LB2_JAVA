import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    ////ZAD2
    public static int silnia(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("nie istnieje silnia z liczby <=0");
        }
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }

        return wynik;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ///z1
    /*    double a =0;

       while(true) {
           try {
               a = scan.nextDouble();
               break;
           } catch (InputMismatchException e) {
               System.out.println("błędna wartość");
               scan.next();
           }
       }
       //==================================================
        if(a<0){
            throw new IllegalArgumentException(String.format("Pierwiastek z liczby %.4f nie istnieje",a));
        }*/

        try {
            System.out.println("5! = " + silnia(5));
            System.out.println("-2! = " + silnia(-2));
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd " + e.getMessage());
        }
        ///z3
        try{
            NieprawidlowyAdresException ob1 = new NieprawidlowyAdresException("jasna",null,"rzeszów",23);
            System.out.println(ob1);

        }
        catch (NieprawidlowyAdresException e){
            e.getMessage();

        }

    }


}
