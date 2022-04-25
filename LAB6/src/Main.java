public class Main {

    public static void main(String[] args) {
    Punkt pkt1 = new Punkt();
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
//ZADANIE1 DOKOŃCZ
    }
}
