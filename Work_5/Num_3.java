package Work_5;

//задание 3. от A до B
import java.util.*;

public class Num_3{
    public static int recursion(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            recursion(a + 1, b);
        }
        else if (a > b) {
            System.out.print(a + " ");
            recursion(a - 1, b);
        }
        else
            System.out.print(a);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        recursion(a,b);
    }
}