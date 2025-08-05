package ro.real.clase;

public class ZonaB extends Parcare{
    public ZonaB(int capacitate, int pret) {
        super(capacitate, pret);
    }

    @Override
    public void parcheaza(Masina masina) {
        if (capacitate > 0) {
            capacitate--;
            System.out.println("Masina parcata in ZONA B.");
            afiseazaPlata(masina);
        } else {
            System.out.println("Zona B este plina.");
        }
    }

    @Override
    public void parasesteParcarea(Masina masina) {
        capacitate++;
        System.out.println("Masina a parasit ZONA B.");
    }
}
