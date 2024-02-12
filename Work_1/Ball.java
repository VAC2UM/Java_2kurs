package Work_1;

public class Ball {

    private String color;
    private double V;

    private int test;

    public Ball(String c, double v){
        color = c;
        V = v;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getV() {
        return V;
    }

    public void setV(double v) {
        V = v;
    }

    //@Override //определяет переопределен ли метод
    public String toString()    {
        return "color: " + this.color + " V: " + this.V;
    }
}
