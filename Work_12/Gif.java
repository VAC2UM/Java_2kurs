package Work_12;

import javax.swing.*;
import java.awt.*;

public class Gif {
    public static void main(String[] args) {
//        SwingUtilities  A collection of utility methods for Swing.
//        invokeLater - Вызывает асинхронное выполнение doRun.run() в потоке диспетчеризации событий AWT. Это произойдет после того, как все ожидающие события AWT будут обработаны
//        Abstract Window Toolkit (AWT) — это исходная платформо-независимая оконная библиотека графического интерфейса (Widget toolkit) языка Java.
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Анимация GIF");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,300);

            //Загрузка GIF анимации
            ImageIcon gifIcon = new ImageIcon("C:\\Users\\Huawei\\OneDrive\\Рабочий стол\\Джава\\tenor.gif"
            );

            // Создание JLabel для отображения GIF-анимации
            JLabel gifLabel = new JLabel(gifIcon);

            frame.getContentPane().add(gifLabel, BorderLayout.CENTER);
    
            frame.setVisible(true);

            frame.pack();
        });
    }
}
