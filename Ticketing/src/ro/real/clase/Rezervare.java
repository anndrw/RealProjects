package ro.real.clase;

public class Rezervare {
    private final String nume;
    private final Film film;
    private final int rand;
    private final int coloana;


    public Rezervare(String nume, Film film, int rand, int coloana) {
        this.nume = nume;
        this.film = film;
        this.rand = rand;
        this.coloana = coloana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", film=").append(film);
        sb.append(", rand=").append(rand);
        sb.append(", coloana=").append(coloana);
        sb.append('}');
        return sb.toString();
    }
}
