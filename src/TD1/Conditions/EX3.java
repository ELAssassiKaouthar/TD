package TD1.Conditions;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int a, b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le nombre a :");
        a = sc.nextInt();
        System.out.println("entrez le nombre b :");
        b = sc.nextInt();
        System.out.println("1: pour savoir la parité de la somme a+b");
        System.out.println("2: pour savoir la parité du produit a*b");
        System.out.println("3: pour savoir le signe de la somme a+b");
        System.out.println("4: pour savoir le signe du produit a*b");

        int option = sc.nextInt();
        switch (option){
            case 1: if((a+b)%2==0)
                System.out.println( "la somme est paire");
            else
                System.out.println( "la somme est impaire");
                break;
            case 2: if((a*b)%2==0)
                System.out.println( "le produit est paire");
            else
                System.out.println( "le produit est impaire");
                break;
            case 3: if((a+b)>0)
                System.out.println( "la sommme est positive");
            else System.out.println( "la somme est negative");
                break;
            case 4: if((a*b)>0)
                System.out.println("le produit est positif");
            else
                System.out.println("le prduit est negatif");
            break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
