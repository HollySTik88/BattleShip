
public class Grille {

    public static void main(String[] args) {

        String plateauJeu[][] = {{"1", "2", "3", "4", "5", "6", "4", "8", "9", "10"},
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}};
        int i = 0, j = 0;

        carac = "";
        Scanner sc = new Scanner(System.in);

        do {
            do {
                i = 0;
                System.out.println("Rentrez un entier entre 1 & 10 pour indiquer la hauteur SVP ");

                carac = sc.nextLine().charAt(0);
                while (i < plateauJeu.length && carac != plateauJeu[i])
                    i++;

                if (i < tableauCaractere.length)
                    System.out.println(" La hauteur choisie est " + carac + " ");

                else while (i >= tableauCaractere.length) ;


                do {
                    System.out.println( carac + "  n'est pas valide !  Voulez-vous essayer à nouveau ? (O/N)");
                    reponse = sc.nextLine().charAt(0);
                } while (reponse != 'N' && reponse != 'O');
            } while (reponse == 'O');

            System.out.println("Au revoir !");

            do {
                j = 0;
                System.out.println("Rentrez une lettre entre A & J pour indiquer la largeur SVP ");

                carac = sc.nextLine().charAt(0);
                while (j < plateauJeu.length && carac != plateauJeu[j])
                    i++;

                if (j < tableauCaractere.length)
                    System.out.println(" La Largeur choisie est :  " + carac + " ");

                else while (j >= tableauCaractere.length) ;


                do {
                    System.out.println(carac + "  n'est pas valide !  Voulez-vous essayer à nouveau ? (O/N)");
                    reponse = sc.nextLine().charAt(0);
                }
                while (reponse != 'N' && reponse != 'O');
            } if (reponse == 'N'); {

            System.out.println("Au revoir !"); }

        }


    }
}

// ce code n'est absolument pas optimisé - reste 4 errreurs et je fatigue ...