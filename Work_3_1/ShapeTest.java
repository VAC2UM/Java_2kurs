package Work_3_1;

import org.w3c.dom.css.Rect;
public class ShapeTest {
    public static void main(String[] args) {
        int i = 4;
        Shape s1 = new Circle(5.5,"RED",false);

        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //выдаст ошибку потому что в абстрактном классе Shape нет метода getRadius

        System.out.println();
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println();
//        Shape s2 = new Shape(); //выдаст ошибку, потому что в абстр классе
        Shape s3 = new Rectangle(1.0,2.0,"RED",false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //в классе Shape нет метода getLength

        System.out.println();
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println();
        Shape s4= new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); //в классе Shape нет этого метода

        System.out.println();
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); //в классе Rectangle нет этого метода
        System.out.println(r2.getLength());

        System.out.println();
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
