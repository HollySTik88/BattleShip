public enum Orientation {
    N ("Nord"),
    S ("Sud"),
    E ("Est"),
    O ("Ouest");

    // preciser dans l'interface que nord = vers le haut - sud vers le bas - ouest diagonale gauche - est diagonale droite
    // les diagonales vont compter les cases avec +1 hauteur && + 1 largeur ? (Reflechir aux calculs pour le cadrillage)

    private String orientation;

    Orientation(String orientation){
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }
    public String toString() {
        return "     Direction : " + orientation + "\n";

    }


}