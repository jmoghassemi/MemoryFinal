import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class functions {
    public static Color[] cardShuffle(){
        List<Color> cardColorList = Arrays.asList(Color.RED,Color.green,Color.BLUE,Color.ORANGE,Color.CYAN,Color.MAGENTA,Color.PINK,Color.YELLOW
                ,Color.RED,Color.green,Color.BLUE,Color.ORANGE,Color.CYAN,Color.MAGENTA,Color.PINK,Color.YELLOW);
        Collections.shuffle(cardColorList);

        Color[] ccl = new Color[cardColorList.size()];
        ccl = cardColorList.toArray(ccl);

        return ccl;
    }
}
