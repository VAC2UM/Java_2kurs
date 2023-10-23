package Work_12_image;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage extends JFrame {
    private JLabel imageLabel;

    public DisplayImage(String imagePath) {
        JFrame frame = new JFrame("Отображение изображения");
//        Метод setDefaultCloseOperation - это метод из класса JFrame в библиотеке Swing,
//        который позволяет установить реакцию на закрытие окна (фрейма) при нажатии
//        пользователем на кнопку закрытия окна (чтобы при закрытии окна, завершалась программа)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Загружаем изображение из указанного пути
//        Реализация интерфейса Icon, которая рисует значки из изображений.
        ImageIcon imageIcon = loadImage(imagePath);

        if (imageIcon != null) {
            // Создаем метку для отображения изображения
//            Создает экземпляр JLabel с указанным изображением.
//            Метка центрируется по вертикали и горизонтали в своей области отображения.
            imageLabel = new JLabel(imageIcon);

            // Добавляем метку на окно
            frame.getContentPane().add(imageLabel, BorderLayout.CENTER);
        } else {
            // Выводим сообщение об ошибке, если не удалось загрузить изображение
            JOptionPane.showMessageDialog(this, "Не удалось загрузить изображение", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        frame.setVisible(true);
    }

    private ImageIcon loadImage(String imagePath) {
        try {
//            Подкласс BufferedImage описывает изображение с доступным буфером данных изображения
//            ImageIO - Класс, содержащий статические удобные методы для размещения ImageReaders
//            и ImageWriters, а также для выполнения простого кодирования и декодирования.
            BufferedImage img = ImageIO.read(new File(imagePath));
            return new ImageIcon(img);
        }
//       IOException Сигнализирует о возникновении какого-либо исключения ввода/вывода
//        Этот класс является общим классом исключений, возникающих при неудачных или прерванных операциях ввода-вывода.
        catch (IOException e) {
//            Выводит данный брошенный объект и его обратную трассировку в стандартный поток ошибок.
//            Этот метод печатает в потоке вывода ошибок трассировку стека для
//            данного объекта Throwable, которая является значением поля System.err.
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
//        String imagePath = "C:/Users/Huawei/OneDrive/Рабочий стол/Обои/actor-in-hat-in-fire-and-fog-oppenheimer-movie-poster-wallpaper-2880x1620_52.jpg";
//
////      SwingUtilities - Коллекция служебных методов для Swing.
////      invokeLater Вызывает асинхронное выполнение doRun.run() в потоке диспетчеризации событий AWT. Э
////        то произойдет после того, как все ожидающие события AWT будут обработаны.
//        SwingUtilities.invokeLater(() -> {
//            DisplayImage app = new DisplayImage(imagePath);
//            app.setVisible(true);
        if (args.length != 1) {
            System.out.println("Usage: java DisplayImage <imagePath>");
            return;
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            new DisplayImage(imagePath);
        });
    }
}
