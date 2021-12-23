// this is the Card class for this memory game, can be changed as desired
// can also include picture for game interfaces
// this class can also be extended during development

import javax.swing.*;

public class Card extends JButton {
    private boolean cardMatched;
    private boolean cardSelected;

    private String back;

    public Card(String back) {
        this.back = back;
        cardMatched = false;
        cardSelected = false;
    }

    public String getBack() {
        return back;
    }

    public void setMatch(boolean matched) {
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
}