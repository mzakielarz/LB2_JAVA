public class NieprawidlowyAdresException extends Exception {
    String ulica, kod_pocztowy, miasto;
    int nr_domu;

    public NieprawidlowyAdresException(String ulica, String kod_pocztowy, String miasto, int nr_domu) throws NieprawidlowyAdresException {
        String blad ="";
        if(ulica==null) blad+= "ulica nie może być null";
        if(kod_pocztowy==null) blad+= "kod nie może być null";
        if(miasto==null) blad+= "miasto nie może być null";
        if(nr_domu<=0) blad+= "nr nie może być null";
        //if(!blad.equals("")) throw new NieprawidlowyAdresException(blad);

        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
        this.nr_domu = nr_domu;
    }
}
