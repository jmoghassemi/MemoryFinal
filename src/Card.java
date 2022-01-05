// this is the Card class for this memory game, can be changed as desired
// it's should have a method to save and show the images on every row
import javax.swing.*;
import java.awt.*;

public class Card extends JButton {
    private boolean cardMatched;
    private boolean cardSelected;

    private String back;
    private int temp;

    public Card(String back) {
        this.back = back;
        cardMatched = false;
        cardSelected = false;
    }

    public String getBack() {
        return back;
    }

    public void setCardMatched(boolean matched) {
        cardMatched = matched;
    }

    public void setCardSelected(boolean selected) {
        cardSelected = selected;
    }

    public boolean isMatched() {
        if (cardMatched == true){
            return true;
        }else {
            return false;
        }
    }

    public boolean isSelected() {
        if (cardSelected == true){
            return true;
        }else {
            return false;
        }
    }
    public void setColor(Graphics g) {
        switch (temp) {
            case 0: g.setColor(Color.RED);
            break;
            case 1: g.setColor(Color.GREEN);
            break;
            case 2: g.setColor(Color.BLUE);
            break;
            case 3: g.setColor(Color.ORANGE);
            break;
            case 4: g.setColor(Color.CYAN);
            break;
            case 5: g.setColor(Color.MAGENTA);
            break;
            case 6: g.setColor(Color.PINK);
            break;
            case 7: g.setColor(Color.YELLOW);
            break;
        }
    }
}
