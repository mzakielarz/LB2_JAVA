import java.util.*;

public class Uczesticy {
   String imie;
   int wiek, id;
   static int uczestnik_id=0;

    public Uczesticy(String imie, int wiek, int id) {
        this.imie = imie;
        this.wiek = wiek;
        this.id = uczestnik_id++;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public int getId() {
        return id;
    }

    public static int getUczestnik_id() {
        return uczestnik_id;
    }

    @Override
    public String toString() {
        return "Uczesticy{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczesticy)) return false;
        Uczesticy that = (Uczesticy) o;
        return getId() == that.getId() && getWiek() == that.getWiek() && Objects.equals(getImie(),that.getImie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, id);
    }

    void wyswietl(){

   }

    public static void main(String[] args) {

    }

}
