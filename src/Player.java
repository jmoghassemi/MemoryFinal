public class Player {
    private boolean active;
    private int point;
    private String name;

    public Player(boolean active, int point, String name) {
        this.active = active;
        this.point = point;
        this.name = name;
    }

    public boolean getActivate(){
        return this.active;
    }

    public void setActive(boolean status){
        this.active = status;
    }

    public int getPoint(){
        return this.point;
    }

    public void setPoint(int pt){
        this.point= this.point+pt;
    }

    public String getName(){
        return this.name;
    }
}
