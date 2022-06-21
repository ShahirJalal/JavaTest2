import javax.swing.JFrame;

public class Test61 {
    
    public static void main(String[] args) {
        

        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout     = Places components in a row, sized at their preferred size.
        //                  If the horizontal space in the container is too small,
        //                  the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
