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

    /**
     * True: home false: away
     * @return
     */
    public static boolean calcMatch(ArrayList<Set> sets){
        int homeScore = 0;
        int awayScore = 0;

        for(Set set : sets){
            if(set.getHomeScore() > set.getAwayScore()){
                homeScore++;
            } else {
                awayScore++;
            }
        }

        if(homeScore > awayScore) {
            return true;
        } else {
            return false;
        }
    }

    public void addSet(Set set){
        matchSets.add(set);
    }

    public ArrayList getSets(){
        return matchSets;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}
