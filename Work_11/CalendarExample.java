package Work_11;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем год, месяц, день, часы и минуты
        System.out.print("Введите год (например, 2023): ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите день (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // Создаем объект Calendar и устанавливаем в нем заданные значения
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes); // Месяцы в Calendar начинаются с 0 (январь)

        // Выводим созданный объект Calendar
        System.out.println("Созданный Calendar: " + calendar.getTime());

        // Закрываем сканнер
        scanner.close();
    }
}
