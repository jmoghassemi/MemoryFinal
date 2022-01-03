import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardView extends JFrame {

    // Variables declaration - do not modify
    private JPanel downPanel;
    private JButton exitButton;
    private JLabel lbl1;
    private JLabel lbl10;
    private JLabel lbl11;
    private JLabel lbl12;
    private JLabel lbl13;
    private JLabel lbl14;
    private JLabel lbl15;
    private JLabel lbl16;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    private JPanel leftPanel;
    private JButton newButton;
    private JTextField player1Name;
    private JLabel player1Point;
    private JTextField player2Name;
    private JLabel player2Point;
    private JPanel rightPanel;
    private Color[] cardShuffle;
    private boolean firstClick, secondClick;
    private int playerStatus;
    // End of variables declaration

    public BoardView() {
        initComponents();
    }

    public void resetComponent(){
        cardShuffle = functions.cardShuffle();
        playerStatus = 1;
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
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        leftPanel = new JPanel();
        player1Name = new JTextField();
        player1Point = new JLabel();
        player2Name = new JTextField();
        player2Point = new JLabel();
        rightPanel = new JPanel();
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
        downPanel = new JPanel();
        exitButton = new JButton();
        newButton = new JButton();
        cardShuffle = functions.cardShuffle();
        playerStatus = 1;

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

        if(playerStatus == 1){
            player1Name.setBackground(new java.awt.Color(95, 191, 175));
            player1Point.setBackground(new java.awt.Color(95, 191, 175));
        }else{
            player2Name.setBackground(new java.awt.Color(95, 191, 175));
            player2Point.setBackground(new java.awt.Color(95, 191, 175));
        }

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
                                        .addComponent(player2Point, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(player1Name, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player1Point, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(player2Name, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(player2Point, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new Color(185, 190, 220));
        rightPanel.setPreferredSize(new Dimension(620, 470));

        lbl1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                lbl1.setOpaque(true);
                lbl1.setBackground(cardShuffle[0]);
            }
        });

        lbl2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl2.setOpaque(true);
                lbl2.setBackground(cardShuffle[1]);
            }
        });
        lbl3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl3.setOpaque(true);
                lbl3.setBackground(cardShuffle[2]);
            }
        });
        lbl4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl4.setOpaque(true);
                lbl4.setBackground(cardShuffle[3]);
            }
        });
        lbl5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl5.setOpaque(true);
                lbl5.setBackground(cardShuffle[4]);
            }
        });
        lbl6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl6.setOpaque(true);
                lbl6.setBackground(cardShuffle[5]);
            }
        });
        lbl7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl7.setOpaque(true);
                lbl7.setBackground(cardShuffle[6]);
            }
        });
        lbl8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl8.setOpaque(true);
                lbl8.setBackground(cardShuffle[7]);
            }
        });
        lbl9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl9.setOpaque(true);
                lbl9.setBackground(cardShuffle[8]);
            }
        });
        lbl10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl10.setOpaque(true);
                lbl10.setBackground(cardShuffle[9]);
            }
        });
        lbl11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl11.setOpaque(true);
                lbl11.setBackground(cardShuffle[10]);
            }
        });
        lbl12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl12.setOpaque(true);
                lbl12.setBackground(cardShuffle[11]);
            }
        });
        lbl13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl13.setOpaque(true);
                lbl13.setBackground(cardShuffle[12]);
            }
        });
        lbl14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl14.setOpaque(true);
                lbl14.setBackground(cardShuffle[13]);
            }
        });
        lbl15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl15.setOpaque(true);
                lbl15.setBackground(cardShuffle[14]);
            }
        });
        lbl16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lbl16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                lbl16.setOpaque(true);
                lbl16.setBackground(cardShuffle[15]);
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
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetComponent();
                initComponents();
            }
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
    
}
