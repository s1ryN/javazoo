// Obojzivelnici.java
public class Obojzivelnici extends Zvire {
    private double delkaTela; // v cm

    public Obojzivelnici(double delkaTela) {
        super("Obojzivelnici");
        this.delkaTela = delkaTela;
    }

    public double getDelkaTela() {
        return delkaTela;
    }

    public void setDelkaTela(double delkaTela) {
        this.delkaTela = delkaTela;
    }

    @Override
    public void vypisDelku() {
        System.out.println(
            "Typ: " + getTyp() +
            ", délka těla: " + delkaTela + " cm."
        );
    }
}
