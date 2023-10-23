package Work_3_1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){};

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    };

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    double getArea(){
        return 0;
    };
    double getPerimeter(){
        return 0;
    };

    @Override
    public String toString() {
        return super.toString();
    }
}