package TD2.EX2;

public class Point {
    private char nom;
    private double abcsisse , ordonne;

    public Point(char nom, double abcsisse, double ordonne) {
        this.nom = nom;
        this.abcsisse = abcsisse;
        this.ordonne = ordonne;
    }

    public char getNom() {
        return nom;
    }

    public double getAbcsisse() {
        return abcsisse;
    }

    public double getOrdonne() {
        return ordonne;
    }

    public void setNom (char nom) {
        this.nom = nom;
    }

    public void setAbcsisse(double abcsisse){
        this.abcsisse = abcsisse;
    }

    public void setOrdonne(double ordonne){
        this.ordonne = ordonne;
    }

    public double norme(){
        return Math.sqrt(Math.pow(this.abcsisse,2)+ Math.pow(this.ordonne,2));
    }
}
