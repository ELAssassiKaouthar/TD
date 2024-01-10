package TD1.Boucles;
import java.util.Scanner;


public class EX3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        int max = Integer.MIN_VALUE;
        int position = 0;
        int j=1;
        // question 1 et 2
        /*for (int i = 1; i<=20 ; i++){
            System.out.println("Saisir un nombre ");
            N = s.nextInt();
            if(N> max) {
                max = N;
                //QST 2 : la position du maximum
                position = i;
            }
        }*/

        //qst 3
        do {
            System.out.println("Saisir un nombre ");
            N = s.nextInt();
            if(N> max) {
                max = N;
                //QST 2 : la position du maximum
                position = j;
        }
        j++;
        } while (N!=0);
        System.out.println("le maximum est :" +max);
        System.out.println("le max est dans la position : "+position);
    }
}
