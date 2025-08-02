package ro.real.main;

import ro.real.clase.CoboaraState;
import ro.real.clase.Lift;
import ro.real.clase.UrcaState;

public class Main {
    public static void main(String[] args) {
        Lift lift = new Lift();
        System.out.println("Stare lift: " + lift.getStare().getStare());

        lift.setStare(new UrcaState());
        lift.setEtajCurent(0);
        lift.urcaEtaj(3);
        lift.cheama();
        lift.setStare(new CoboaraState());
        lift.coboaraEtaj(2);
        lift.cheama();


        System.out.println("Stare noua: " + lift.getStare().getStare());
    }
}