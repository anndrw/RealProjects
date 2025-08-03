package ro.real.clase;

public class Loc {
    private final int rand;
    private final int coloana;
    private boolean eOcupat;

    public Loc(int rand, int coloana) {
        this.rand = rand;
        this.coloana = coloana;
        this.eOcupat = false;
    }

    public boolean esteOcupat(){
        return eOcupat;
    }

    public void ocupa() {
        this.eOcupat = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Loc{");
        sb.append("rand=").append(rand);
        sb.append(", coloana=").append(coloana);
        sb.append(", eOcupat=").append(eOcupat);
        sb.append('}');
        return sb.toString();
    }
}
