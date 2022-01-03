import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class functions {

    public static JPanel drawCard(String btName, String pos1, String pos2, String pos3, String objPos, String addr) throws IOException {
        //cP = Container Panel
        //wP = White Panel (the lowest layer in stack/background panel)
        //iP = Image Panel (The panel which holds the card images, and it's placed on top of wP)
        //bP = Button Panel (the first layer on top of the container, which contains the button)
        //cLObj = CardLayout Object (this Layout object is responsible for layering JPanels on top of each other).

        JPanel cPx = new JPanel();
        CardLayout cLObjx = new CardLayout();
        cPx.setLayout(cLObjx);

        JPanel iPx = new JPanel();
        JPanel wPx = new JPanel();
        JPanel bPx = new JPanel();

        //setting a GridLayout to bP1, so that the Button covers the entire panel.
        bPx.setLayout(new GridLayout(1,1));

        // For now, I've just added two different background colors to iP and wP. Later we can add our images to the iP, instead.


        iPx.setBackground(Color.darkGray);
        wPx.setBackground(Color.WHITE);


        JButton buttonx = new JButton(btName);

        bPx.add(buttonx);

        cPx.add(bPx, pos1);
        cPx.add(iPx, pos2);
        cPx.add(wPx, pos3);
        cLObjx.show(cPx, objPos);

        buttonx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cLObjx.show(cPx, pos2);
                showCard(addr,buttonx,cLObjx,cPx,objPos);
                System.out.println("Mouse click => "+btName+" , "+addr);
            }

            public static void showCard(String addr,JButton buttonx,CardLayout cLObjx,JPanel cPx,String objPos){
                File currentDirFile = new File("img\\"+addr);
                String currentDir =currentDirFile.getAbsolutePath();
                Icon icon = new ImageIcon(currentDir);
                buttonx.setIcon(icon);
                cLObjx.show(cPx, objPos);
            }
        });
        return cPx;
    }

    public static boolean checkCardStatus(){
        return false;
    }

    public static Color[] cardShuffle(){
        List<Color> cardColorList = Arrays.asList(Color.RED,Color.green,Color.BLUE,Color.ORANGE,Color.CYAN,Color.MAGENTA,Color.PINK,Color.YELLOW
                ,Color.RED,Color.green,Color.BLUE,Color.ORANGE,Color.CYAN,Color.MAGENTA,Color.PINK,Color.YELLOW);
        Collections.shuffle(cardColorList);

        Color[] ccl = new Color[cardColorList.size()];
        ccl = cardColorList.toArray(ccl);

        return ccl;
    }
}
