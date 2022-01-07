
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Phillip Munyororo
 */
public class BoardView implements ActionListener {

    JLabel player1Name, player2Name;
    JLabel player1Score, player2Score;
    JButton newBtn, endBtn;
    JButton board[];
    Card cardList[];
    JFrame fr;
    JPanel player1Panel, player2Panel, mainBoardPanel, footerPanel;
    Vector<Integer> currentCardsList;
    Player p1, p2, activePlayer;
    int turn;
    int rows;
    int cols;
    int size;

    public BoardView(String p1Name, String p2Name, Card[] cardList, int rows, int cols, int size) {

        // create players
        p1 = new Player(true, 0, p1Name);
        p2 = new Player(true, 0, p2Name);
        // set player 1 turn first
        this.turn = 1;
        if (turn == 1) {
            activePlayer = p1;
            p1.inactive = false;
        } else {
            activePlayer = p2;
            p2.inactive = false;
        }
        // currentCardsList will maintain the records of last 2 selected cards
        currentCardsList = new Vector<>();
        this.cardList = cardList;
        this.rows = rows;
        this.cols = cols;
        this.size = size;
        // shuffle the board
        generateRandomCards();
        // initilize the GUI of board
        initilizeGUI();
    }

    private void initilizeGUI() {
        // create frame
        fr = new JFrame("Memory");
        fr.setLayout(null);
        // create 4 different pannel
        // Player1Panel, Player2Panel, MainBoardPanel, and FooterPainer
        player1Panel = new JPanel();
        player2Panel = new JPanel();
        mainBoardPanel = new JPanel();
        footerPanel = new JPanel();
        // set bounds of panels
        player1Panel.setBounds(0, 0, 150, 250);
        player2Panel.setBounds(0, 250, 150, 250);
        mainBoardPanel.setBounds(150, 0, 500, 500);
        footerPanel.setBounds(0, 500, 650, 100);

        // create grid for (Player name and score) for Player1 Panel  
        player1Panel.setLayout(new GridLayout(2, 1));
        player2Panel.setLayout(new GridLayout(2, 1));

        // set label player name, and score for player 1
        player1Name = new JLabel("Player 1", JLabel.CENTER);
        player1Score = new JLabel("0", JLabel.CENTER);
        player1Name.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        player1Score.setFont(new Font("TimesRoman", Font.PLAIN, 45));
        player1Panel.add(player1Name);
        player1Panel.add(player1Score);

        // set label player name, and score for player 2
        player2Name = new JLabel("Player 2", JLabel.CENTER);
        player2Score = new JLabel("0", JLabel.CENTER);
        player2Name.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        player2Score.setFont(new Font("TimesRoman", Font.PLAIN, 45));
        player2Panel.add(player2Name);
        player2Panel.add(player2Score);
        // set background and border 
        player1Panel.setBackground(Color.yellow);
        player2Panel.setBackground(Color.LIGHT_GRAY);
        player1Panel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        player2Panel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        mainBoardPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        footerPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));

        // create main board panel of Grid rows x cols
        mainBoardPanel.setLayout(new GridLayout(rows, cols));
        board = new JButton[size];
        for (int i = 0; i < size; i++) {
            // store the card number 1 to size on button
            board[i] = new JButton(i + "");
            board[i].addActionListener(this);
            // and hide the text
            board[i].setFont(new Font("TimesRoman", Font.PLAIN, 0));
            board[i].setBackground(Color.blue);
            board[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            ImageIcon icon = new ImageIcon("");
            board[i].setIcon(icon);
            board[i].setBackground(Color.blue);
            mainBoardPanel.add(board[i]);
        }
        fr.add(player1Panel);
        fr.add(player2Panel);
        fr.add(mainBoardPanel);

        // footer pannel 
        JButton newBtn = new JButton("New");
        JButton endBtn = new JButton("End");
        newBtn.setPreferredSize(new Dimension(100, 40));
        endBtn.setMargin(new Insets(0, 0, 0, 0));
        endBtn.setPreferredSize(new Dimension(100, 40));
        newBtn.setFont(new Font("TimesRoman", Font.BOLD, 15));
        endBtn.setFont(new Font("TimesRoman", Font.BOLD, 15));
        newBtn.addActionListener(this);
        endBtn.addActionListener(this);
        footerPanel.add(newBtn);
        footerPanel.add(endBtn);
        fr.add(footerPanel);
        // set frame size
        fr.setSize(656, 600);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(false);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);

    }

    // set visibility of frame to Visible
    public void showBoard() {
        fr.setVisible(true);
    }

    // check all cards are eliminated or not
    public boolean isBoardSolved() {
        int i = 0;
        while (i < size) {
            if (cardList[i].visibility != Visibility.ELIMINATED) {
                return false;
            }
            i++;
        }
        return true;
    }

    // reset the game board view
    private void resetBoardView() {
        generateRandomCards();
        for (int i = 0; i < size; i++) {
            ImageIcon icon = new ImageIcon("");
            board[i].setIcon(icon);
            board[i].setBackground(Color.blue);
            cardList[i].visibility = Visibility.INVISIBLE;
        }
        // reset panel color
        player1Panel.setBackground(Color.YELLOW);
        player2Panel.setBackground(Color.LIGHT_GRAY);
        // reset score
        player1Score.setText("0");
        player2Score.setText("0");
        currentCardsList.clear();
        // reset score
        p1.resetScore();
        p2.resetScore();
        activePlayer = p1;
        p1.inactive = false;
        p2.inactive = true;
        turn = 1;
    }

    // update the score
    public void updateScore() {
        activePlayer.incrementScore();
        int score = activePlayer.getScore();
        if (turn == 1 && p1.inactive == false) {
            player1Score.setText(score + "");
        } else {
            player2Score.setText(score + "");
        }
        if (isBoardSolved()) {
            if (p1.getScore() == p2.getScore()) {
                JOptionPane.showMessageDialog(new JFrame(), " Draw Game!");
            }
            else if (p1.getScore() > p2.getScore()) {
                JOptionPane.showMessageDialog(new JFrame(), p1.name + " Won the Game!");

            }
            else {
                JOptionPane.showMessageDialog(new JFrame(), p2.name + " Won the Game!");
            }

        }
    }

    // this function will shuffle the cardlist
    private void generateRandomCards() {
        Random random = new Random();
        // shuffle the cardList
        for (int i = 0; i < size - 1; i++) {
            int randomIndex = random.nextInt(size);
            Card temp = cardList[i];
            cardList[i] = cardList[randomIndex];
            cardList[randomIndex] = temp;
        }
    }

    // this function will change the turn of active player 
    public void updateTurn() {
        if (turn == 1 && p1.inactive == false) {
            activePlayer = p2;
            player1Panel.setBackground(Color.LIGHT_GRAY);
            player2Panel.setBackground(Color.yellow);
            turn = 2;
        } else {
            activePlayer = p1;
            player1Panel.setBackground(Color.yellow);
            player2Panel.setBackground(Color.LIGHT_GRAY);
            turn = 1;
        }
    }

    // button pressed handling
    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (cmd.equals("End")) {
            System.exit(0);
        } else if (cmd.equals("New")) {
            resetBoardView();
        } else {
            // check invalid card select
            int i = Integer.parseInt(cmd);
            int size = currentCardsList.size();
//            System.out.println("size: " + size);
            // if size of currentCardsList = 2, or cardVisibility is not invisible, or currentCardList is not selected previous one
            // then return and do nothing
            if (size == 2 || cardList[i].visibility != Visibility.INVISIBLE || (size == 1 && currentCardsList.get(0) == i)) {
                return;
            }
            currentCardsList.add(i);
            if (cardList[i].visibility == Visibility.INVISIBLE) {
                String file = cardList[i].image;
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(file).getImage().getScaledInstance(115, 120, Image.SCALE_DEFAULT));
                board[i].setIcon(imageIcon);
                cardList[i].visibility = Visibility.VISIBLE;
//                System.out.println(cmd);
                if (currentCardsList.size() == 2) {
                    // get index of previous card1 and previous card2 from currentCardsList
                    int index1 = currentCardsList.get(0);
                    int index2 = currentCardsList.get(1);
//                    System.out.println(cardList[index1].image + " : " + cardList[index2].image);
                    // if cards are same then make it eliminated
                    if (cardList[index1].image.equals(cardList[index2].image)) {
                        // make the cards eleminated
                        cardList[index1].visibility = Visibility.ELIMINATED;
                        cardList[index2].visibility = Visibility.ELIMINATED;
                        // change the background of card to white
                        board[index1].setIcon(new ImageIcon(""));
                        board[index1].setBackground(Color.white);
                        board[index2].setIcon(new ImageIcon(""));
                        board[index2].setBackground(Color.white);
                        currentCardsList.clear();
                        // update the score
                        updateScore();
                    } else {
                        // if cards are not same, then make the cards hidden after 2 seconds
                        MyThread thread = new MyThread(this, index1, index2);
                        thread.start();
                    }
                }
            }
        }
    }
    
    // this thread class will hide the 2 cards after 2 seconds
    class MyThread extends Thread {
        BoardView boardView;
        int index1;
        int index2;
        Vector<Integer> currentCardList;
        
        private MyThread(BoardView boardView, int index1, int index2) {
            this.boardView = boardView;
            this.index1 = index1;
            this.index2 = index2;
        }

        public void run() {
            try {
                // wait of 2 sec
                Thread.sleep(2000);
                // change status
                cardList[index1].visibility = Visibility.INVISIBLE;
                cardList[index2].visibility = Visibility.INVISIBLE;
                boardView.board[index1].setIcon(new ImageIcon(""));
                boardView.board[index1].setBackground(Color.blue);
                boardView.board[index2].setIcon(new ImageIcon(""));
                boardView.board[index2].setBackground(Color.blue);
                boardView.currentCardsList.clear();
                boardView.updateTurn();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
