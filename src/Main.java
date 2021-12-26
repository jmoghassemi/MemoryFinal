import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Creating a JFrame object, called "frame" that has the size 400 pixels by 400 pixels
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        // Creating a JPanel object (gP = Grid Panel) that has grid layout w/ 4 rows and 4 columns
        // This Grid Panel holds together 16 Container Panels, and is added to the JFrame at the very end of the program.
        JPanel gP = new JPanel();

        gP.setLayout(new GridLayout(4, 4));

        String[] cardShuffle = functions.cardShuffle();

        gP.add(functions.drawCard("Button1","1.1","1.2","1.3","1.1", cardShuffle[0]));
        gP.add(functions.drawCard("Button2","2.1","2.2","2.3","2.1", cardShuffle[1]));
        gP.add(functions.drawCard("Button3","3.1","3.2","3.3","3.1", cardShuffle[2]));
        gP.add(functions.drawCard("Button4","4.1","4.2","4.3","4.1", cardShuffle[3]));

        gP.add(functions.drawCard("Button5","5.1","5.2","5.3","5.1", cardShuffle[4]));
        gP.add(functions.drawCard("Button6","6.1","6.2","6.3","6.1", cardShuffle[5]));
        gP.add(functions.drawCard("Button7","7.1","7.2","7.3","7.1", cardShuffle[6]));
        gP.add(functions.drawCard("Button8","8.1","8.2","8.3","8.1", cardShuffle[7]));

        gP.add(functions.drawCard("Button9","9.1","9.2","9.3","9.1", cardShuffle[8]));
        gP.add(functions.drawCard("Button10","10.1","10.2","10.3","10.1", cardShuffle[9]));
        gP.add(functions.drawCard("Button11","11.1","11.2","11.3","11.1", cardShuffle[10]));
        gP.add(functions.drawCard("Button12","12.1","12.2","12.3","12.1", cardShuffle[11]));

        gP.add(functions.drawCard("Button13","13.1","13.2","13.3","13.1", cardShuffle[12]));
        gP.add(functions.drawCard("Button14","14.1","14.2","14.3","14.1", cardShuffle[13]));
        gP.add(functions.drawCard("Button15","15.1","15.2","15.3","15.1", cardShuffle[14]));
        gP.add(functions.drawCard("Button16","16.1","16.2","16.3","16.1", cardShuffle[15]));

        frame.add(gP);
        frame.setVisible(true);
// ######################################################################################

    }
}
