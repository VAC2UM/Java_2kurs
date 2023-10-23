package Work_5;

public class Num_2{
    public static int recursion(int n) {
        if(n == 1)
            return n;
        else if(n < 1)
            System.out.println("число меньше 1");
        else if(n > 1){
            System.out.println(n);
            return recursion(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}