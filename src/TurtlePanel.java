import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TurtlePanel extends JPanel {

    private Turtle turtle;
    private JTextField headXField, headYField, headWidthField, headHeightField;
    private JTextField x1Field, x2Field, x3Field, x4Field, y1Field, y2Field, y3Field, y4Field, y5Field, y6Field, y7Field, y8Field;

    public TurtlePanel() {
        // Создаем первую черепаху по умолчанию с правильными координатами ножек
        turtle = new Turtle(165, 95, 60, 65, 105, 165, 225, 285, 185, 125, 125, 185, 245, 305, 305, 245);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Фон
        g.setColor(new Color(63, 180, 255)); // Море
        g.fillRect(0, 80, getWidth(), 1000);
        g.setColor(Color.WHITE); // Песок
        g.fillRect(0, 400, getWidth(), 1500);
        g.setColor(new Color(71, 181, 44)); // Небо
        g.fillRect(0, 0, getWidth(), 80);

        // Отрисовка черепахи
        if (turtle != null) {
            turtle.draw(g);
        }
    }

    // Метод для создания новой черепахи
    public void createTurtle() {
        int headX = Integer.parseInt(headXField.getText());
        int headY = Integer.parseInt(headYField.getText());
        int headWidth = Integer.parseInt(headWidthField.getText());
        int headHeight = Integer.parseInt(headHeightField.getText());
        int x1 = Integer.parseInt(x1Field.getText());
        int x2 = Integer.parseInt(x2Field.getText());
        int x3 = Integer.parseInt(x3Field.getText());
        int x4 = Integer.parseInt(x4Field.getText());
        int y1 = Integer.parseInt(y1Field.getText());
        int y2 = Integer.parseInt(y2Field.getText());
        int y3 = Integer.parseInt(y3Field.getText());
        int y4 = Integer.parseInt(y4Field.getText());
        int y5 = Integer.parseInt(y5Field.getText());
        int y6 = Integer.parseInt(y6Field.getText());
        int y7 = Integer.parseInt(y7Field.getText());
        int y8 = Integer.parseInt(y8Field.getText());

        turtle = new Turtle(headX, headY, headWidth, headHeight,
                x1, x2, x3, x4, y1, y2, y3, y4, y5, y6, y7, y8);
        repaint();
    }
}