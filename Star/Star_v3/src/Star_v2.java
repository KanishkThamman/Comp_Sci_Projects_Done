//imports
import java.util.*;
import java.awt.*;
import javax.swing.*;
class MainPanel extends JPanel {
    public void paintComponent(Graphics g)
    {
        Scanner sc = new Scanner(System.in); //Scanner
        System.out.println("Enter No of points:- ");
            int user_input = sc.nextInt(); //Records User Input 6

        int Max_px_val = user_input *25;    //Max px value possible according to user input

        for (int counter = 25; counter <= (user_input+1)*25; counter+=25)   //Loop that makes the star. Var counter is used to keep track of
        {

            g.drawLine(400,300-Max_px_val,400+counter,300);
            g.drawLine(400-Max_px_val,300,400,300-counter);
            g.drawLine(400,300+Max_px_val,400-counter,300);
            g.drawLine(400+Max_px_val,300,400,300+counter);
            Max_px_val -= 25;

        }
    }
}
public class Star_v2 extends JFrame{
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
