package tabletennisscores.Team;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers = new ArrayList<Player>();
    private int teamScore = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * newPlayer method adds a created player to the team.
     *
     * @param player Instance of player to add to team
     */
    public void newPlayer(Player player){
        teamPlayers.add(player);
    }

    public String getTeamName() {
        return teamName;
    }


    public ArrayList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * Get a player instance from within the team. Can be used to check if player is in team.
     *
     * @param name String of player name
     * @return Player Object of player found in team. Returns null if not found.
     */
    public Player findPlayer(String name){
        for (Player player : teamPlayers){
            if (player.getName().equals(name)){
                return player;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Team {" +
                "teamName='" + teamName + '\'' +
                ", teamScore=" + teamScore +
                '}';
    }
}
