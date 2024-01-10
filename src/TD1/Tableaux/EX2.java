package TD1.Tableaux;

import java.util.Scanner;

public class EX2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Entrer un entier: ");
            int n = sc.nextInt();
            sc.close();

            System.out.println(" Representation en Binaire: " + Integer.toBinaryString(n));
        }

}
