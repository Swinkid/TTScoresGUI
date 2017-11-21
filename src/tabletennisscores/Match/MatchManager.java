package tabletennisscores.Match;

public class MatchManager {
    private static MatchManager ourInstance = new MatchManager();

    public static MatchManager getInstance() {
        return ourInstance;
    }

    private MatchManager() {
    }
}
