package tabletennisscores.Match;

import tabletennisscores.Team.Player;

import java.util.ArrayList;

public class SingleSet extends Set {

    private Player homePlayer;
    private Player awayPlayer;

    public SingleSet(ArrayList<Game> setGames, Player homePlayer, Player awayPlayer) {
        super(setGames);

        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
    }
}
