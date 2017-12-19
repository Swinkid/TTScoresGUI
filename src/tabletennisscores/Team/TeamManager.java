package tabletennisscores.Team;

import java.util.ArrayList;

public class TeamManager {
    private static TeamManager ourInstance = new TeamManager();
    private ArrayList<Team> registeredTeams = new ArrayList<Team>();

    public static TeamManager getInstance() {
        return ourInstance;
    }

    private TeamManager() {
    }

    public void newTeam(String teamName){
        registeredTeams.add(new Team(teamName));
    }

    public void removeTeam(Team team){
        registeredTeams.remove(team);
    }

    public ArrayList<Team> getRegisteredTeams() {
        return registeredTeams;
    }

    public Team getTeam(String teamName){
        for(Team team : registeredTeams){
            if(team.getTeamName().equals(teamName)){
                return team;
            }
        }

        return null;
    }

}
