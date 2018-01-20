package tabletennisscores.Match;

import tabletennisscores.Team.Player;

import java.util.ArrayList;

public class SingleSet extends Set {

    /**
     * Constructor for the SingleSet class. Class represents a single set. An implementation of set.
     *
     * @param setGames an array of games
     * @param homePlayer home player instance
     * @param awayPlayer away player instance
     */
    public SingleSet(Game[] setGames, Player homePlayer, Player awayPlayer){
        super(setGames);

        super.homePlayer = homePlayer;
        super.awayPlayer = awayPlayer;
    }
    
    @Override
    public String toString() {
        
        String string = "SetScore { homePlayer=" + homePlayer.getName() + " awayPlayer=" + awayPlayer.getName() + "\n";
        
        for(Game game : setGames){
            
            string += game.toString() + "\n";
            
        }
        
        string += "}";
        
        return string;
    }
}
