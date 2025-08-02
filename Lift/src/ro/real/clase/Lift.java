package ro.real.clase;

public class Lift {
    private int etajCurent;
    private LiftState stare;

    public Lift() {
        this.etajCurent = 0;
        this.stare = new IdleState();
    }

    public int getEtajCurent() {
        return etajCurent;
    }

    public void setEtajCurent(int etajCurent) {
        this.etajCurent = etajCurent;
    }

    public LiftState getStare() {
        return stare;
    }

    public void setStare(LiftState stare) {
        this.stare = stare;
    }

    public void urcaEtaj(int floor){
        System.out.println("Liftul urca de la etajul " + etajCurent + " la etajul " + floor);
        this.etajCurent = floor;
    }

    public void coboaraEtaj(int floor){
        System.out.println("Liftul coboara de la etajul " + etajCurent + " la etajul " + floor);
        this.etajCurent = floor;
    }

    public void cheama(){
        stare.stare(this);
    }
}
