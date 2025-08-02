package ro.real.clase;

public class UrcaState implements LiftState{
    @Override
    public void stare(Lift lift) {
        System.out.println("Liftul urca!");
        lift.setStare(new IdleState());
    }

    @Override
    public String getStare() {
        return "Urca";
    }
}
