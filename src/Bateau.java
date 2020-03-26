
public class Bateau {
    private Coordonnees coordonnees;
    private Flotte typeBateau;
    private Orientation direction;

    public Bateau (Coordonnees coordonnees, Flotte typeBateau, Orientation direction ){
        this.coordonnees = coordonnees;
        this.typeBateau = typeBateau;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Votre bateau : "
                +"\n"+
                typeBateau + "\n"+
                direction + "\n"+
                ", " + coordonnees ;
    }


    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

    public Flotte getTypeBateau() {
        return typeBateau;
    }

    public Orientation getDirection () {
        return direction;
    }



}