public class Jeu {

    public static void main (String[] args){
        System.out.println("         ----------------------------------------         "+
                   "\n" +  "Hello Me - Petit jeu pour s'occuper durant le confinement" + "\n"+
                           "         ----------------------------------------         ");

        Coordonnees c = new Coordonnees("A", 1);
        Bateau bateau1 = new Bateau(c, Flotte.C, Orientation.S, EtatBateau.I);
        System.out.println(bateau1.getTypeBateau());
        System.out.println(bateau1.getOrientation());
        System.out.println(bateau1.getCoordonnees());
        System.out.println(bateau1.getEtatBateau());

    }
}