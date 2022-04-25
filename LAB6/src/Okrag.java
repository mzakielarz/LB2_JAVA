public class Okrag {
    Punkt srodek;
    double promien;

    public Okrag(){
        srodek.x = 0.0;
        srodek.y = 0.0;
        promien = 0.0;
    }
    public Okrag(Punkt srodek, double promien){
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia(){
        return Math.PI*Math.pow(promien,2);
    }
    public double getSrednica() {
        return 2 * promien;
    }


    public Punkt getSrodek() {
        return srodek;
    }

    public void setSrodek(Punkt srodek) {
        this.srodek = srodek;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public void wSrodku(Punkt p){
        double LStrona = Math.pow((srodek.x)-(p.x),2)+Math.pow((srodek.y)-(p.y),2);
        double PStrona = Math.pow(promien,2);

        if(LStrona<=PStrona)
            System.out.println("PKT: "+p.x+" "+p.y+" znajduje sie wewnątrz okregu O ("+srodek.x+" "+srodek.y);
        else System.out.println("Punkt leży poza okręgiem");
    }




}
