package Work_5;

import java.util.*;
public class Num_1 {
    public static void printNums(int k, int n) {
        if (k > n) {
            return;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(k + " ");
        }
        printNums(k + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        printNums(1,n);
    }
}