package TD3.EX2;



public class PointNom extends Point {
    char nom;
    public PointNom(int x, int y, char nom){
        super(x,y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom){
        super.deplace(x - this.getX(), y - this.getY());
       this.nom = nom;
    }


    public void setNom(char nom){
        this.nom = nom;
    }

    public void affCoordNom (){
        System.out.println("Coordonnees : " + getX() + " " + getY()+ " nom : " + nom);
    }
}
