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
        return cardMatched;
    }

    public boolean isSelected() {
        return cardSelected;
    }
    public void setColor(Graphics g) {
        switch (temp) {
            case 0 -> g.setColor(new Color(143, 62, 62));
            case 1 -> g.setColor(new Color(227, 212, 108));
            case 2 -> g.setColor(new Color(123, 208, 105));
            case 3 -> g.setColor(new Color(97, 175, 175));
            case 4 -> g.setColor(new Color(238, 96, 22));
            case 5 -> g.setColor(new Color(121, 48, 157));
            case 6 -> g.setColor(new Color(215, 114, 151));
            case 7 -> g.setColor(new Color(255, 0, 0));
        }
    }
}
