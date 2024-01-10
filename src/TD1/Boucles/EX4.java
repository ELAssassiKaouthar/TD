package TD1.Boucles;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pgcd = 1;
        int a,b;
        System.out.println("entrer deux entiers non nuls :");
        a = sc.nextInt();
        System.out.println("a = " +a);
        b = sc.nextInt();
        System.out.println("b = " +b);
        for (int i = 1; i<Math.min(a,b);i++){
            if (a%i==0 && b%i==0){
                pgcd = i;
            }
        }
        System.out.println("le pgcd est :" +pgcd);
    }
}
