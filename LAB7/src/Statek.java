public class Statek implements Lata,Plywa {

    @Override
    public void lec() {
        System.out.println("Statek-Nie lata");
    }
    @Override
    public void plyn() {
        System.out.println("Statek-Tak plywa");
    }
}
