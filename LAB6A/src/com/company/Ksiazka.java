package com.company;

public class Ksiazka extends Podrecznik {

    Ksiazka(String tytul, String imie_autora, String nazwisko_autora, int rok_wydania) {
        super(tytul, imie_autora, nazwisko_autora, rok_wydania);
    }

    @Override
    void wypisz() {
        super.wypisz();
    }
}
