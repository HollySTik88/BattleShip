public class Coordonnees {
    private String hauteur;
    private int largeur;

    public Coordonnees (String hauteur, int largeur){
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Coordonnees{" +
                "hauteur ='" + hauteur + '\'' +
                ", largeur =" + largeur +
                '}';
    }

    public String getHauteur() {
        return hauteur;
    }

    public void setHauteur(String hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur(){
        return largeur;
    }
    public void setLargeur (int largeur){
        this.largeur = largeur;
    }
}