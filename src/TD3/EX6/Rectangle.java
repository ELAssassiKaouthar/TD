package TD3.EX6;



public class Rectangle extends Figure {

    private double longueur;
    private double largeur;


    public Rectangle() {}

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nom = nom;
    }


    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }


    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }
}
