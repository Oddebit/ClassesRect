package be.intecbrussel.opdracht1;

public class Rectangle {

    private static  int count;
    public static final int ANGLES;

    private int height;
    private int width;
    private int x;
    private int y;


    // CONSTRUCTOR
    public Rectangle() {

        this(0, 0, 0, 0);
    }

    static {
        ANGLES = 4;
        count = 0;
    }

    {
        count++;
    }

    public Rectangle(int height, int width) {

        this(height, width, 0, 0);
    }

    public Rectangle(int height, int width, int x, int y) {

        if (height < 0) {
            this.y += height;
        }
        this.height = Math.abs(height);

        if (width < 0) {
            this.x += width;
        }
        this.width = Math.abs(width);

        this.x = x;
        this.y = y;
    }

    public Rectangle(Rectangle rectangle) {

        this(rectangle.getHeight(), rectangle.getWidth(), rectangle.getX(), rectangle.getY());
    }


    // SETTER
    public void setHeight(int height) {

        if (height < 0) {
            this.y += height;
        }

        this.height = Math.abs(height);
    }

    public void setWidth(int width) {

        if (width < 0) {
            this.x += width;
        }

        this.width = Math.abs(width);
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

        if (d < 0) {
            this.x += width * d;
            this.y += height * d;
        }

        this.height *= Math.abs(d);
        this.width *= Math.abs(d);
    }


    // GETTERS

    public int getHeight() {

        return height;
    }

    public int getWidth() {

        return width;
    }

    public int getArea() {

        return width * height;
    }

    public int getPerimeter() {

        return width * 2 + height * 2;
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
