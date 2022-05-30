import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        List<Uczesticy> uczestnicy = new LinkedList<>(Arrays.asList(
           new Uczesticy("Jan",15,1),
           new Uczesticy("Karol",19,1),
           new Uczesticy("Jurek",22,1),
           new Uczesticy("Alina",6,1)
                ));
        uczestnicy.add(new Uczesticy("Jarosław",16,1));
        uczestnicy.add(new Uczesticy("Tosia",18,1));
        System.out.println("Lista uczestników");
        for (Uczesticy uczestnik: uczestnicy) {
            System.out.println(uczestnik.toString());
        }
    }
}
