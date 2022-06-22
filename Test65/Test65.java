package Test65;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test65 {
    
    public static void main(String[] args) {
        
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               informs them of something.

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?: ");
        // System.out.println("Hello " + name);

        ImageIcon icon = new ImageIcon("Test65/Cool.png");
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, null, 0);
        
    }
}
