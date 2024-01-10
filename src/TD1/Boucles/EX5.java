package TD1.Boucles;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        int n, Fn=1, Fn1 = 1, Fn2=1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter un entier positif n");
        n = s.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println("1 1");
        for (int i = 2; i<=n ; i++){
            Fn = Fn1 + Fn2;
            Fn1 = Fn;
            Fn2 = Fn1;
            System.out.println(Fn + " ");
        }


    }
}
