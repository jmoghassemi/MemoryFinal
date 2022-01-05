import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardView extends JFrame {

    // Variables declaration - do not modify
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    private JLabel lbl10;
    private JLabel lbl11;
    private JLabel lbl12;
    private JLabel lbl13;
    private JLabel lbl14;
    private JLabel lbl15;
    private JLabel lbl16;
    private JLabel msg; // This variable using for show information on the screen.
    private JTextField player1Name;
    private JLabel player1Point;
    private JTextField player2Name;
    private JLabel player2Point;
    private Color[] cardShuffle;
    private boolean firstClick, secondClick;
    private JLabel firstSelect, secondSelect;
    private boolean[] cardStatus; // To keep cards status when select card and invisible.
    private int activePlayer; // to keep player keep
    // End of variables declaration

    public BoardView() {
        initComponents();
    }

    public void resetComponent(){
        cardShuffle = functions.cardShuffle();
        player1Point.setText("0");
        player2Point.setText("0");
        firstClick = false;
        secondClick=false;
        lbl1.setOpaque(false);
        lbl2.setOpaque(false);
        lbl3.setOpaque(false);
        lbl4.setOpaque(false);
        lbl5.setOpaque(false);
        lbl6.setOpaque(false);
        lbl7.setOpaque(false);
        lbl8.setOpaque(false);
        lbl9.setOpaque(false);
        lbl10.setOpaque(false);
        lbl11.setOpaque(false);
        lbl12.setOpaque(false);
        lbl13.setOpaque(false);
        lbl14.setOpaque(false);
        lbl15.setOpaque(false);
        lbl16.setOpaque(false);
        msg.setText("  Welcome!!!  ");
        activePlayer=1;
        firstSelect=null;
        secondSelect=null;
        for (int i=0;i<16;i++){ cardStatus[i]=false;}
    }
    private void initComponents() {

        JPanel leftPanel = new JPanel(); // This panel using for information part.
        player1Name = new JTextField();
        player1Point = new JLabel();
        player2Name = new JTextField();
        player2Point = new JLabel();
        JPanel rightPanel = new JPanel(); // This panel using for cards.
        lbl1 = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        lbl4 = new JLabel();
        lbl5 = new JLabel();
        lbl6 = new JLabel();
        lbl7 = new JLabel();
        lbl8 = new JLabel();
        lbl9 = new JLabel();
        lbl10 = new JLabel();
        lbl11 = new JLabel();
        lbl12 = new JLabel();
        lbl13 = new JLabel();
        lbl14 = new JLabel();
        lbl15 = new JLabel();
        lbl16 = new JLabel();
        msg = new JLabel();
        JPanel downPanel = new JPanel(); // This panel using for exit and new button.
        JButton exitButton = new JButton();
        JButton newButton = new JButton();
        cardShuffle = functions.cardShuffle();
        firstSelect=null;
        secondSelect=null;
        cardStatus = new boolean[16];
        for (int i=0;i<16;i++){ cardStatus[i]=false;}
        activePlayer=1;


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory Game - Java Project 3");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("BoardView"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        leftPanel.setName(""); // NOI18N

        player1Name.setHorizontalAlignment(JTextField.CENTER);
        player1Name.setText("Player 1");

        player1Point.setHorizontalAlignment(SwingConstants.CENTER);
        player1Point.setText("0");

        player2Name.setHorizontalAlignment(JTextField.CENTER);
        player2Name.setText("Player 2");

        player2Point.setHorizontalAlignment(SwingConstants.CENTER);
        player2Point.setText("0");

        msg.setHorizontalAlignment(SwingConstants.LEFT);
        msg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        msg.setOpaque(true);
        msg.setBackground(new Color(80, 125, 40));
        msg.setText("  Welcome!!!  ");

        playerStatus();

        GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(player1Name)
                                        .addComponent(player1Point, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(player2Name, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(player2Point, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(msg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                )
                                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(player1Name, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player1Point, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(player2Name, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(player2Point, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(msg, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
        );

        rightPanel.setBackground(new Color(185, 190, 220));
        rightPanel.setPreferredSize(new Dimension(620, 470));

        lbl1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl1.isEnabled()) {
                    lbl1.setOpaque(true);
                    lbl1.setBackground(cardShuffle[0]);
                    checkStatus(lbl1, 0);
                }
            }
        });

        lbl2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl2.isEnabled()) {
                    lbl2.setOpaque(true);
                    lbl2.setBackground(cardShuffle[1]);
                    checkStatus(lbl2, 1);
                }
            }
        });
        lbl3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl3.isEnabled()) {
                    lbl3.setOpaque(true);
                    lbl3.setBackground(cardShuffle[2]);
                    checkStatus(lbl3, 2);
                }
            }
        });
        lbl4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl4.isEnabled()) {
                    lbl4.setOpaque(true);
                    lbl4.setBackground(cardShuffle[3]);
                    checkStatus(lbl4, 3);
                }
            }
        });
        lbl5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl5.isEnabled()) {
                    lbl5.setOpaque(true);
                    lbl5.setBackground(cardShuffle[4]);
                    checkStatus(lbl5, 4);
                }
            }
        });
        lbl6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl6.isEnabled()) {
                    lbl6.setOpaque(true);
                    lbl6.setBackground(cardShuffle[5]);
                    checkStatus(lbl6, 5);
                }
            }
        });
        lbl7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl7.isEnabled()) {
                    lbl7.setOpaque(true);
                    lbl7.setBackground(cardShuffle[6]);
                    checkStatus(lbl7, 6);
                }
            }
        });
        lbl8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl8.isEnabled()) {
                    lbl8.setOpaque(true);
                    lbl8.setBackground(cardShuffle[7]);
                    checkStatus(lbl8, 7);
                }
            }
        });
        lbl9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl9.isEnabled()) {
                    lbl9.setOpaque(true);
                    lbl9.setBackground(cardShuffle[8]);
                    checkStatus(lbl9, 8);
                }
            }
        });
        lbl10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl10.isEnabled()) {
                    lbl10.setOpaque(true);
                    lbl10.setBackground(cardShuffle[9]);
                    checkStatus(lbl10, 9);
                }
            }
        });
        lbl11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl11.isEnabled()) {
                    lbl11.setOpaque(true);
                    lbl11.setBackground(cardShuffle[10]);
                    checkStatus(lbl11, 10);
                }
            }
        });
        lbl12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl12.isEnabled()) {
                    lbl12.setOpaque(true);
                    lbl12.setBackground(cardShuffle[11]);
                    checkStatus(lbl12, 11);
                }
            }
        });
        lbl13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl13.isEnabled()) {
                    lbl13.setOpaque(true);
                    lbl13.setBackground(cardShuffle[12]);
                    checkStatus(lbl13, 12);
                }
            }
        });
        lbl14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl14.isEnabled()) {
                    lbl14.setOpaque(true);
                    lbl14.setBackground(cardShuffle[13]);
                    checkStatus(lbl14, 13);
                }
            }
        });
        lbl15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl15.isEnabled()) {
                    lbl15.setOpaque(true);
                    lbl15.setBackground(cardShuffle[14]);
                    checkStatus(lbl15, 14);
                }
            }
        });
        lbl16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (lbl16.isEnabled()) {
                    lbl16.setOpaque(true);
                    lbl16.setBackground(cardShuffle[15]);
                    checkStatus(lbl16, 15);
                }
            }
        });

        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(lbl9, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl10, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl11, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl12, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(lbl13, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl14, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl15, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl16, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl4, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(lbl5, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl6, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl7, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl8, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl4, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl5, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl8, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl9, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl10, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl11, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl12, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl13, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl14, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl15, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl16, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(e -> System.exit(0));

        newButton.setText("New");
        newButton.addActionListener(e -> {
            resetComponent();
            initComponents();
        });

        GroupLayout downPanelLayout = new GroupLayout(downPanel);
        downPanel.setLayout(downPanelLayout);
        downPanelLayout.setHorizontalGroup(
                downPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(downPanelLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(newButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        downPanelLayout.setVerticalGroup(
                downPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, downPanelLayout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addGroup(downPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(exitButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(newButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(downPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(leftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(downPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void playerStatus() {
        if(activePlayer == 1){
            player1Name.setBackground(new java.awt.Color(170, 40, 45));
            player1Point.setBackground(new java.awt.Color(95, 191, 175));
            player2Name.setBackground(new java.awt.Color(165, 170, 165));
            player2Point.setBackground(new java.awt.Color(165, 170, 165));

        }else{
            player1Name.setBackground(new java.awt.Color(165, 170, 165));
            player1Point.setBackground(new java.awt.Color(165, 170, 165));
            player2Name.setBackground(new java.awt.Color(170, 40, 45));
            player2Point.setBackground(new java.awt.Color(95, 191, 175));
        }
    }

    private void checkStatus(JLabel lblx, int lblNo) {
        //##############################################################
        if (checkCardStatus()) {
            if (!firstClick) {
                firstClick = true;
                firstSelect = lblx;
                cardStatus[lblNo] = true;
                msg.setText("First Select.");
            } else if ((!secondClick) && (firstSelect != lblx)) {
                msg.setText("Second Select.");
                secondClick = true;
                secondSelect = lblx;
                cardStatus[lblNo] = true;
                if (checkEqual(firstSelect, secondSelect)) {
                    msg.setText("<html>You select a true color. <br> You got a point</html>");
                    firstSelect.setEnabled(false);
                    secondSelect.setEnabled(false);
                    firstSelect = null;
                    secondSelect = null;
                    firstClick = false;
                    secondClick = false;
                    if (activePlayer == 1) {
                        player1Point.setText(String.valueOf(Integer.parseInt(player1Point.getText()) + 1));
                    } else {
                        player2Point.setText(String.valueOf(Integer.parseInt(player2Point.getText()) + 1));
                    }

                } else {
                    msg.setText("<html>You select a wrong color. <br> You miss your turn. </html>");
                    firstSelect.setBackground(null);
                    secondSelect.setBackground(null);
                    firstSelect.setOpaque(false);
                    secondSelect.setOpaque(false);
                    firstSelect = null;
                    secondSelect = null;
                    firstClick = false;
                    secondClick = false;
                    // Start BUG #############################
                    cardStatus[lblNo] = false;
                    if (activePlayer == 1) {
                        activePlayer = 2;
                    } else {
                        activePlayer = 1;
                    }
                    playerStatus();
                }
            } else {
                msg.setText("<html>Wrong select!!! <br> try again.</html>");
            }
        }else{
            String message;
            if (Integer.parseInt(player1Point.getText()) > Integer.parseInt(player2Point.getText())){
                message = "Congratulation, " + player1Name.getText() + " win!";
            }else if(Integer.parseInt(player1Point.getText()) < Integer.parseInt(player2Point.getText())){
                message = "Congratulation, " + player2Name.getText() + " win!";
            }else {
                message = "The game ended in a draw.";
            }
            msg.setText("<html>Finish the Game. <br> "+message+" </html>");
            JOptionPane.showMessageDialog(null, "Finish the Game \n" + message,
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean checkCardStatus() {
        for (boolean crdst : cardStatus){
            if (!crdst){
                return true;
            }
        }
        return false;
    }

    private boolean checkEqual(JLabel firstSelect, JLabel secondSelect) {
        return firstSelect.getBackground() == secondSelect.getBackground();
    }

}
