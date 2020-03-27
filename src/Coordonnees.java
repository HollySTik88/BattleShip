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

// pour l'instant la position est en "dure" dans jeu mais normalement elle dois renvoyer aux coordonées d'un tableau
// cette position donnera les cases couvertes sur la grilles s'articulant avec la taille (donc le modèle ) + l'orientation du bateau.
// lorsqu'un bateau est placé, il faut enregistrer le recap des cases utilisées pour pouvoir comparer aux tirs
