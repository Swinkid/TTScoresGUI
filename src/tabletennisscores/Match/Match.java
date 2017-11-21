package tabletennisscores.Match;

import tabletennisscores.Team.Team;

public class Match {

    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }


}
