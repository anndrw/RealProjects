package ro.real.main;

import ro.real.clase.CinemaTicketing;
import ro.real.clase.Film;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CinemaTicketing cinema = CinemaTicketing.getInstance();
        cinema.adaugaFilm(new Film("Trenul", 150, "19:30"));
        cinema.adaugaFilm(new Film("Elicopterul", 120, "13:30"));

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n1. Afiseaza filme\n2. Afiseaza sala\n3. Rezerva loc\n4. Vezi rezervari\n0. Iesire");
            System.out.println("Alege de la tastatura: ");
            int optiune = scanner.nextInt();

            switch (optiune) {
                case 1 -> cinema.afiseazaFilme();
                case 2 -> cinema.afiseazaSala();
                case 3 -> {
                    System.out.print("Nume: ");
                    scanner.nextLine();
                    String nume = scanner.nextLine();

                    cinema.afiseazaFilme();
                    System.out.print("Alege film: ");
                    int idx = scanner.nextInt();
                    System.out.print("Rand: ");
                    int rand = scanner.nextInt();
                    System.out.print("Coloana: ");
                    int col = scanner.nextInt();

                    if(cinema.rezervaLoc(nume, idx, rand, col)) {
                        System.out.println("Rezervare aprobata!");
                    } else {
                        System.out.println("Locul este ocupat. Rezervare esuata.");
                    }
                }

                case 4 -> cinema.afiseazaRezervari();
                case 0 -> System.exit(0);
            }
        }
    }
}