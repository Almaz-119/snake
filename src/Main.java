import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Main extends JPanel {
    Scanner sc = new Scanner(System.in);
    static int x = 110;
    static int y = 110;

    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame example");
        jf.setSize(500, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Main());
        jf.setVisible(true);

    }
    public Main() {
        setBackground(Color.black);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x,y,30,30);
        repaint();
    }
}
