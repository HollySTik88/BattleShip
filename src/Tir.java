// Il faut que les tirs aient des coordonées et qu'ils aient un impacte if tir == coordonesbateau return change l'etat
// J'ai un enum sur l'etat, mais il faut que je le passe en case en fonction des tirs
// Il faut que je fasse le lien entre la taille et le nombre de coups qui touchent
// il faut que je repertorie tous les tirs pour indiquer lorsqu'un tir a déja ete effectué

public class Tir {
    private String largeur;
    private int hauteur;

    public Tir (String largeur, int hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return
                "  Coordonees du tir : "
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