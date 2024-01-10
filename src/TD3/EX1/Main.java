package TD3.EX1;

public class Main {
    public static void main(String[] args) {
        PointA p = new PointA(5,7);
        System.out.println(p.affiche());
        p.deplace(1,-4);
        System.out.println(p.affiche());

    }
}


//qst 2
/* Si la classe Point ne disposait pas des méthodes getX et getY,
on peut pas donc accéder à ses champs privés x et y à partir de la classe PointA.
*/
