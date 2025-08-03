package ro.real.clase;

public class RosuCuloare implements SemaforState{
    @Override
    public void schimbaCuloarea(Semafor semafor) {
        System.out.println("Rosu ... Galben ...");
        semafor.setStare(new GalbenCuloare());
    }

    @Override
    public String getCuloare() {
        return "Rosu";
    }
}
