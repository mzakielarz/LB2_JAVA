import java.util.Scanner;

public class Student {
    String imie;
    String nazwisko;
    int nr_indexu;
    int rok_studiow;
    String[] tab;
    int m;


    public Student(String imie, String nazwisko, int nr_indexu, int rok_studiow, int m) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indexu = nr_indexu;
        this.rok_studiow = rok_studiow;
        this.m = m;
        this.tab = new String[m];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj przedmiot: ");
            tab[i] = scan.nextLine();
        }


    }

    public Student(String imie, String nazwisko, int nr_indexu, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indexu = nr_indexu;
        this.rok_studiow = rok_studiow;

    }

    public void metoda1() {
        System.out.println(imie + " " + nazwisko + " " + nr_indexu + " " + rok_studiow);
        for (int i = 0; i < m; i++) {
            System.out.println(tab[i]);
        }
    }

    public String metoda2() {
        return imie + " " + nazwisko;
    }

    public int metoda3() {
        return nr_indexu;
    }

    public int metoda4() {
        return rok_studiow;
    }

    public int metoda5() {
        return rok_studiow + 1;
    }

    public void metoda6(String przedmiot) {
        Scanner scan = new Scanner(System.in);
        przedmiot = scan.nextLine();
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println(przedmiot);
    }


}
