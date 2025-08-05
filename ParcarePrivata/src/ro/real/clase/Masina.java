package ro.real.clase;

public class Masina{
    private String nrInmatriculare;
    private int durataOre;

    public Masina(String nrInmatriculare, int durataOre) {
        this.nrInmatriculare = nrInmatriculare;
        this.durataOre = durataOre;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public int getDurataOre() {
        return durataOre;
    }
}
