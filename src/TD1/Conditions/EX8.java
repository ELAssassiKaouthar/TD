package TD1.Conditions;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mois, annee;
        System.out.println("entrez un mois entre 1 et 12");
        mois = sc.nextInt();
        System.out.println("entrez l'annee");
        annee = sc.nextInt();
        int jours;
        switch (mois){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jours = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jours = 30;
                break;
            case  2:
                if((annee % 4 ==0 && annee % 100 != 0)|| (annee % 400 ==0)){
                    jours = 29;
                } else {
                    jours = 28;
                }
                break;
            default:
                System.out.println("le nombre de mois que vous avez entee est invalid");
                return;
        }

        System.out.println("le nombre de jours de ce mois est :" +jours);
    }
}
