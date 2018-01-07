package tabletennisscores.Match;

import tabletennisscores.Team.Player;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Set {

    protected ArrayList<Game> setGames = new ArrayList<Game>();
    protected Player homePlayer;
    protected Player awayPlayer;

    public Set(ArrayList<Game> setGames) {
        this.setGames = setGames;
    }

    public Set(Game[] games){
        setGames.addAll(Arrays.asList(games));
    }

    /**
     * Gets the score of the current set.
     * @return Array of score. (Home [0], Away [1])
     */
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

    public ArrayList<Game> getGames(){
        return this.setGames;
    }
}
