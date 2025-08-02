package ro.real.clase;

public class IdleState implements LiftState{

    @Override
    public void stare(Lift lift) {
        System.out.println("Liftul este in miscare intre etaje.");
    }

    @Override
    public String getStare() {
        return "Idle";
    }
}
