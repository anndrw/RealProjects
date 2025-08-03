package ro.real.clase;

public class VerdeCuloare implements SemaforState{
    @Override
    public void schimbaCuloarea(Semafor semafor) {
        System.out.println("Verde ... Rosu ...");
        semafor.setStare(new RosuCuloare());
    }

    @Override
    public String getCuloare() {
        return "Verde";
    }
}
