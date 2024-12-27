import java.awt.*;

class Turtle {
    private int headX;
    private int headY;
    private int headWidth;
    private int headHeight;

    private int[] xOctagon;
    private int[] yOctagon;

    // Конструктор класса Turtle
    public Turtle(int headX, int headY, int headWidth, int headHeight,
                  int x1, int x2, int x3, int x4,
                  int y1, int y2, int y3, int y4,
                  int y5, int y6, int y7, int y8) {
        this.headX = headX;
        this.headY = headY;
        this.headWidth = headWidth;
        this.headHeight = headHeight;

        xOctagon = new int[] {x1, x2, x3, x4, x4, x3, x2, x1};
        yOctagon = new int[] {y1, y2, y3, y4, y5, y6, y7, y8};
    }

    // Метод для отрисовки черепахи
    public void draw(Graphics g) {
        // Ножки
        g.setColor(Color.ORANGE);
        g.fillRect(120, 130, 80, 120);
        g.fillRect(191, 130, 80, 120);
        g.fillRect(120, 200, 80, 100);
        g.fillRect(191, 200, 80, 100);

        // Голова
        g.setColor(Color.ORANGE);
        g.fillOval(headX, headY, headWidth, headHeight);
        g.setColor(Color.BLACK);
        g.drawOval(headX, headY, headWidth, headHeight);

        // Панцирь (восьмиугольник)
        g.setColor(Color.GREEN);
        g.fillPolygon(xOctagon, yOctagon, 8);
        g.setColor(Color.BLACK);
        g.drawPolygon(xOctagon, yOctagon, 8);

        // Глаза
        g.setColor(Color.BLACK);
        g.fillOval(headX + headWidth / 4, headY + headHeight / 4, 10, 10);
        g.fillOval(headX + 3 * headWidth / 4, headY + headHeight / 4, 10, 10);
    }
}