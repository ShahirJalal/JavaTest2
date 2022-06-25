import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
