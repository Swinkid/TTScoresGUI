package tabletennisscores.Match;

import java.util.ArrayList;

public class MatchManager {
    private static MatchManager ourInstance = new MatchManager();

    private ArrayList<Match> matches = new ArrayList<Match>();

    public static MatchManager getInstance() {
        return ourInstance;
    }

    private MatchManager() {
    }
}
