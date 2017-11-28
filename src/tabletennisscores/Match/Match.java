package tabletennisscores.Match;

import tabletennisscores.Team.Team;

import java.util.ArrayList;

public class Match {

    private Team homeTeam;
    private Team awayTeam;

    private ArrayList<Set> matchSets = new ArrayList<Set>();

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }


}
