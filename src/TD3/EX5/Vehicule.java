package TD3.EX5;

public class Vehicule {
    private int nbPassager;

    public Vehicule(int n){
        this.nbPassager = n;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }


}
