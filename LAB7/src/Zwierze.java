public abstract class Zwierze implements Plywanie,Latanie {
    @Override
    public void lec() {
        System.out.println("Latam");
    }

    @Override
    public void wyladuj() {
        System.out.println("ląduję");
    }

    @Override
    public void plyn() {
        System.out.println("płyne");
    }

    @Override
    public void wynuz() {
        System.out.println("wynurzam sie");
    }

    @Override
    public void zanurz() {
        System.out.println("zanurzam sie");
    }
}
