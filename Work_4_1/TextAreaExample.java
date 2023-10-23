package Work_4_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame {
    JTextArea jta1 = new JTextArea(10,25);
    JTextArea txtArea = new JTextArea(20,20);
    JScrollPane jScroll = new JScrollPane(txtArea);
    JButton button = new JButton("Add some text");
    public TextAreaExample(){
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);
        add(jScroll);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[] args) {
        new TextAreaExample().setVisible(true);
    }
}
