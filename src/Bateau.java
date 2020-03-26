
public class Bateau {
    private Coordonnees coordonnees;
    private Flotte modele;
    private Orientation orientation;

    public Bateau (Coordonnees coordonnees, Flotte modele, Orientation orientation ){
        this.coordonnees = coordonnees;
        this.modele = modele;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Votre bateau : " +
                "coordonnees = " + coordonnees +
                ", Bateau = " + modele +
                ", Direction = " + orientation ;
    }


    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

    public Flotte getModele() {
        return modele;
    }

    public Orientation getOrientation () {
        return orientation;
    }



}