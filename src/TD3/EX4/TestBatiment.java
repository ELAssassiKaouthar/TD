package TD3.EX4;

public class TestBatiment {
    public static void main(String[] args) {
        Batiment batiment = new Batiment();
        Maison m = new Maison("SETTAT ",4);
        Immeuble i = new Immeuble("Rabat" , 24);
        System.out.println(batiment.toString());
        System.out.println(m.toString());
        System.out.println(i.toString());
        batiment.setAdresse("Casa");
        System.out.println(batiment.toString());
        m.setAdresse("Meknes");
        System.out.println(m.toString());
        i.setAdresse("Tanger");
        System.out.println(i.toString());
    }
}
