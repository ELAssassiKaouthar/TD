package TD1.Tableaux;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants N : ");
        int N = scanner.nextInt();

        double[] moyennes = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("T[" + (i + 1) + "] : ");
            moyennes[i] = scanner.nextDouble();
        }

        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        int nombreEtudiantsAuDessusDuSeuil = 0;
        for (int i = 0; i < N; i++) {
            if (moyennes[i] >= seuil) {
                nombreEtudiantsAuDessusDuSeuil++;
            }
        }
        System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + nombreEtudiantsAuDessusDuSeuil);
    }
}
