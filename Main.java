// ZOOpark.java
public class Main {
    public static void main(String[] args) {
        // Vytvoříme několik zvířat a demonstrujeme polymorfismus:
        Zvire[] zoo = new Zvire[] {
            new Ptaci(32.5),
            new Savci(12.0),
            new Obojzivelnici(8.3)
        };

        for (Zvire z : zoo) {
            z.vypisDelku();
        }
    }
}
