package be.intecbrussel.opdracht1;

public class Circle {

    private static int count;
    public static final int ANGLES;


    private int radius;
    private int x;
    private int y;


    // CONSTRUCTOR
    public Circle() {

        this(0, 0, 0);
    }

    static {

        count = 0;
        ANGLES = 0;
    }

    {

        count++;
    }

    public Circle(int radius) {

        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {

        this.radius = Math.abs(radius);

        this.x = x;
        this.y = y;
    }

    public Circle(Circle circle) {

        this(circle.getRadius(), circle.getX(), circle.getY());
    }


    // SETTER

    public void setRadius(int radius) {

        this.radius = Math.abs(radius);
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void setPosition(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void grow(int d) {

        this.radius *= Math.abs(d);

    }


    // GETTERS

    public int getRadius() {

        return radius;
    }

    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public static int getCount() {
        return count;
    }
}


