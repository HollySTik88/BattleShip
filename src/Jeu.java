public class Jeu {

    /*
    Ici normalement c'est le joeur 1 qui doit positionner ses bateaux, il est supposé choisir son type de bateau et indiquer leurs position
    en répondant à des questions du programme.
    L'ideal serait de lui proposer chaque type de bateau en réduisant la liste au fur et à mesure,
    de lui demander l'orientation
    de lui demander la coordonée de placement
    Ensuite lui renvoyer le recap pour chacun et enfin le schema sur la grille (avec des étoiles par exemple)
    Pour l'instant les informations ne sont qu'un modèle.
     */

    public static void main (String[] args){
        System.out.println("         ----------------------------------------         "+
                   "\n" +  "Hello Me - Petit jeu pour s'occuper durant le confinement" + "\n"+
                           "         ----------------------------------------         ");

        Coordonnees c = new Coordonnees("A", 1);
        Bateau bateau1 = new Bateau(c, Flotte.C, Orientation.S, EtatBateau.I);
        Tir t = new Tir ("C", 3);
        Adversaire coup1 = new Adversaire(t);

        System.out.println(bateau1.getTypeBateau());
        System.out.println(bateau1.getOrientation());
        System.out.println(bateau1.getCoordonnees());
        System.out.println(bateau1.getEtatBateau());
        System.out.println(coup1.getTir());



    }

    // ici je suis sur la partie joueur je dois donc leurs demander de faire des actions "entrer des coordonées de  tir"
// ces coordonées entre en variables et font le lien avec les coordonées du bateau

/*
hauteur :
     do
            {
            try
                {
                System.out.println("Entrez la hauteur (entre 0 & 10)") ;
                ligne = Integer.parseInt(in.readLine()) + 2 ;
                }
            catch (NumberFormatException e)
                {
                System.out.println("\nVeuillez entrer un entier entre 0 & 10 pour la hauteur\n");
                erreur = true ;
                }
            }
        while(erreur != false && ligne < 10) ;

Largeur :
        erreur = false ;

         do
            {
            try
                {
                System.out.println("Entrez la largeur (entre A & J)") ;
                ligne = Integer.parseInt(in.readLine()) + 2 ;
                }
            catch (StringFormatException e)
                {
                System.out.println("\nVeuillez entrer une lettre entre A & J pour la hauteur\n");
                erreur = true ;
                }
            }
        while(erreur != false && ligne < 10) ;


        erreur = false ;
 */

}