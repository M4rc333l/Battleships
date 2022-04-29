package Game;

public class Player {

    private String name;
    private boolean status;

    public Player(String name, boolean status) {
        this.name = name;
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}