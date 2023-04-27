/** @(#)Star_v2.java
 * "04-07-2023"
 * 4A CSCI
 * @author Kanishk Thamman
 * Program Descirption : Creates a star using for, Scanner, if, and draw funtions */
// Import Statements
import java.awt.*;
import javax.swing.*;
import java.util.*;
class MainPanel extends JPanel {
    public void paintComponent(Graphics g)
    {
        Scanner sc = new Scanner(System.in); // Scanner
        System.out.println("Enter No of points:- ");
            int count = sc.nextInt(); // Records user input
        //VAR for Quadrant 1
        int x_pos_q1 = 425;
        int y_pos_q1 = 300-(count*25);
        //VAR for Quadrant 2
        int x_pos_q2 = 375;
        int y_pos_q2 = 300-(count*25);
        //VAR for Quadrant 3
        int x_pos_q3 = 375;
        int y_pos_q3 = 300+(count*25);
        //VAR for Quadrant 4
        int x_pos_q4 = 425;
        int y_pos_q4 = 300 + (count * 25);
        for(int counter = 1; counter <= count*4; counter++) // Loop that makes a star one line at a time
        {
            if(counter <= count)  // Runs the code for Quadrant 1
            {
                g.drawLine(400, y_pos_q1, x_pos_q1, 300);
                x_pos_q1 += 25;
                y_pos_q1 += 25;
            }
            else if(counter <= count * 2)   // Runs code for Quadrant 2
            {
                g.drawLine(400, y_pos_q2, x_pos_q2, 300);
                x_pos_q2 -= 25;
                y_pos_q2 += 25;
            }
            else if(counter <= count * 3)   // Runs code for Quadrant 3
            {
                g.drawLine(400, y_pos_q3, x_pos_q3, 300);
                y_pos_q3 -= 25;
                x_pos_q3 -= 25;
            }
            else // Runs code for Quadrant 4
            {
                g.drawLine(400, y_pos_q4, x_pos_q4, 300);
                y_pos_q4 -= 25;
                x_pos_q4 += 25;
            }
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