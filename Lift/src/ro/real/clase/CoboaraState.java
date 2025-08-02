package ro.real.clase;

public class CoboaraState implements LiftState{

    @Override
    public void stare(Lift lift) {
        System.out.println("Liftul acum coboara.");
        lift.setStare(new IdleState());
    }

    @Override
    public String getStare() {
        return "Coboara";
    }
}
