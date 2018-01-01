package tabletennisscores.Team;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * This is a singleton class that manages Team objects. From here you are able to retrieve teams and their
 * respective properties. Additionally, you can list teams in their list order or by their ranking by won points.
 *
 *
 * @author Alex Noble
 */
public class TeamManager {
    private static TeamManager instance = new TeamManager();
    private ArrayList<Team> registeredTeams = new ArrayList<Team>();

    public static TeamManager getInstance() {
        return instance;
    }

    /**
     * This is an empty constructor to defeat instantiation to allow us to create a singleton.
     */
    private TeamManager() {
    }

    /**
     * This method creates and adds a new team to the TeamManager singleton.
     *
     * @param teamName name of team to be created.
     */
    public void newTeam(String teamName){
        registeredTeams.add(new Team(teamName));
    }

    /**
     * This method retrieves and returns the stored registered teams.
     *
     * @return an arraylist containing registered teams.
     */
    public ArrayList<Team> getRegisteredTeams() {
        return registeredTeams;
    }

    /**
     * This method attempts to find and returns whether the team exists.
     *
     * @param teamName team name of team to be found.
     * @return boolean whether team exists.
     */
    public boolean isTeamRegistered(String teamName){
        boolean exists = false;

        for(Team team : registeredTeams){
            if(team.getTeamName().equals(teamName)){
                exists = true;
            }
        }

        return exists;
    }

    /**
     * This method finds and returns a team object if it exists.
     *
     * @param teamName team name to be found.
     * @return team object.
     */
    public Team getTeam(String teamName){
        for(Team team : registeredTeams){
            if(team.getTeamName().equals(teamName)){
                return team;
            }
        }

        return null;
    }

    /**
     * listTeams
     *
     * Prints the teams to the commandline output.
     */
    public void listTeams(){
        for(Team team : registeredTeams){
            System.out.println(team.toString());
        }
    }

    /**
     * listTeamRanking
     *
     * Outputs the teams in order of point ranking.
     */
    public void listTeamRanking(){
        ArrayList<Team> sortedTeams = new ArrayList<>(registeredTeams);
        sortedTeams.sort(Comparator.comparingInt(Team::getTeamScore).reversed());

        for(Team team : sortedTeams){
            System.out.println(team.toString());
        }
    }


    public boolean isTeamValid(String team, String playerA, String playerB){
        boolean ready = true;

        if(!(this.isTeamRegistered(team))){
            ready = false;
        } else {
            if(this.getTeam(team).findPlayer(playerA).equals(null) && this.getTeam(team).findPlayer(playerB).equals(null)){
                ready = false;
            }
        }

        return ready;
    }
}
