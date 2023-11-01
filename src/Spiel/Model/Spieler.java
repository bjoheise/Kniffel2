package Spiel.Model;

public class Spieler {
    private String spielername;
    private int punktzahl;

    public Spieler(String name, int punkte) {
        this.spielername = name;
        this.punktzahl = punkte;

    }

    public Spieler() {

    }

    public String getSpielername() {
        return spielername;
    }

    public void setSpielername(String punkte) {
        this.spielername = punkte;
    }

    public int getPunktzahl() {
        return punktzahl;
    }

    public void setPunktzahl(int punkte) {
        this.punktzahl = punkte;
    }

}
