package TD3.EX6;



public abstract class Figure {

    protected String nom;

    public abstract double getPerimeter();
    public abstract double getAire();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                ", perimeter=" + getPerimeter() +
                ", aire=" + getAire() +
                '}';
    }
}
