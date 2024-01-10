package TD2.EX4;

public class Temps {
    private int heures, minutes, secondes;

    public Temps(){}

    public Temps(int heures){
        this.heures = heures;
    }

    public Temps(int heures, int minutes){
        this(heures);
        this.minutes = minutes;
    }

    public Temps(int heures,int minutes, int secondes){
        this(heures, minutes);
        this.secondes = secondes;
    }

    public Temps(Temps temps){
        this.heures = temps.getHeures();
        this.minutes = temps.getMinutes();
        this.secondes = temps.secondes;
    }

    public int getHeures(){
        return heures;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSecondes(){
        return secondes;
    }

    public void setHeures(int heures){
        this.heures = heures;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }

    public  void ajouterHeures(int h){
        this.heures+=h;
        if(h>23){
            this.heures%=24;
        }
    }

    public void ajouterMinutes(int m){
        this.minutes+=m;
        if(m>59){
            ajouterHeures(minutes/60);
            this.minutes%=60;
        }
    }

    public void ajouterSecondes(int s){
        this.secondes+=s;
        if(s>59){
            ajouterMinutes(secondes/60);
            this.secondes%=60;
        }
    }

}
