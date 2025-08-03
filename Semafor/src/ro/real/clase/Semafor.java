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

    public void trecereSemaforPietoni(int nrPersoane) {
        if (nrPersoane > 0) {
            if(stare.getCuloare().equals("Rosu") || stare.getCuloare().equals("Galben")) {
                System.out.println("Pietonii nu se pot angaja in trecere.");
            } else if (stare.getCuloare().equals("Verde")) {
                System.out.println("Pietonii se pot angaja in trecere.");
            }
        }
    }
}
