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
