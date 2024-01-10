package TD1.Tableaux;

public class EX5 {


        public static void main(String[] args) {
            char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

            System.out.println("Tableau initial :");
            afficherTableau(tableau);

            // Effectuer le décalage
            decalerTableau(tableau);

            System.out.println("Tableau modifié :");
            afficherTableau(tableau);
        }

        public static void decalerTableau(char[] tableau) {
            // Stocker le premier élément du tableau
            char premierElement = tableau[0];

            // Décaler tous les éléments vers la gauche
            for (int i = 0; i < tableau.length - 1; i++) {
                tableau[i] = tableau[i + 1];
            }

            // Placer le premier élément à la fin du tableau
            tableau[tableau.length - 1] = premierElement;
        }

        public static void afficherTableau(char[] tableau) {
            for (char element : tableau) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


}
