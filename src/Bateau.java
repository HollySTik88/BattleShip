
public class Bateau {
    private Coordonnees coordonnees;
    private Flotte typeBateau;
    private Orientation orientation;

    public Bateau (Coordonnees coordonnees, Flotte typeBateau, Orientation orientation ){
        this.coordonnees = coordonnees;
        this.typeBateau = typeBateau;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Votre bateau : "
                +"\n"+
                typeBateau + "\n"+
                orientation + "\n"+
                ", " + coordonnees ;
    }


    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

    public Flotte getTypeBateau() {
        return typeBateau;
    }

    public Orientation getOrientation () {
        return orientation;
    }



}