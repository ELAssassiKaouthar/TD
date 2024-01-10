package TD1.Conditions;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        int moyenne;
        Scanner s = new Scanner(System.in);
        System.out.println("entrez votre moyenne :");
        moyenne = s.nextInt();
        if((moyenne>=16)&&(moyenne<=20)){
            System.out.println("T.BIEN");
        }
        else if((moyenne>=14)&&(moyenne<16)){
            System.out.println("BIEN");
        }
        else if ((moyenne>=12)&&(moyenne<14)){
            System.out.println("A.BIEN");
        }
        else if((moyenne>=10)&&(moyenne<12)){
            System.out.println("PASSABLE");
        }
        else if ((moyenne>=5)&&(moyenne<10)){
            System.out.println("NV");
        }
        else if ((moyenne>=0)&&(moyenne<5)){
            System.out.println("AJ");
        }
        else
            System.out.println("la moyenne doit etre entre 0 et 20");
    }
}
