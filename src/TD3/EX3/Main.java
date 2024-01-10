package TD3.EX3;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(1 , 2 );
        Centre centre = new Centre(2 , 3 , 'o');
        Cercle cercle = new Cercle(2 , 3 , 'C' , 3);
        point.affCoord();
        centre.affCoord();
        centre.affNom();
        cercle.affNom();
        cercle.affiche();
    }
}
