package TD3.EX1;

public class PointA extends  Point{
    public PointA(int x,int y){
        super(x,y);
    }
    public String  affiche(){
        return "les cordonnes de ce point sont :("+getX()+ "," +getY()+" )";
    }
}
