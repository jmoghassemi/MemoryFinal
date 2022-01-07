
import java.util.Scanner;


/**
 *
 * @author Phillip Munyororo
 */
public class Game {

    BoardView board;

    public Game(String p1, String p2, int rows, int cols, int size) {
        Card [ ]cardList = new Card[size];
        int count = 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // initlize cardList
            cardList[i] = new Card("Images//" + count + ".png", Visibility.INVISIBLE);
            arr[i] = count;
            count++;
            if (count == size/2 + 1) {
                count = 1;
            }
        }
        // create BoardView
        board = new BoardView(p1, p2, cardList, rows, cols, size);
    }

    public void start() {
        board.showBoard();
    }

    // main function
    public static void main(String[] args) {
        // select grid size
        int option = -1;
        while (option == -1) {
            System.out.println("Please Select Grid Size");
            System.out.println("1. 2x4");
            System.out.println("2. 3x2");
            System.out.println("3. 3x4");
            System.out.println("4. 4x2");
            System.out.println("5. 4x4");
            System.out.print("Option: ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            if (option < 1 || option > 5) {
                option = -1;
            }
        }
        // set rows and columns
        int rows = 1, cols = 1;
        switch(option)
        {
            case 1:
                rows = 2;
                cols = 4;
                break;
            case 2:
                rows = 3;
                cols = 2;
                break;
            case 3:
                rows = 3;
                cols = 4;
                break;
            case 4:
                rows = 4;
                cols = 2;
                break;
            case 5:
                rows = 4;
                cols = 4;
                break;
        }
        int size = rows * cols;
        // create game object
        Game game = new Game("Player 1", "Player 2", rows, cols, size);
        // start game
        game.start();
    }
}
