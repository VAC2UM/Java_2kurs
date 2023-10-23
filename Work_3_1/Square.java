package Work_3_1;

public class Square extends Rectangle{

    protected double side;

    Square(){};

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(width, length, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: square, color: " +this.color + ", filled: "
                +this.filled+ ", width: " +this.width;
    }
}
