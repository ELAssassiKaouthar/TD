package TD3.EX1;

public class Point {
    private int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
