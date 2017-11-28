package tabletennisscores.Match;

import java.util.ArrayList;

public class Set {

    private ArrayList<Game> setGames = new ArrayList<Game>();

    public Set(ArrayList<Game> setGames) {
        this.setGames = setGames;
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
