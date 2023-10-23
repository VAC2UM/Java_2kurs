package Work_4_1;

import javax.swing.*;

class NullLayout extends JFrame {
    JButton but1 = new JButton("One");
    JButton but2 = new JButton("Two");
    JButton but3 = new JButton("Three");
    public NullLayout(){
        setLayout(null);
        but1.setBounds(150,300,100,20);
        but2.setSize(80,400);
        but3.setLocation(300,100);
        but3.setSize(200,75);
        add(but1);
        add(but2);
        add(but3);
        setSize(500,500);
    }

    public static void main(String[] args) {
        new NullLayout().setVisible(true);
    }
}
