import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Bullseye extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // Call JPanel's paintComponent method
// to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int widthRed = 100;
        int heightRed = 100;
        int widthWhite = 90;
        int heightWhite = 90;

        for (int i = 0; i < 5; i++) {
            int posYRed = yCenter - widthRed / 2;
            int posXRed = xCenter - widthRed / 2;
            int posYWhite = yCenter - widthWhite / 2;
            int posXWhite = xCenter - widthWhite / 2;

            g.setColor(Color.RED);
            g.fillOval(posXRed, posYRed,  widthRed, heightRed);
            g.setColor(Color.WHITE);
            g.fillOval(posXWhite, posYWhite, widthWhite, heightWhite);
            widthRed -= 20;
            heightRed -= 20;
            widthWhite -= 20;
            heightWhite -= 20;
            System.out.println(i);
            System.out.println(widthRed);
        }

    }
    public static void main(String[] args)
    {
        JFrame window = new JFrame("A real target");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bullseye panel = new Bullseye();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}