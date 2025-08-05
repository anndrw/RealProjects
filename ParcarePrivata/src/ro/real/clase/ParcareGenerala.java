package ro.real.clase;

public class ParcareGenerala {
    private ZonaA zonaA;
    private ZonaB zonaB;

    public ParcareGenerala() {
        this.zonaA = new ZonaA(3, 7);
        this.zonaB = new ZonaB(7, 5);
    }

    public void parcheaza(Masina masina) {
        if (zonaA.getCapacitate() > 0) {
            zonaA.parcheaza(masina);
        } else if (zonaB.getCapacitate() > 0) {
            zonaB.parcheaza(masina);
        } else {
            System.out.println("Toate zonele sunt pline. Nu se poate parca.");
        }
    }

    public void parasesteParcarea(Masina masina, String zona) {
        if (zona.equalsIgnoreCase("A")) {
            zonaA.parasesteParcarea(masina);
        } else if (zona.equalsIgnoreCase("B")) {
            zonaB.parasesteParcarea(masina);
        }
    }

    public int capacitateTotala() {
        return zonaA.getCapacitate() + zonaB.getCapacitate();
    }
}
