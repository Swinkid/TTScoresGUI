package tabletennisscores.Match;

import tabletennisscores.Team.Team;

import java.util.ArrayList;

public class Match {

    private Team homeTeam;
    private Team awayTeam;

    private int homeScore;
    private int awayScore;

    private ArrayList<Set> matchSets = new ArrayList<Set>();

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int[] getScore(int[] matchNumbers){
        int score[] = new int[]{
                0,
                0
        };

        for(int i = 0; i < matchNumbers.length; i++){

            int[] setScore = matchSets.get(matchNumbers[i]).getScore();

            if(setScore[0] > setScore[1]){

                score[0]++;

            } else {

                score[1]++;

            }

        }

        return score;
    }

    public int[] getScore(int matchNumber){
        return matchSets.get(matchNumber).getScore();
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

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
}
