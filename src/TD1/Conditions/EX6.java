package TD1.Conditions;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        int A,B;
        Scanner scan = new Scanner(System.in);
        System.out.println("entrez un entier A :");
        A = scan.nextInt();
        System.out.println("A = "+A);
        System.out.println("entrez un entier B :");
        B = scan.nextInt();
        System.out.println("B = " +B);
        if ((A>0)&&(B>0)||(A<0)&&(B<0))
            System.out.println("le produit AB est positif");
        else
            System.out.println("le produit AB est negatig");
    }
}
