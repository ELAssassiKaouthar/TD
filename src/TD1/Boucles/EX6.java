package TD1.Boucles;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 15;
        System.out.println("combinaisons d'entiers dont la somme est égale à "+ total + " : ");
        trouverCombinaisons(total);
    }

    private static void trouverCombinaisons(int total) {
        for(int i = 1 ; i<=9 ; i++){
            for ( int j= 1 ; j<= 9 ; j++){
                for (int k= 1; k<=9; k++){
                    if(i + j + k == total) {
                        System.out.println(i + " + " + j + " + " + k +" = " + total);
                    }
                }
            }
        }
    }
}
