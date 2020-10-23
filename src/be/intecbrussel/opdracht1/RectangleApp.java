package be.intecbrussel.opdracht1;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle.");
        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(23);
        rectangle.setWidth(-12);

        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getX() + ", " + rectangle.getY());

    }

}
