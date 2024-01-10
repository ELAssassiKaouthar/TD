package TD3.EX5;

public class Triporteur extends Moto{
    private int nbTri;


    public Triporteur(int nbP , int nbRoues , int nbTri){
        super(nbP, nbRoues);
        this.nbTri=nbTri;
    }

    @Override
    public String toString() {
        return "Triporteur{" +
                "nbTri=" + nbTri +
                '}';
    }
}
