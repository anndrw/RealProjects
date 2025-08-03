package ro.real.clase;

import java.util.ArrayList;
import java.util.List;

public class CinemaTicketing {
    private static CinemaTicketing instanta;
    private final List<Film> filme = new ArrayList<>();
    private final List<Rezervare> rezervari = new ArrayList<>();
    private Sala sala;

    private CinemaTicketing(){
        this.sala = new Sala(7,7);
    }

    public static CinemaTicketing getInstance() {
        if(instanta == null) {
            instanta = new CinemaTicketing();
        }
        return instanta;
    }

    public void adaugaFilm(Film film){
        filme.add(film);
    }

    public void afiseazaFilme(){
        for(int i = 0; i < filme.size(); i++){
            System.out.println((i+1) + ". " + filme.get(i));
        }
    }

    public boolean rezervaLoc(String nume, int idx, int rand, int col) {
        if(idx < 1 || idx > filme.size()) {
            return false;
        }
        Film film = filme.get(idx - 1);
        if(sala.rezervaLoc(rand, col)) {
            rezervari.add(new Rezervare(nume, film, rand, col));
            return true;
        }
        return false;
    }

    public void afiseazaRezervari() {
        rezervari.forEach(System.out::println);
    }

    public void afiseazaSala() {
        sala.afiseazaLocuri();;
    }
}
