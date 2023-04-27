import java.util.*;
import java.awt.*;
import javax.swing.*;
class MainPanel extends JPanel {
    public void paintComponent(Graphics g)




    {
        Scanner kbr = new Scanner(System.in);
        System.out.println("Enter points: ");
            int num = kbr.nextInt();
        int max = 25*num;

        for(int y = 25 ; y <= 25*(num+1) ; y+=25)
        {
            g.drawLine(400, 300-max, 400+y, 300);
            g.drawLine(400-max, 300, 400, 300-y);
            g.drawLine(400, 300+max, 400-y, 300);
            g.drawLine(400+max, 300, 400, 300+y);
            max-=25;





        }






    }
}




















public class STAAR extends JFrame{
    public static void main(String[] args) {
//This is a necessary in order to create the frame window
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GraphicsMain();
            }
        });
    }
    public static void GraphicsMain() {
//Sets up the frame
        JFrame frame = new JFrame("Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
//Display the window.
        frame.pack();
//Adds the graphics panel and sets the size
        frame.setSize(new Dimension(800,600));
        frame.getContentPane().add(new MainPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}