import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TurtleFrame extends JFrame {

    public TurtleFrame() {
        setTitle("Черепаха");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        add(new TurtlePanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new TurtleFrame();
    }
}