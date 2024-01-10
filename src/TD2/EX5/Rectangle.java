package TD2.EX5;

public class Rectangle {
    private double longueur,largeur;

    public Rectangle(){}

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(Rectangle r){}

    public double getLongueur(){
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLongueur(double longueur){
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double perimetre(){
        return 2*(this.longueur + this.largeur);

    }
    public double aire(){
        return (this.longueur*this.largeur);
    }

    public boolean isCarre(){
        if(this.longueur == this.largeur)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
