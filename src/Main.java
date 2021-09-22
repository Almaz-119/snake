import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    Field field = new Field();
    DrawPanel panel = new DrawPanel();

    public Main() {
        panel.setBackground(Color.black);
        panel.setVisible(true);
        add(panel);                                       //adds panel to JFrame!!!
    }
    public static void main(String[] args) {
        Main app = new Main();                             // here codes are creating my JFrame components, characteristics.
        app.setSize(900,700);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.blue);
            g.setFont(g.getFont().deriveFont(50f));
            g.drawString("Snake 1.1", 600, 50);
            for (int j = 0; j < 40; j++) {
                for (int i = 0; i < 20; i++) {
                    if (field.arr[i][j] == 1) {
                        g.setColor(Color.darkGray);
                        g.fillRect((35 * j) + 60, (35 * i) + 90, 35, 35);
                        g.setColor(Color.BLACK);
                        g.drawRect((35 * j) + 60, (35 * i) + 90, 35, 35);
                    }
                    if (field.arr[i][j] == 2) {
                        g.setColor(Color.red);
                        g.fillRect((35 * j) + 60, (35 * i) + 90, 35, 35);
                    }
                    if (field.arr[i][j] == 3) {
                        g.setColor(Color.white);
                        g.fillRect((35 * j) + 60, (35 * i) + 90, 35, 35);
                    }
                    if (field.arr[i][j] == 9) {
                        g.setColor(Color.BLUE);
                        g.fillRect((35 * j) + 60, (35 * i) + 90, 35, 35);
                    }
                }
            }
        }
    }
    class DrawPanelKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int KeyCode = e.getKeyCode();
            switch (KeyCode) {
                case KeyEvent.VK_UP:
                    field.moveUp();
                    break;
            }
            repaint();
        }
    }
}
