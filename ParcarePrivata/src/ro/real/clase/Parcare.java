package ro.real.clase;

public abstract class Parcare implements IParcheaza{
    protected int capacitate;
    protected int pret;

    public Parcare(int capacitate, int pret) {
        this.capacitate = capacitate;
        this.pret = pret;
    }

    public int getCapacitate() {
        return capacitate;
    }

    protected void afiseazaPlata(Masina masina) {
        int taxa = masina.getDurataOre() * pret;
        System.out.println("Masina " + masina.getNrInmatriculare() +
                " trebuie sa plateasca " + taxa + " lei pentru " + masina.getDurataOre() + " ore.");
    }


}
