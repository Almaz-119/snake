import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {
    Field field = new Field();
    static int x = 110;
    static int y = 110;

    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame example");
        jf.setSize(500, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(new Main());
    }
    public Main() {
        setBackground(Color.black);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        //g.fillRect(x,y,30,30);
        for (int j = 0; j < 40; j++) {
            for (int i = 0; i < 20; i++) {
                if (field.arr[i][j] == 1) {
                    g.setColor(Color.darkGray);
                    g.fillRect((35 * j) + 60,(35 * i) + 90, 35,35);
                    g.setColor(Color.BLACK);
                    g.drawRect((35 * j) + 60,(35 * i) + 90, 35,35);
                }
                if (field.arr[i][j] == 2) {
                    g.setColor(Color.red);
                    g.fillRect((35 * j) + 60,(35 * i) + 90, 35,35);
                }
                if (field.arr[i][j] == 3) {
                    g.setColor(Color.white);
                    g.fillRect((35 * j) + 60,(35 * i) + 90, 35,35);
                }
                if (field.arr[i][j] == 9) {
                    g.setColor(Color.BLUE);
                    g.fillRect((35 * j) + 60,(35 * i) + 90, 35,35);
                }
            }
        }
        repaint();
    }
}
