package TD1.Conditions;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int a, b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez 3 nombres");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if((a>b)&&(a>c)){
            System.out.println("le maximum est :a = " +a);
        } else if ((b>a)&& (b>c)) {
            System.out.println("le maximum est :b = " +b);
        } else
            System.out.println("le maximum est :c = " +c);

    }
}
