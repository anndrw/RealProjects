package ro.real.main;

import ro.real.clase.*;

public class Main {
    public static void main(String[] args) {
        ParcareGenerala parcare = new ParcareGenerala();

        Masina m1 = new Masina("B123ABC", 2);
        Masina m2 = new Masina("B456DEF", 1);
        Masina m3 = new Masina("B789XYZ", 4);
        Masina m4 = new Masina("GL78PRC", 2);
        Masina m5 = new Masina("GL18NDR", 3);

        parcare.parcheaza(m1);
        parcare.parcheaza(m2);
        parcare.parcheaza(m3);
        parcare.parcheaza(m4);
        parcare.parcheaza(m5);

        parcare.parasesteParcarea(m1, "A");
        parcare.parasesteParcarea(m2, "A");
        System.out.println("Capacitate disponibila: " + parcare.capacitateTotala());
    }
}