// Zvire.java
public abstract class Zvire {
    private final String typ;

    public Zvire(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    /**
     * Abstraktní metoda, která se v potomcích implementuje
     * tak, aby vypisovala délku správného útvaru (křídla, srsti, těla).
     */
    public abstract void vypisDelku();
}
