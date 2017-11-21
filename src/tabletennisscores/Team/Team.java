package tabletennisscores.Team;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers = new ArrayList<Player>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     *
     *
     * @param player Instance of player to add
     */
    public void newPlayer(Player player){
        teamPlayers.add(player);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(ArrayList<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
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
}
