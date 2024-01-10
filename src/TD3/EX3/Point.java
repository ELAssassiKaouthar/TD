package TD3.EX3;

public class Point {
    private int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void affCoord(){
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affich(){
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
