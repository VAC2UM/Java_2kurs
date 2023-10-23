package Work_3_1;

public class Circle extends Shape {
    protected double radius;

    Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return  Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return  2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " +this.radius + ", color: " +this.color+ ", filled: " +this.filled;
    }
}
