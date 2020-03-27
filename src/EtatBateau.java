public enum EtatBateau {
    I("Intact"),
    T("Touche"),
    C("Coule");

    private String etatBateau;

    EtatBateau(String etatBateau) {
        this.etatBateau = etatBateau;
    }

    public String getEtatBateau() {
        return etatBateau;
    }

    public String toString() {
        return
                "         ----------------------------------------         "+"\n" +
                "                 Etat actuel : " + etatBateau + "\n" +
                "         ----------------------------------------         ";

    }
}

// pour l'instant enum sur l'etat - chercher comment lier avec le break pour comptabiliser les coups

/* if tir.largeur&&tir.hauteur == coordonnes.largeur &&coordonnees.hauteur
    EtatBateau = EtatBateau.T
    if 
 */