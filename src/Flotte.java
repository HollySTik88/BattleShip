public enum Flotte {
    P_A ("Porte-Avion",  5),
    C ("Croiseur", 4),
    C_T ("Contre-Torpilleur",  3),
    S_M ("Sous-Marin",  3),
    T ("Torpilleur", 2);

    private String typeBateau;
    private int taille;

    Flotte(String typeBateau, int taille){
        this.typeBateau = typeBateau;
        this.taille = taille;
    }

    public String getTypeBateau() {
        return typeBateau;
    }

    public int getTaille() {
        return taille;
    }

    public String toString() {
        return "Type selectionne -> "  + typeBateau + " taille : " + taille ;
    }


}