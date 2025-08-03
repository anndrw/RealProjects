package ro.real.clase;

public class GalbenCuloare implements SemaforState{
    @Override
    public void schimbaCuloarea(Semafor semafor) {
        System.out.println("Galben ... Verde ...");
        semafor.setStare(new VerdeCuloare());
    }

    @Override
    public String getCuloare() {
        return "Galben";
    }
}
