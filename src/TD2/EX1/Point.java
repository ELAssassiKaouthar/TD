package TD2.EX1;

public class Point {
    char nom;
    double abscisse;

    public Point(char nom, double abscisse){
        this.nom= nom;
        this.abscisse = abscisse;

    }

    public void afficher(){
        System.out.println("le point :" + this.nom + " d'abcsisse :"+this.abscisse);
    }
    public void translate(double dx) {
        this.abscisse +=dx;
    }
}
