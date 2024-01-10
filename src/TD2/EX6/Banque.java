package TD2.EX6;

public class Banque {
    private int nCompte;
    private float solde;
    private String cin;

    public Banque(int nCompte, float solde, String cin){
        this.nCompte = nCompte;
        this.solde = solde;
        this.cin = cin;
    }

    public int getnCompte() {
        return nCompte;
    }

    public float getSolde() {
        return solde;
    }

    public String getCin() {
        return cin;
    }

    public void setnCompte(int nCompte) {
        this.nCompte = nCompte;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    public void deposer(float somme){
        this.solde+=somme;
    }

    public void retirer(float somme){
        if(this.solde>somme)
        this.solde-=somme;
    }

    public float avoirSolde(){
        return solde;
    }

    public String avoirInf(){
        return "nCompte = "+ this.nCompte + " ,solde =" +this.solde + " ,cin=" + this.cin;
    }
}

