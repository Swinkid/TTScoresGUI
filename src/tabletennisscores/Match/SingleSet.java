package tabletennisscores.Match;

import tabletennisscores.Team.Player;

import java.util.ArrayList;

public class SingleSet extends Set {

    public SingleSet(ArrayList<Game> setGames, Player homePlayer, Player awayPlayer) {
        super(setGames);

        super.homePlayer = homePlayer;
        super.awayPlayer = awayPlayer;
    }

    public SingleSet(Game[] setGames, Player homePlayer, Player awayPlayer){
        super(setGames);

        super.homePlayer = homePlayer;
        super.awayPlayer = awayPlayer;
    }
}
