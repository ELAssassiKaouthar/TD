package TD2.EX4;

public class Main {
    public static void main(String[] args) {
        Temps t = new Temps(4,11,36);
        System.out.println(t.toString());
        t.ajouterHeures(1);
        System.out.println(t);
        t.ajouterMinutes(30);
        System.out.println(t);
        t.ajouterSecondes(3660);
        System.out.println(t);
    }
}
