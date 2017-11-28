package tabletennisscores.Match;

import tabletennisscores.Team.Player;

import java.util.ArrayList;

public class DoubleSet extends Set {

    ArrayList<Player> homePlayers;
    ArrayList<Player> awayPlayers;

    public DoubleSet(ArrayList<Game> setGames, ArrayList<Player> homePlayers, ArrayList<Player> awayPlayers) {
        super(setGames);
        this.homePlayers = homePlayers;
        this.awayPlayers = awayPlayers;
    }

}
