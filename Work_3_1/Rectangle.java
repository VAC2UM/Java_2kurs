package Work_3_1;

public class Rectangle extends Shape{
    protected double width;

    protected double length;

    Rectangle(){};

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    @Override
    double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Shape: rectangle, color: " +this.color + ", filled: "
                +this.filled+ ", width: " +this.width;
    }
}
