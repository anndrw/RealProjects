package ro.real.main;

import ro.real.clase.Semafor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semafor semafor = new Semafor();

       while (true) {
            System.out.println("Semaforul este: " + semafor.getCuloare());
            Thread.sleep(5000);
            semafor.schimbaStare();
        }

    }
}