import java.awt.*;

class Drawer extends Canvas {
    int x = 250;
    int y = 150;
    int prevX = 250;
    int prevY = 150;
    java.awt.Color color = java.awt.Color.black;

    int senstivity = 2;

    Drawer() {
        super();
        setBackground(java.awt.Color.lightGray);
        setSize(500, 300);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawLine(prevX, prevY, x, y);

        prevX = x;
        prevY = y;
    }
}