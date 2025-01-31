package tabletennisscores.Match;

import tabletennisscores.Team.Player;
import tabletennisscores.Team.Team;

import java.util.ArrayList;

public class MatchManager {
    private static MatchManager ourInstance = new MatchManager();

    private ArrayList<Match> matches = new ArrayList<Match>();

    public static MatchManager getInstance() {
        return ourInstance;
    }

    public Match getMatch(Team homeTeam, Team awayTeam){

        for (Match match : matches){
            if(match.getHomeTeam().getTeamName().equals(homeTeam.getTeamName()) && match.getAwayTeam().getTeamName().equals(awayTeam.getTeamName())){
                return match;
            }
        }

        return null;
    }
    
    public ArrayList<Match> getMatches(){
        return this.matches;
    }

    public void addMatch(Match match){
        Team homeTeam = match.getHomeTeam();
        Team awayTeam = match.getAwayTeam();

        homeTeam.setTeamScore(homeTeam.getTeamScore() + match.getHomeScore());
        awayTeam.setTeamScore(awayTeam.getTeamScore() + match.getAwayScore());

        ArrayList<Set> sets = match.getSets();

        matches.add(match);
    }
    public void getMatchScore(Team homeTeam, Team awayTeam) {
        this.getMatch(homeTeam, awayTeam).toString();
    }

    private MatchManager() {
    }
}
