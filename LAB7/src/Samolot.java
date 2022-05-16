public class Samolot implements Lata,Plywa {
    @Override
    public void lec() {
        System.out.println("Samolot-Tak lata");
    }

    @Override
    public void plyn() {
        System.out.println("Samolot-Nie plywa");
    }
}
