
import java.awt.*;
import javax.swing.*;
import java.util.*;
class MainPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {

        Scanner sc = new Scanner(System.in); // Scanner Defined
        System.out.println("Enter No of points on the star:- ");
        int count = sc.nextInt() + 1; // User input recorded

        int x_cord_2 = 400+(25*count); // x_cord-2
        int y_cord_1 = 300; // y_cord-1

        for(int x = 0; x <= count; x++) // for loop that makes Quadrent 1
        {

            g.drawLine(400,y_cord_1,x_cord_2,300);
            x_cord_2 -= 25;
            y_cord_1 -= 25;

        }
        x_cord_2 = 400-(25*(count-1)); //resets the value and minus one as y-axis line is made
        y_cord_1 = 275;


        for(int x = 1; x <= count; x++) // for loop that makes Quadrent 2
        {
            g.drawLine(400,y_cord_1,x_cord_2,300);
            x_cord_2 += 25;
            y_cord_1 -= 25;

        }

        x_cord_2 = 400-(25*count); //value reset
        y_cord_1 = 300;

        for(int x = 0; x <= count; x++) // for loop that makes Quadrent 3
        {
            g.drawLine(400,y_cord_1,x_cord_2,300);
            x_cord_2 += 25;
            y_cord_1 += 25;

        }

        x_cord_2 = 400+(25*count); //value reset
        y_cord_1 = 300; //value reset

        for(int x = 1; x <= count; x++) // for loop that makes Quadrent 4
        {
            g.drawLine(400,y_cord_1,x_cord_2,300);
            x_cord_2 -= 25;
            y_cord_1 += 25;

        }






    }


}


public class Starr extends JFrame{
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