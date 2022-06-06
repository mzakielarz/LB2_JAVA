
import java.util.ArrayList;
import java.util.Iterator;

public class Mapy {
    public static void main(String[] args) {
        ArrayList<Object> listaKangurow = new ArrayList<>();
        Kangur k1 = new Kangur(1);Kangur k2 = new Kangur(2);Kangur k3 = new Kangur(3);
        Kangur k4 = new Kangur(4);Kangur k5 = new Kangur(5);Kangur k6 = new Kangur(6);
        Kangur k7 = new Kangur(7);Kangur k8 = new Kangur(8);Kangur k9 = new Kangur(9);
        Kangur k10 = new Kangur(10);
       /* listaKangurow.add(k1.skok());
        listaKangurow.add(k2.skok());
        listaKangurow.add(k3.skok());
        listaKangurow.add(k4.skok());
        listaKangurow.add(k5.skok());
        listaKangurow.add(k6.skok());
        listaKangurow.add(k7.skok());
        listaKangurow.add(k8.skok());
        listaKangurow.add(k9.skok());
        listaKangurow.add(k10.skok());*/
      /*  Iterator<Object>listaKangurowIterator = listaKangurow.iterator();
        while(listaKangurowIterator.hasNext()){
            System.out.println(listaKangurowIterator.next());
        }*/
        listaKangurow.add(k1);  listaKangurow.add(k2);
        for (int i = 0; i < listaKangurow.size(); i++) {
            System.out.println(listaKangurow.get(i));
        }
       // System.out.println(listaKangurow.get(1));


    }
}
