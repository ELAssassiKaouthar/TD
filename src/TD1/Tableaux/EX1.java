package TD1.Tableaux;
import java.util.Scanner;
public class EX1 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Entrez le nombre d'entiers (10 <= N <= 50) : ");
                int N = scanner.nextInt();

                if (N < 10 || N > 50) {
                    System.out.println("Le nombre d'entiers doit être compris entre 10 et 50.");
                    return;
                }

                int[] T = new int[N];

                System.out.println("Entrez les " + N + " entiers : ");
                for (int i = 0; i < N; i++) {
                    System.out.print("T[" + (i + 1) + "] : ");
                    T[i] = scanner.nextInt();
                }

                afficherMaxMin(T);
            }

            public static void afficherMaxMin(int[] tableau) {
                int max = tableau[0];
                int min = tableau[0];

                for (int i = 1; i < tableau.length; i++) {
                    if (tableau[i] > max) {
                        max = tableau[i];
                    }
                    if (tableau[i] < min) {
                        min = tableau[i];
                    }
                }

                System.out.println("La valeur maximale du tableau est : " + max);
                System.out.println("La valeur minimale du tableau est : " + min);
            }




}
