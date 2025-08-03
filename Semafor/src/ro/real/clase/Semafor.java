package ro.real.clase;

public class Semafor {
    private SemaforState stare;

    public Semafor(){
        this.stare = new RosuCuloare();
    }

    public SemaforState getStare() {
        return stare;
    }

    public void setStare(SemaforState stare) {
        this.stare = stare;
    }

    public void schimbaStare(){
        stare.schimbaCuloarea(this);
    }

    public String getCuloare() {
        return stare.getCuloare();
    }
}
