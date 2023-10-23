package Work_15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorExample {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");

        final TextField num1Field = new TextField();
        num1Field.setBounds(50, 50, 100, 20);

        final TextField num2Field = new TextField();
        num2Field.setBounds(200, 50, 100, 20);

        final Label resultLabel = new Label();
        resultLabel.setBounds(50, 100, 250, 20);

        Button addButton = new Button("Прибавить");
        addButton.setBounds(50, 150, 60, 30);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 + num2;

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        Button subtractButton = new Button("Вычесть");
        subtractButton.setBounds(150, 150, 80, 30);

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 - num2;

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        Button multiplyButton = new Button("Умножить");
        multiplyButton.setBounds(250, 150, 80, 30);

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 * num2;

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        Button divideButton = new Button("Разделить");
        divideButton.setBounds(350, 150, 80, 30);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    if (num2 == 0) {
                        resultLabel.setText("Делить на 0 нельзя");
                    }
                    double result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        f.add(num1Field);
        f.add(num2Field);
        f.add(resultLabel);
        f.add(addButton);
        f.add(subtractButton);
        f.add(multiplyButton);
        f.add(divideButton);

        f.setSize(500, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
