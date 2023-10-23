package Work_12;

import javax.swing.*;

import Work_12.Position;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Task1 extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 500;

    private ArrayList<Position> posTaken = new ArrayList<>();

    public Task1() {
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        int i = 0;
        while (true) {
            createRandomShape();
            i++;
        }
    }

    //   метод создания случайных позиций для каких-либо фигур с учетом ограничений на ширину и высоту области (WIDTH и HEIGHT) и проверки занятости позиции.
    private void createRandomShape() {
        Random random = new Random();

        int randX;
        int randY;

        while (true) {
            randX = random.nextInt(WIDTH) + 1;
            randY = random.nextInt(HEIGHT) + 1;

            if (randX + 50 > WIDTH) {
                randX -= 50;
            }
            if (randX < 0) {
                randX = 0;
            }
            if (randY + 50 > HEIGHT) {
                randY -= 50;
            }
            if (randY < 0) {
                randY = 0;
            }

            boolean test = checkCols(randX, randY);

            if (test) {
                posTaken.add(new Position(randX, randY));
                break;
            }
        }

        int randomShapeID = random.nextInt(2);

        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();

        Color randomColor = new Color(r, g, b);

        Shape shape;

        switch (randomShapeID) {
            case 0: {
                shape = new Rectangle(randomColor, new Position(randX, randY), this.getGraphics());
                break;
            }
            case 1: {
                shape = new Circle(randomColor, new Position(randX, randY), this.getGraphics());
                break;
            }
            default: {
                return;
            }
        }

        shape.draw();
    }

    //    метод checkCols служит для проверки занятости позиции на основе координат x и y,
    public boolean valueInRange(int v, int min, int max) {
        return (v >= min) && (v <= max);
    }

    //    а метод valueInRange используется внутри него для определения, находится ли позиция в заданном диапазоне координат.
    public boolean checkCols(int x, int y) {
        for (Position in : posTaken) {
            boolean xOv = valueInRange(in.getX(), x, x + 50) || valueInRange(x, in.getX(), in.getX() + 50);
            boolean yOv = valueInRange(in.getY(), y, y + 50) || valueInRange(y, in.getY(), in.getY() + 50);

            if (xOv && yOv) {
                return false;
            }
        }

        return true;
    }
}

