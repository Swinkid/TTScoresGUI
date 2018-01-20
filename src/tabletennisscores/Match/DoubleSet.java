package tabletennisscores.Match;

import tabletennisscores.Team.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class DoubleSet extends Set {

    private ArrayList<Player> homePlayers = new ArrayList<>();
    private ArrayList<Player> awayPlayers = new ArrayList<>();

    public DoubleSet(ArrayList<Game> setGames, ArrayList<Player> homePlayers, ArrayList<Player> awayPlayers) {
        super(setGames);

        this.homePlayers = homePlayers;
        this.awayPlayers = awayPlayers;
    }

    public DoubleSet(Game[] setGames, Player[] homePlayers, Player[] awayPlayers){
        super(setGames);

        this.homePlayers.addAll(Arrays.asList(homePlayers));
        this.awayPlayers.addAll(Arrays.asList(awayPlayers));
    }

    public int[] getScore(){
        int score[] = new int[] {
                0,
                0,
        };

        if(getHomeScore() > getAwayScore()){
            score[0] = 1;
        } else {
            score[1] = 1;
        }

        return score;
    }

        @Override
    public String toString() {
        
        String string = "SetScore { ";
        
        string += "homePlayers=";
        for(Player player : homePlayers){
            string += player.getName() + ",";
        }
        
        string += " awayPlayers=";
        for(Player player : awayPlayers){
            string += player.getName() + ",";
        }
        
        string += "\n";
        for(Game game : setGames){
            
            string += game.toString() + "\n";
            
        }
        
        string += "}";
        
        return string;
    }
    
}
