public class Student extends Osoba {
    String nr_albumu;

    public Student(String imie, String nazwisko, String nr_albumu) {
        super(imie, nazwisko);
        this.nr_albumu = nr_albumu;
    }
}
