public class Jeu {

    public static void main (String[] args){
        System.out.println("Hello Me - Petit jeu pour s'occuper durant le confinement" + "\n");

        Coordonnees c = new Coordonnees("A", 1);
        Bateau bateau1 = new Bateau(c, Flotte.C, Orientation.S);
        System.out.println(bateau1.getCoordonnees());
        System.out.println(bateau1.getTypeBateau());
        System.out.println(bateau1.getDirection());
        System.out.println(bateau1.toString());
    }
}