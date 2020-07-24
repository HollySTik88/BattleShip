
public class Bateau {
    private Coordonnees coordonnees;
    private Flotte typeBateau;
    private Orientation orientation;
    private EtatBateau etatBateau;

    public Bateau (Coordonnees coordonnees, Flotte typeBateau, Orientation orientation, EtatBateau etatBateau ){
        this.coordonnees = coordonnees;
        this.typeBateau = typeBateau;
        this.orientation = orientation;
        this.etatBateau = etatBateau;
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

    public EtatBateau getEtatBateau() {
        return etatBateau;
    }
}

// ici aussi 