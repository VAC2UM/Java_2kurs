package Work_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();

        // Ввод даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД (например, 2023-09-25): ");
        String userInput = scanner.nextLine();

//        LocalDate - это класс в пакете java.time, представляющий собой дату без времени в
//        современном календаре Грегорианского календаря
        // Преобразование введенной строки в объект LocalDate
        LocalDate userDate = LocalDate.parse(userInput);

//        Метод ofPattern принимает аргумент в виде строки, представляющей шаблон форматирования,
//        и возвращает соответствующий объект DateTimeFormatter. Этот шаблон определяет, как будут представлены компоненты даты и времени,
//        такие как год, месяц, день, час, минута, секунда и др., в строковой форме.
        // Форматтер для вывода даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Вывод текущей даты и введенной пользователем даты
        System.out.println("Текущая дата: " + currentDate.format(formatter));
        System.out.println("Введенная дата: " + userDate.format(formatter));

        // Сравнение дат
        if (userDate.isEqual(currentDate)) {
            System.out.println("Введенная дата совпадает с текущей датой.");
        } else if (userDate.isBefore(currentDate)) {
            System.out.println("Введенная дата ранее текущей даты.");
        } else {
            System.out.println("Введенная дата позже текущей даты.");
        }
        scanner.close();
    }
}

