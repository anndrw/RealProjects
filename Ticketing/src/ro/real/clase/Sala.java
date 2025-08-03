package ro.real.clase;

public class Sala {
    private final Loc[][] locuri;

    public Sala(int randuri, int coloane) {
        locuri = new Loc[randuri][coloane];
        for(int i = 0; i < randuri; i++) {
            for(int j = 0; j < coloane; j++) {
                locuri[i][j] = new Loc(i+1, j+1);
            }
        }
    }

    public boolean rezervaLoc(int rand, int coloana){
        if(locuri[rand-1][coloana-1].esteOcupat()){
            return false;
        } else {
            locuri[rand-1][coloana-1].ocupa();
            return true;
        }
    }

    public void afiseazaLocuri(){
        for(Loc[] rand : locuri) {
            for(Loc loc : rand) {
                System.out.println(loc + " ; ");
            }
            System.out.println("-----");
        }
    }

}
