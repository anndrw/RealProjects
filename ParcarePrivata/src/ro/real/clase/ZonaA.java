package ro.real.clase;

public class ZonaA extends Parcare{

    public ZonaA(int capacitate, int pret) {
        super(capacitate, pret);
    }

    @Override
    public void parcheaza(Masina masina) {
        if(capacitate > 0){
            capacitate--;
            System.out.println("Masina parcata in ZONA A.");
            afiseazaPlata(masina);
        } else {
            System.out.println("Zona A este plina.");
        }
    }

    @Override
    public void parasesteParcarea(Masina masina) {
        capacitate++;
        System.out.println("Masina a parasit ZONA A.");
    }
}
