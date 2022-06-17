package Test58;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test58 {
    public static void main(String[] args) {
         
        // JPanel = a GUI component that function as a container to hold other components

        ImageIcon icon = new ImageIcon("Test58/Thumbs_Up.png");

        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.white);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.black);
        bluePanel.setBounds(250,0,250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.yellow);
        greenPanel.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
