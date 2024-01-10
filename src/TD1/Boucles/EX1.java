package TD1.Boucles;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int N;
        int factN=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre >0");
        N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            factN*=i;
        }
        System.out.println(N + "! = " +factN);

    }
}
