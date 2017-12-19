package tabletennisscores.Match;

import java.util.ArrayList;

public class Set {

    private ArrayList<Game> setGames = new ArrayList<Game>();

    public Set(ArrayList<Game> setGames) {
        this.setGames = setGames;
    }


    /**
     * True: Home False: Away
     */
    public static boolean calculateWinningTeam(ArrayList<Game> games){

        int homeScore = 0;
        int awayScore = 0;

        for(Game game : games){
            if(game.getHomeScore() > game.getAwayScore()){
                homeScore++;
            } else {
                awayScore++;
            }
        }

        if(homeScore > awayScore){
            return true;
        } else {
            return false;
        }

    }

    public int getHomeScore(){
        int homeScore = 0;

        for(Game game : setGames){
            homeScore += game.getHomeScore();
        }

        return homeScore;
    }

    public int getAwayScore(){
        int awayScore = 0;

        for (Game game : setGames) {
            awayScore += game.getAwayScore();
        }

        return awayScore;
    }
}
