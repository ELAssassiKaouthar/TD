package TD1.Conditions;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.println("entrez un entier de 3 chiffres non nuls");
            n = s.nextInt();
        } while (n<100 || n>999);

        System.out.println(" les nombres formés par les chiffres de N = " +n + " sont : ");
        afficherNombresFormes(n);
    }

    private static void afficherNombresFormes( int n) {
        int [] chiffres = new int[3];
        chiffres [0] = n/100;
        chiffres [1] = (n%100)/10;
        chiffres [2] = n% 10;
        genererPermutations(chiffres, 0, chiffres.length-1);
    }

    private static void genererPermutations(int [] chiffres, int debut, int fin) {
        if(debut == fin) {
            int nombreForme = chiffres[0] * 100 + chiffres[1] * 10 + chiffres[2];
            System.out.println(nombreForme + " ");
        } else {
            for (int i = debut; i<= fin; i++){
                echanger(chiffres, debut, i);
                genererPermutations(chiffres, debut+1,fin);
                echanger(chiffres,debut, i);
            }
        }
    }

    private static void echanger(int [] tableau, int i, int j){
        int temp = tableau[i];
        tableau[i] = tableau[j];
        tableau[j] = temp;
    }
}
