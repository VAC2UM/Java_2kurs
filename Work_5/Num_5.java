package Work_5;

public class Num_5 {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Сумма цифр числа равна " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        else {
            //последняя цифра числа
            int lastDigit = n % 10;

            //убираем последнюю цифру, чтобы уменьшить число
            int reducedNumber = n / 10;
            // рекурсивный вызов вызывов функци
            int sumOfRest = sumOfDigits(reducedNumber);
            // прибавляем последнюю цифру к сумме остальных цифр
            return lastDigit + sumOfRest;
        }
    }
}
