package TD2.EX3;

public class Main {
    public static void main(String[] args) {
        Livre l = new Livre("Comment se faire des amis", "Dale carnegie",150,2010);
        System.out.println(l.toString());
        Livre l2 = new Livre(l);
        System.out.println(l2.toString());
        System.out.println(l2.getPrix());
    }
}
