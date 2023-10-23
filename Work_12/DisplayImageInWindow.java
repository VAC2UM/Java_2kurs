package Work_12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DisplayImageInWindow {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        // Создаем окно Swing
        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Загружаем изображение и отображаем его
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(imageIcon);

            // Добавляем компонент с изображением на панель
            JPanel panel = new JPanel();
            panel.add(imageLabel);

            // Добавляем панель в окно
            frame.getContentPane().add(panel, BorderLayout.CENTER);

            // Отображаем окно
            frame.setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }
}

