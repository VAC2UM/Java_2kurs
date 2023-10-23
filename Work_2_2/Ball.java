package Work_2_2;

public class Ball {
    double x;
    double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public int setXYSpeed(int count){
        return count;
    }
    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
