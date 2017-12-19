package tabletennisscores.Match;

import java.util.ArrayList;
import java.util.Arrays;

public class Set {

    protected ArrayList<Game> setGames = new ArrayList<Game>();

    public Set(ArrayList<Game> setGames) {
        this.setGames = setGames;
    }

    public Set(Game[] games){
        setGames.addAll(Arrays.asList(games));
    }

    public int[] getScore(){
        int score[] = new int[] {
                0,
                0,
        };

        for(Game game : setGames){
            if(game.getHomeScore() > game.getAwayScore()){
                score[0]++;
            } else {
                score[1]++;
            }
        }

        return score;
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
