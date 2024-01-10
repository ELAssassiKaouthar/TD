package TD3.EX5;

public class Moto extends Vehicule{
    private int nbRoues = 2;
    public Moto(int nbPassager, int nbRoues){
        super(nbPassager);
        this.nbRoues = nbRoues;
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nbRoues=" + nbRoues +
                '}';
    }
}
