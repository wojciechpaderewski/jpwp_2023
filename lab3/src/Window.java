import javax.swing.JFrame;

public class Window extends JFrame{
    Window(String nazwa){
        super(nazwa);
        setResizable(false);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
