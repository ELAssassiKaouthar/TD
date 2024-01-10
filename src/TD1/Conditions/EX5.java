package TD1.Conditions;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        int heure;
        String langue;
        Scanner sc = new Scanner(System.in);
        System.out.println("F: pour continuer en freançais");
        System.out.println("A: pour continuer en Anglais");
         langue = sc.nextLine();
        System.out.println("Saisir l'heure");
        heure = sc.nextInt();
        switch (langue){
            case "F":
                if (heure>0&& heure<18)
                    System.out.println("Bonjour");
                else if(heure>=18 && heure<22)
                    System.out.println("Bonsoir");
                else
                    System.out.println("Bonne nuit");
                break;
            case "A":
                if (heure>0&& heure<18)
                    System.out.println("Good Morning");
                else if(heure>=18 && heure<22)
                    System.out.println("Good Evening");
                else
                    System.out.println("Good Night");
                break;

        }
    }
}
