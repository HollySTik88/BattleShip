public class Coordonnees {
    private String largeur;
    private int hauteur;

    public Coordonnees (String largeur, int hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return
                "Coordonees de positionnement  : "
                        + "\n"+
                "     Largeur = " + largeur +
                "\n"+"      -- & -- " + "\n"+
                "     Hauteur = " + hauteur + "\n"
                ;
    }

    public String getLargeur() {
        return largeur;
    }

    public void setLargeur(String largeur) {
        this.largeur = largeur;
    }

    public int getLHauteur(){
        return hauteur;
    }
    public void setHauteur (int hauteur){
        this.hauteur = hauteur;
    }
}