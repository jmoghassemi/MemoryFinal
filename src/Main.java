
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        // Creating a JFrame object, called "frame" that has the size 400 pixels by 400 pixels
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Creating a JPanel object (gP = Grid Panel) that has grid layout w/ 4 rows and 4 columns
        // This Grid Panel holds together 16 Container Panels, and is added to the JFrame at the very end of the program.
        JPanel gP = new JPanel();

        gP.setLayout(new GridLayout(4, 4));

        //cP = Container Panel
        //wP = White Panel (lowest layer in stack/background panel)
        //iP = Image Panel (The panel which holds the card images, and it's placed on top of wP)
        //bP = Button Panel (the first layer on top of the container, which contains the button)
        //cLObj = CardLayout Object (this Layout object is responsible for layering JPanels on top of each other.

        JPanel cP1 = new JPanel();
        CardLayout cLObj1 = new CardLayout();
        cP1.setLayout(cLObj1);

        JPanel iP1 = new JPanel();
        JPanel wP1 = new JPanel();
        JPanel bP1 = new JPanel();

        //setting a GridLayout to bP1, so that the Button covers the entire panel.
        bP1.setLayout(new GridLayout(1,1));

        // For now, I've just added two different background colors to iP and wP. Later we can add our images to the iP, instead.
        iP1.setBackground(Color.GREEN);
        wP1.setBackground(Color.WHITE);

        JButton button1 = new JButton("Button 1");
        bP1.add(button1);


        cP1.add(bP1, "1.1");
        cP1.add(iP1, "1.2");
        cP1.add(wP1, "1.3");
        cLObj1.show(cP1, "1.1");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj1.show(cP1, "1.2");
            }
        });


        JPanel cP2 = new JPanel();
        CardLayout cLObj2 = new CardLayout();
        cP2.setLayout(cLObj2);

        JPanel iP2 = new JPanel();
        JPanel wP2 = new JPanel();
        JPanel bP2 = new JPanel();

        bP2.setLayout(new GridLayout(1,1));

        iP2.setBackground(Color.GREEN);
        wP2.setBackground(Color.WHITE);

        JButton button2 = new JButton("Button 2");
        bP2.add(button2);

        cP2.add(bP2, "2.1");
        cP2.add(iP2, "2.2");
        cP2.add(wP2, "2.3");
        cLObj2.show(cP2, "2.1");

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj2.show(cP2, "2.2");
            }
        });


        JPanel cP3 = new JPanel();
        CardLayout cLObj3 = new CardLayout();
        cP3.setLayout(cLObj3);

        JPanel iP3 = new JPanel();
        JPanel wP3 = new JPanel();
        JPanel bP3 = new JPanel();

        bP3.setLayout(new GridLayout(1,1));

        iP3.setBackground(Color.GREEN);
        wP3.setBackground(Color.WHITE);

        JButton button3 = new JButton("Button 3");
        bP3.add(button3);

        cP3.add(bP3, "3.1");
        cP3.add(iP3, "3.2");
        cP3.add(wP3, "3.3");
        cLObj2.show(cP2, "3.1");

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj3.show(cP3, "3.2");
            }
        });

        JPanel cP4 = new JPanel();
        CardLayout cLObj4 = new CardLayout();
        cP4.setLayout(cLObj4);

        JPanel iP4 = new JPanel();
        JPanel wP4 = new JPanel();
        JPanel bP4 = new JPanel();

        bP4.setLayout(new GridLayout(1,1));

        iP4.setBackground(Color.GREEN);
        wP4.setBackground(Color.WHITE);

        JButton button4 = new JButton("Button 4");
        bP4.add(button4);

        cP4.add(bP4, "4.1");
        cP4.add(iP4, "4.2");
        cP4.add(wP4, "4.3");
        cLObj4.show(cP4, "4.1");

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj4.show(cP4, "4.2");
            }
        });

        JPanel cP5 = new JPanel();
        CardLayout cLObj5 = new CardLayout();
        cP5.setLayout(cLObj5);

        JPanel iP5 = new JPanel();
        JPanel wP5 = new JPanel();
        JPanel bP5 = new JPanel();

        bP5.setLayout(new GridLayout(1,1));

        iP5.setBackground(Color.GREEN);
        wP5.setBackground(Color.WHITE);

        JButton button5 = new JButton("Button 5");
        bP5.add(button5);

        cP5.add(bP5, "5.1");
        cP5.add(iP5, "5.2");
        cP5.add(wP5, "5.3");
        cLObj5.show(cP5, "5.1");

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj5.show(cP5, "5.2");
            }
        });

        JPanel cP6 = new JPanel();
        CardLayout cLObj6 = new CardLayout();
        cP6.setLayout(cLObj6);

        JPanel iP6 = new JPanel();
        JPanel wP6 = new JPanel();
        JPanel bP6 = new JPanel();

        bP6.setLayout(new GridLayout(1,1));

        iP6.setBackground(Color.GREEN);
        wP6.setBackground(Color.WHITE);

        JButton button6 = new JButton("Button 6");
        bP6.add(button6);

        cP6.add(bP6, "6.1");
        cP6.add(iP6, "6.2");
        cP6.add(wP6, "6.3");
        cLObj6.show(cP6, "6.1");

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj6.show(cP6, "6.2");
            }
        });

        JPanel cP7 = new JPanel();
        CardLayout cLObj7 = new CardLayout();
        cP7.setLayout(cLObj7);

        JPanel iP7 = new JPanel();
        JPanel wP7 = new JPanel();
        JPanel bP7 = new JPanel();

        bP7.setLayout(new GridLayout(1,1));

        iP7.setBackground(Color.GREEN);
        wP7.setBackground(Color.WHITE);

        JButton button7 = new JButton("Button 7");
        bP7.add(button7);

        cP7.add(bP7, "7.1");
        cP7.add(iP7, "7.2");
        cP7.add(wP7, "7.3");
        cLObj7.show(cP7, "7.1");

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj7.show(cP7, "7.2");
            }
        });

        JPanel cP8 = new JPanel();
        CardLayout cLObj8 = new CardLayout();
        cP8.setLayout(cLObj8);

        JPanel iP8 = new JPanel();
        JPanel wP8 = new JPanel();
        JPanel bP8 = new JPanel();

        bP8.setLayout(new GridLayout(1,1));

        iP8.setBackground(Color.GREEN);
        wP8.setBackground(Color.WHITE);

        JButton button8 = new JButton("Button 8");
        bP8.add(button8);

        cP8.add(bP8, "8.1");
        cP8.add(iP8, "8.2");
        cP8.add(wP8, "8.3");
        cLObj8.show(cP8, "8.1");

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj8.show(cP8, "8.2");
            }
        });

        JPanel cP9 = new JPanel();
        CardLayout cLObj9 = new CardLayout();
        cP9.setLayout(cLObj9);

        JPanel iP9 = new JPanel();
        JPanel wP9 = new JPanel();
        JPanel bP9 = new JPanel();

        bP9.setLayout(new GridLayout(1,1));

        iP9.setBackground(Color.GREEN);
        wP9.setBackground(Color.WHITE);

        JButton button9 = new JButton("Button 9");
        bP9.add(button9);

        cP9.add(bP9, "9.1");
        cP9.add(iP9, "9.2");
        cP9.add(wP9, "9.3");
        cLObj9.show(cP9, "9.1");

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj9.show(cP9, "9.2");
            }
        });

        JPanel cP10 = new JPanel();
        CardLayout cLObj10 = new CardLayout();
        cP10.setLayout(cLObj10);

        JPanel iP10 = new JPanel();
        JPanel wP10 = new JPanel();
        JPanel bP10 = new JPanel();

        bP10.setLayout(new GridLayout(1,1));

        iP10.setBackground(Color.GREEN);
        wP10.setBackground(Color.WHITE);

        JButton button10 = new JButton("Button 10");
        bP10.add(button10);

        cP10.add(bP10, "10.1");
        cP10.add(iP10, "10.2");
        cP10.add(wP10, "10.3");
        cLObj10.show(cP10, "10.1");

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj10.show(cP10, "10.2");
            }
        });

        JPanel cP11 = new JPanel();
        CardLayout cLObj11 = new CardLayout();
        cP11.setLayout(cLObj11);

        JPanel iP11 = new JPanel();
        JPanel wP11 = new JPanel();
        JPanel bP11 = new JPanel();

        bP11.setLayout(new GridLayout(1,1));

        iP11.setBackground(Color.GREEN);
        wP11.setBackground(Color.WHITE);

        JButton button11 = new JButton("Button 11");
        bP11.add(button11);

        cP11.add(bP11, "11.1");
        cP11.add(iP11, "11.2");
        cP11.add(wP11, "11.3");
        cLObj11.show(cP11, "11.1");

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj11.show(cP11, "11.2");
            }
        });

        JPanel cP12 = new JPanel();
        CardLayout cLObj12 = new CardLayout();
        cP12.setLayout(cLObj12);

        JPanel iP12 = new JPanel();
        JPanel wP12 = new JPanel();
        JPanel bP12 = new JPanel();

        bP12.setLayout(new GridLayout(1,1));

        iP12.setBackground(Color.GREEN);
        wP12.setBackground(Color.WHITE);

        JButton button12 = new JButton("Button 12");
        bP12.add(button12);

        cP12.add(bP12, "12.1");
        cP12.add(iP12, "12.2");
        cP12.add(wP12, "12.3");
        cLObj12.show(cP12, "12.1");

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj12.show(cP12, "12.2");
            }
        });

        JPanel cP13 = new JPanel();
        CardLayout cLObj13 = new CardLayout();
        cP13.setLayout(cLObj13);

        JPanel iP13 = new JPanel();
        JPanel wP13 = new JPanel();
        JPanel bP13 = new JPanel();

        bP13.setLayout(new GridLayout(1,1));

        iP13.setBackground(Color.GREEN);
        wP13.setBackground(Color.WHITE);

        JButton button13 = new JButton("Button 13");
        bP13.add(button13);

        cP13.add(bP13, "13.1");
        cP13.add(iP13, "13.2");
        cP13.add(wP13, "13.3");
        cLObj13.show(cP13, "13.1");

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj13.show(cP13, "13.2");
            }
        });

        JPanel cP14 = new JPanel();
        CardLayout cLObj14 = new CardLayout();
        cP14.setLayout(cLObj14);

        JPanel iP14 = new JPanel();
        JPanel wP14 = new JPanel();
        JPanel bP14 = new JPanel();

        bP14.setLayout(new GridLayout(1,1));

        iP14.setBackground(Color.GREEN);
        wP14.setBackground(Color.WHITE);

        JButton button14 = new JButton("Button 14");
        bP14.add(button14);

        cP14.add(bP14, "14.1");
        cP14.add(iP14, "14.2");
        cP14.add(wP14, "14.3");
        cLObj14.show(cP14, "14.1");

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj14.show(cP14, "14.2");
            }
        });

        JPanel cP15 = new JPanel();
        CardLayout cLObj15 = new CardLayout();
        cP15.setLayout(cLObj15);

        JPanel iP15 = new JPanel();
        JPanel wP15 = new JPanel();
        JPanel bP15 = new JPanel();

        bP15.setLayout(new GridLayout(1,1));

        iP15.setBackground(Color.GREEN);
        wP15.setBackground(Color.WHITE);

        JButton button15 = new JButton("Button 15");
        bP15.add(button15);

        cP15.add(bP15, "15.1");
        cP15.add(iP15, "15.2");
        cP15.add(wP15, "15.3");
        cLObj15.show(cP15, "15.1");

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj15.show(cP15, "15.2");
            }
        });

        JPanel cP16 = new JPanel();
        CardLayout cLObj16 = new CardLayout();
        cP16.setLayout(cLObj16);

        JPanel iP16 = new JPanel();
        JPanel wP16 = new JPanel();
        JPanel bP16 = new JPanel();

        bP16.setLayout(new GridLayout(1,1));

        iP16.setBackground(Color.GREEN);
        wP16.setBackground(Color.WHITE);

        JButton button16 = new JButton("Button 16");
        bP16.add(button16);

        cP16.add(bP16, "16.1");
        cP16.add(iP16, "16.2");
        cP16.add(wP16, "16.3");
        cLObj16.show(cP16, "16.1");

        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cLObj16.show(cP16, "16.2");
            }
        });

        gP.add(cP1);
        gP.add(cP2);
        gP.add(cP3);
        gP.add(cP4);
        gP.add(cP5);
        gP.add(cP6);
        gP.add(cP7);
        gP.add(cP8);
        gP.add(cP9);
        gP.add(cP10);
        gP.add(cP11);
        gP.add(cP12);
        gP.add(cP13);
        gP.add(cP14);
        gP.add(cP15);
        gP.add(cP16);

        frame.add(gP);
        //frame.pack();
        frame.setVisible(true);
    }
}
