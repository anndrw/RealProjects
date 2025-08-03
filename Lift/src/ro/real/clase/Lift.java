package ro.real.clase;

import java.time.LocalDate;
import java.util.Date;

public class Lift {
    private int etajCurent;
    private LiftState stare;
    private boolean disponibil = true;
    private LocalDate dataRevizie;


    public Lift(LocalDate dataRevizie) {
        this.etajCurent = 0;
        this.stare = new IdleState();
        this.dataRevizie = dataRevizie;
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


    public LocalDate getDataRevizie() {
        return dataRevizie;
    }

    public void setDataRevizie(LocalDate dataRevizie) {
        this.dataRevizie = dataRevizie;
    }

    public void urcaEtaj(int floor){
        if(!disponibil){
            System.out.println("Momentan indisponibil.");
        } else {
            System.out.println("Liftul urca de la etajul " + etajCurent + " la etajul " + floor);
            this.etajCurent = floor;
        }

    }

    public void coboaraEtaj(int floor){
        if(!disponibil) {
            System.out.println("Momentan indisponibil.");

        } else {
            System.out.println("Liftul coboara de la etajul " + etajCurent + " la etajul " + floor);
            this.etajCurent = floor;
        }

    }


    public void setDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }

    public void pornireLiftPersoane(int nrPersoane){
        if(nrPersoane > 5) {
            System.out.println("Liftul nu poate functiona daca sunt mai mult de 5 persoane in acesta.");
            setDisponibil(false);
        } else {
            System.out.println("Liftul cu " + nrPersoane + " poate pleca!");
        }
    }

    public void pornireLiftKilograme(int kg){
        if(kg > 550) {
            System.out.println("Liftul nu poate functiona daca sunt 550kg in acesta.");
            setDisponibil(false);
        } else {
            System.out.println("Liftul cu " + kg + " kg poate pleca!");
        }
    }

    public boolean verificareRefizieLift(){
        if(dataRevizie == null) {
            return true;
        }
        LocalDate acum = LocalDate.now();
        return dataRevizie.plusYears(1).isBefore(acum);
    }

    public void cheama(){
        if(!disponibil){
            System.out.println("Momentan indisponibil!");
        } else {
            stare.stare(this);
        }
    }
}
