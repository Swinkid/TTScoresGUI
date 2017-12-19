package tabletennisscores.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public boolean isTeamRegistered(String teamName){
        boolean exists = false;

        for(Team team : registeredTeams){
            if(team.getTeamName().equals(teamName)){
                exists = true;
            }
        }

        return exists;
    }

    public Team getTeam(String teamName){
        for(Team team : registeredTeams){
            if(team.getTeamName().equals(teamName)){
                return team;
            }
        }

        return null;
    }

    public void listTeams(){
        for(Team team : registeredTeams){
            System.out.println(team.toString());
        }
    }

    public void listTeamRanking(){
        ArrayList<Team> sortedTeams = new ArrayList<>(registeredTeams);
        sortedTeams.sort(Comparator.comparingInt(Team::getTeamScore).reversed());

        for(Team team : sortedTeams){
            System.out.println(team.toString());
        }
    }

}
