// Savci.java
public class Savci extends Zvire {
    private double delkaSrsti; // v cm

    public Savci(double delkaSrsti) {
        super("Savci");
        this.delkaSrsti = delkaSrsti;
    }

    public double getDelkaSrsti() {
        return delkaSrsti;
    }

    public void setDelkaSrsti(double delkaSrsti) {
        this.delkaSrsti = delkaSrsti;
    }

    @Override
    public void vypisDelku() {
        System.out.println(
            "Typ: " + getTyp() +
            ", délka srsti: " + delkaSrsti + " cm."
        );
    }
}
