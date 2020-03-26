public enum Flotte {
    P_A ("Porte-Avion",  5),
    C ("Croiseur", 4),
    C_T ("Contre-Torpilleur",  3),
    S_M ("Sous-Marin",  3),
    T ("Torpilleur", 2);

    // Voir si la modification CROISEUR (4); n'est pas plus optimisée -> programme simplifié au maximum ou programme détaillé ?

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
        return "Bateau selectionne: " +
        "\n" + "     Type : " + typeBateau +
        "\n" + "     Taille : " + taille ;
    }


}