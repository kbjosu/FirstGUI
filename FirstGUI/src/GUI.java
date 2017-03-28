import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public final class GUI extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new GUI();
    }

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;

    public GUI() {
        super("My first GUI");

        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        Object source = event.getSource();

        this.setCursor(Cursor.getDefaultCursor());
    }
}
