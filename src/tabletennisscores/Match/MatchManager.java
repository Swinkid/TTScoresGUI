package tabletennisscores.Match;

import tabletennisscores.Team.Team;

import java.util.ArrayList;

public class MatchManager {
    private static MatchManager ourInstance = new MatchManager();

    private ArrayList<Match> matches = new ArrayList<Match>();

    public static MatchManager getInstance() {
        return ourInstance;
    }

    public static Match getMatch(Team homeTeam, Team awayTeam){
        return null;
    }

    public void addMatch(Match match){
        matches.add(match);
    }

    private MatchManager() {
    }
}
