

/**
 *
 * @author Phillip Munyororo
 */
public class Player {
    boolean inactive;
    int points;
    String name;
    
    public Player(boolean inactive, int points, String name) {
        this.inactive = inactive;
        this.points = points;
        this.name = name;
    }
    
    void incrementScore()
    {
        points = points + 1;
    }
    
    void resetScore()
    {
        points = 0;
    }
    
    int getScore()
    {
        return points;
    }
}
