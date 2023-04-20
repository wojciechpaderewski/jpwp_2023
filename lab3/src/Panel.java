
import javax.swing.JPanel;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.*;

public class Panel {
    JPanel canvasSction;
    JPanel buttonSection;
    Window window;
    Drawer drawer;
    Checkbox greenCheckbox;
    Checkbox redCheckbox;
    List history = new List();

    int senstivity = 2;

    public Panel() {
        window = new Window("Panel sterujący działem");
        window.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        canvasSction = new JPanel();
        buttonSection = new JPanel();
        window.add(buttonSection);
        window.add(canvasSction);

        initCanvasLayout();
        initButtonLayout();

        window.setVisible(true);

        initLinterners();
    }

    void initCanvasLayout() {
        drawer = new Drawer();
        canvasSction.add(drawer);
    }

    void initButtonLayout() {
        buttonSection.setBackground(java.awt.Color.lightGray);
        greenCheckbox = new Checkbox("Zielony");
        redCheckbox = new Checkbox("Czerwony");

        buttonSection.add(greenCheckbox);
        buttonSection.add(redCheckbox);

        Label historyLabel = new Label("Historia:");
        buttonSection.add(historyLabel);
        buttonSection.add(history);
    }

    private void initLinterners() {
        // print on left arrow key
        drawer.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    drawer.x -= senstivity;
                    drawer.paint(drawer.getGraphics());
                    history.add("left arrow key pressed");
                }
            }
        });

        // print on right arrow key
        drawer.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    drawer.x += senstivity;
                    drawer.paint(drawer.getGraphics());
                    history.add("right arrow key pressed");
                }
            }
        });

        // print on up arrow key
        drawer.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    drawer.y -= senstivity;
                    drawer.paint(drawer.getGraphics());
                    history.add("up arrow key pressed");
                }
            }
        });

        // print on down arrow key
        drawer.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    drawer.y += senstivity;
                    drawer.paint(drawer.getGraphics());
                    history.add("down arrow key pressed");
                }
            }
        });

        greenCheckbox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                drawer.color = java.awt.Color.green;
                drawer.repaint();
            }
        });

        redCheckbox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                drawer.color = java.awt.Color.red;
                drawer.repaint();
            }
        });
    }
}