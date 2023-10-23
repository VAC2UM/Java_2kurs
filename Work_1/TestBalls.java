package Work_1;

public class TestBalls {

    public static void main(String[] args) {
        Ball n1 = new Ball("Red", 5.0);
        Ball n2 = new Ball("Green", 7.0);
        Ball n3 = new Ball("Black", 20);
        n2.setV(26.0);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        n2.setV(10.0);
        n2.setColor("Purple");
        System.out.println("\n" + n2);
    }
}
