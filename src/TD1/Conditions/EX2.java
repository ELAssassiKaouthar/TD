package TD1.Conditions;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        int a, b , c;
        float delta;
        double x, x1, x2;
        Scanner s = new Scanner(System.in);
        System.out.println("entrez a et b et c !");
        a = s.nextInt();
        System.out.println("a = "+a);
        b = s.nextInt();
        System.out.println("b = "+b);
        c = s.nextInt();
        System.out.println("c = "+c);

        if (a==0){
            // Equation du 1er degree
            if(b==0){
                if(c==0){
                    System.out.println("la solution est l'ensemble IR");
                }
                else {
                    System.out.println("Aucune solution dans IR");
                }
            } else {
                x = (double) -c/b;
                System.out.println("la solution est : " +x);
            }
        }
        // Equation du 2eme degree
        else {
            delta = (b*b)-(4*a*c);
            System.out.println("delta = " +delta);
            if (delta==0){
                x = (float) -b/(2*a);
                System.out.println("la solution est : " +x);
            }
            else if (delta>0){
                x1 = (-b-(Math.sqrt(delta)))/(2*a);
                x2 = (-b+(Math.sqrt(delta)))/(2*a);
                System.out.println("les solutions sont : " +x1 +" et " + x2);
            }
            else {
                System.out.println("aucune solution dans IR");
            }
        }
    }
}
