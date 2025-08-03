package ro.real.main;

import ro.real.clase.CoboaraState;
import ro.real.clase.Lift;
import ro.real.clase.UrcaState;

import java.time.LocalDate;

//
  // LocalDate introdus doar pentru revizie in constructor, ca atunci cand se deschide un lift sa aiba si
  // o data de revizie deja stabilita la interval de 1 an.
//

public class Main {
    public static void main(String[] args) {

        Lift lift = new Lift(LocalDate.of(2024,8,3));
        System.out.println("Stare lift: " + lift.getStare().getStare());

        if(lift.verificareRefizieLift()) {
            System.out.println("Liftul necesita o revizie!");
            lift.setDisponibil(false);
        } else {
            System.out.println("Liftul este in termen!");
        }

        System.out.println("---------------------------");


        lift.setStare(new UrcaState());
        lift.urcaEtaj(3);
        lift.cheama();
        lift.setStare(new CoboaraState());
        lift.coboaraEtaj(2);
        lift.cheama();
        lift.coboaraEtaj(2);
        lift.cheama();

        System.out.println("---------------------------");
        lift.pornireLiftKilograme(400);
        lift.urcaEtaj(7);
        lift.cheama();

        System.out.println("---------------------------");

        lift.pornireLiftPersoane(10);
        lift.urcaEtaj(10);
        lift.cheama();



        System.out.println("Stare noua: " + lift.getStare().getStare());
    }
}