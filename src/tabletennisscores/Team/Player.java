package tabletennisscores.Team;

public class Player {

    private String playerName;
    private int setsWon = 0;

    public Player(String name) {
        this.playerName = name;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public int getSetsWon() {
        return setsWon;
    }

    public void setSetsWon(int setsWon) {
        this.setsWon = setsWon;
    }
}

