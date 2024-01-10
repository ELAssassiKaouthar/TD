package TD3.EX6;



import TD3.EX1.Point;

public class TestFigure {

    public static void main(String[] args) {

        Disque disque1 = new Disque();
        System.out.println("Disque 1 : " + disque1);

        Point centre = new Point(2, 3);
        Disque disque2 = new Disque(centre, 4.0, "Cercle A");
        System.out.println("Disque 2 : " + disque2);


        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 : " + rectangle1);

        Rectangle rectangle2 = new Rectangle(5.0, 8.0, "Rectangle B");
        System.out.println("Rectangle 2 : " + rectangle2);
    }
}
