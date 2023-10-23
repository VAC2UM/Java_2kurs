package Work_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work1 {
    public static void main(String[] args) {
        String secondName = "Golovanev";
//        Класс Date так же определен в пакете
//        java.sql
        // Дата и время сдачи задания
        Date dateReceived = new Date();

//        Метод System.currentTimeMillis() возвращает текущее время в миллисекундах с
//        1 января 1970 г. 00:00:00 по Гринвичу (известное как «эпоха») в длинном
//        формате.
        // Дата и время сдачи задания (предположим, что сдача задания произойдет через 7 дней)
        long currentTimeMillis = System.currentTimeMillis();
        long oneWeekInMillis = 6 * 24 * 60 * 60 * 1000L;
        Date dateDue = new Date(currentTimeMillis + oneWeekInMillis);

        SimpleDateFormat dateFormat = new SimpleDateFormat();

        System.out.println("Фамилия разработчика: " + secondName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(dateReceived));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(dateDue));
    }
}