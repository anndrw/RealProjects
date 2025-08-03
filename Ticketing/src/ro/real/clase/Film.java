package ro.real.clase;

public class Film {
    private String denumire;
    private int durata;
    private String ora;

    public Film(String denumire, int durata, String ora) {
        this.denumire = denumire;
        this.durata = durata;
        this.ora = ora;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getDurata() {
        return durata;
    }

    public String getOra() {
        return ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", durata=").append(durata);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

