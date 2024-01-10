package TD3.EX4;

public class Immeuble extends Batiment{
    int nbAppart;
    public Immeuble(String adresse, int nbAppart){
        super(adresse);
        this.nbAppart = nbAppart;
    }
    public Immeuble(){}

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + nbAppart +
                '}';
    }
}
