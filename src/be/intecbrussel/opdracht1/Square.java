package be.intecbrussel.opdracht1;

public class Square extends Rectangle {

    private static int count = 0;

    {
        count++;
    }

    // CONSTRUCTOR
    public Square() {

        super();
    }

    public Square(int side) {

        super(side, side);
    }

    public Square(int side, int x, int y) {

        super(side, side, x, y);
    }

    public Square(Square square) {

        super(square);
    }


    // GETTERS
    public int getSide() {
        return this.getHeight();
    }

    public static int getCount() {

        return count;
    }


    // SETTERS
    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
}
