public enum Flotte {
    PORTE_AVION ("PA"),
    CROISEUR ("C"),
    CONTRE_TORPILLEUR ("CT"),
    SOUS_MARIN ("SA"),
    TORPILLEUR ("T");

    private String abreviation;

    Flotte(String abreviation){
        this.abreviation = abreviation;
    }

    public String getAbreviation() {
        return abreviation;
    }
}