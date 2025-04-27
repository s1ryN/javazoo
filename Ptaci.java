// Ptaci.java
public class Ptaci extends Zvire {
    private double delkaKridla; // v cm

    public Ptaci(double delkaKridla) {
        super("Ptaci");
        this.delkaKridla = delkaKridla;
    }

    public double getDelkaKridla() {
        return delkaKridla;
    }

    public void setDelkaKridla(double delkaKridla) {
        this.delkaKridla = delkaKridla;
    }

    @Override
    public void vypisDelku() {
        System.out.println(
            "Typ: " + getTyp() +
            ", délka křídla: " + delkaKridla + " cm."
        );
    }
}
