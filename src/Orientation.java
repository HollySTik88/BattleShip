public enum Orientation {
    N ("Nord"),
    S ("Sud"),
    E ("Est"),
    O ("Ouest"),
    N_E ("Nord-Est"),
    S_E ("Sud-Est"),
    N_O ("Nord-Ouest"),
    S_O ("Sud-Ouest");


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

/*if orientation = sud
   hauteurFin = indice hauteur [] + int flotte.getTaille

   if orientation = nord
   hauteurFin = indice hauteur [] - int flotte.getTaille

   if orientation = Est
   hauteurFin = indice Largeur [] + int flotte.getTaille

   if orientation = Ouest
   hauteurFin = indice Largeur [] - int flotte.getTaille

   if orientation = Nord-Ouest
   hauteurFin = indice hauteur [] - (int flotte.getTaille -1)
   largeurFin = indice largeur [] - (int flotte.getTaille -1)

   if orientation = Nord-est
   hauteurFin = indice hauteur [] - (int flotte.getTaille -1)
   largeurFin = indice largeur [] + (int flotte.getTaille -1)

 if orientation = Sud-Ouest
   hauteurFin = indice hauteur [] + (int flotte.getTaille -1)
   largeurFin = indice largeur [] - (int flotte.getTaille -1)

   if orientation = Sud-est
   hauteurFin = indice hauteur [] + (int flotte.getTaille -1)
   largeurFin = indice largeur [] + (int flotte.getTaille -1)

 */