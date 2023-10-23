package Work_12;

import Work_12.Position;
import java.awt.*;

public class Circle extends Shape {
    Circle(Color color, Position position, Graphics graphics) {
        super(color, position, graphics);
    }

    @Override
    public void draw() {
        this.getGraphics().drawOval(getPosition().getX(), getPosition().getY(), 50,50);
        getGraphics().setColor(getColor());
        getGraphics().fillOval(getPosition().getX(), getPosition().getY(), 50, 50);
    }
}
