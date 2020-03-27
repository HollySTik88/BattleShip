
public class Grille {

    /* ce code n'est absolument pas optimisé - reste 3 errreurs et je fatigue ...
doit encore renvoyer les deux coordonees + les enregistrer et faire le caclule de la place que prendra le bateau

 */

    public static void main(String[] args) {

        String plateauJeu[][] = {{"1", "2", "3", "4", "5", "6", "4", "8", "9", "10"},
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}};
        int i = 0, j = 0;

        String hauteur = "";
        String largeur = "";
        String reponse = "";
        Scanner sc = new Scanner(System.in);

        do {
            do {
                i = 0;
                System.out.println("Entrez un entier entre 1 & 10 pour indiquer la hauteur SVP ");

                hauteur = sc.nextLine().charAt(0);
                while (i < plateauJeu.length && hauteur != plateauJeu[i])
                    i++;

                if (i < tableauCaractere.length)
                    System.out.println(" La hauteur choisie est " + hauteur + " ");

                else while (i >= plateauJeu.length) ;


                do {
                    System.out.println( hauteur + "  n'est pas valide !  Voulez-vous essayer à nouveau ? (O/N)");
                    reponse = sc.nextLine().charAt(0);
                } while (reponse != 'N' && reponse != 'O');
            } while (reponse == 'O');

            System.out.println("Au revoir !");

            do {
                j = 0;
                System.out.println("Entrez une lettre entre A & J pour indiquer la largeur SVP ");

                largeur = sc.nextLine().charAt(0);
                while (j < plateauJeu.length && largeur != plateauJeu[j])
                    i++;

                if (j < tableauCaractere.length)
                    System.out.println(" La Largeur choisie est :  " + largeur + " ");

                else while (j >= plateauJeu.length) ;
                do {
                    System.out.println(largeur + "  n'est pas valide !  Voulez-vous essayer à nouveau ? (O/N)");
                    reponse = sc.nextLine().charAt(0);
                }
                while (reponse != 'N' && reponse != 'O');
            } while (reponse == '0');

            System.out.println("Au revoir !");

            System.out.println("Vos coordonees sont " + hauteur + " en hauteur et " + largeur + "en largeur");

        }


    }
}