package Work_4_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

//JFrame - это класс в библиотеке Java Swing, который используется для создания графических пользовательских интерфейсов (GUI) в приложениях Java
class Football extends JFrame {
    int HomeScore = 0;
    int AwayScore = 0;
    JButton HomeTeam = new JButton("AC MIlan");
    JButton AwayTeam = new JButton("Barcelona");
    JLabel Match = new JLabel("Result: " + HomeScore + " X " + AwayScore);
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: DRAW");
    JPanel[] pnl = new JPanel[1];

    public Football(){
//      setLayout - это метод, используемый в библиотеке Java Swing для установки менеджера компоновки (layout manager) для контейнера компонентов,
//      Менеджер компоновки определяет, как компоненты будут размещаться и выравниваться внутри контейнера.

//      GridLayout - это менеджер компоновки (layout manager) в библиотеке Java Swing,
//      который используется для размещения компонентов в виде сетки (таблицы) с фиксированным количеством строк и столбцов
        setLayout(new GridLayout(0,2));

//      Dimension в Java - это класс, представляющий размеры (ширину и высоту) в двумерном пространстве.
        setPreferredSize(new Dimension(580,350));

        JPanel leftpanel = new JPanel();
        leftpanel.add(HomeTeam);

        JPanel rightpanel = new JPanel();
        rightpanel.add(AwayTeam);

        add(leftpanel);
        add(rightpanel);

        JPanel labelsPanel = new JPanel();

//      BoxLayout - это менеджер компоновки, который выстраивает компоненты либо по горизонтали, либо по вертикали в один ряд или столбец.
//      BoxLayout.Y_AXIS - это константа, которая используется для создания вертикальной компоновки BoxLayout в Swing.
        labelsPanel.setLayout(new BoxLayout(labelsPanel, BoxLayout.Y_AXIS));
        labelsPanel.add(Match);
        labelsPanel.add(LastScorer);
        labelsPanel.add(Winner);

        add(labelsPanel);

        setMinimumSize(new Dimension(400, 300)); // min size
        setMaximumSize(new Dimension(500, 400)); // max size

        HomeTeam.addActionListener((ActionEvent e) ->{
            HomeScore++;
            LastScorer.setText("Last Scorer: " + HomeTeam.getText());
            updateScore();
        });
        AwayTeam.addActionListener((ActionEvent e) ->{
            AwayScore++;
            LastScorer.setText("Last Scorer: " + AwayTeam.getText());
            updateScore();
        });

//      Метод pack() в Swing используется для упаковки компонентов окна
        pack();
    }

    public void updateScore(){
        Match.setText("Result: " + HomeScore + " X " + AwayScore);

        if(HomeScore > AwayScore)
            Winner.setText("Winner: " + HomeTeam.getText());
        else if (HomeScore < AwayScore)
            Winner.setText("Winner: " + AwayTeam.getText());
        else
            Winner.setText("Winner: DRAW");
    }

    public static void main(String[] args) {

        new Football().setVisible(true);
    }
}