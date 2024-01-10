package TD1.Conditions;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("entrez deux entierts a et b :");
        a = s.nextInt();
        System.out.println("a = "+ a);
        b = s.nextInt();
        System.out.println("b = "+ b);
        if(a>b)
            System.out.println("b =" +b +" "+ "a = "+a);
        else
            System.out.println("a =" +a +" "+ "b = "+b);

    }
}
