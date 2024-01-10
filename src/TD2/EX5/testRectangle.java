package TD2.EX5;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.isCarre());
        System.out.println(rectangle.aire());
        System.out.println(rectangle.perimetre());
        Rectangle rectangle1 = new Rectangle(6,6);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.isCarre());
        System.out.println(rectangle1.aire());
        System.out.println(rectangle1.perimetre());

    }
}
