package TD1.Boucles;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int somme = 0;
        System.out.println("entrer un entier :");
        N = sc.nextInt();
        for (int i = 1; i<N ; i++){
            if(i%2!=0){
                somme+=i;
            }
        }
        System.out.println("la somme des entiers impaires est :" +somme);
    }

}
