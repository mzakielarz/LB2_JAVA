package com.company;

public class Powiesc extends Podrecznik{
    String gatunek;
    Powiesc(String tytul, String imie_autora, String nazwisko_autora, int rok_wydania, String gatunek) {
        super(tytul, imie_autora, nazwisko_autora, rok_wydania);
        this.gatunek=gatunek;

    }

    @Override
    void wypisz() {
        super.wypisz();
        System.out.println("Gatunek: "+gatunek);
    }
}
