package TD3.EX3;

public class Centre extends Point {
    char nom;
    public Centre (int x, int y, char nom){
        super(x, y);
        this.nom = nom;
    }

    public char getNom() {
        return nom;
    }


    public void affNom(){
        System.out.println("nom : " +nom);
    }


    public void affiche() {
        System.out.println("Centre{" +
                "Nom='" + nom + '\'' +
                " X = " +this.getX()+
                " y = " +this.getY()+'}');
    }
}
