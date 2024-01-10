package TD1.Boucles;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.println("entrer le nombre de ligne N");
        N = s.nextInt();

        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
