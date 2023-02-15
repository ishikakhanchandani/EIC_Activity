package Activity3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = input.next().split("\\|");
            String teamName = inputArr[0];
            String playerName = inputArr[1];
            Team team = getOrCreateTeam(teams, teamName);
            team.addPlayer(playerName);
        }
        input.close();

        Collections.sort(teams);

        for (Team team : teams) {
            System.out.println(team.getName());
            for (Player player : team.getPlayerList()) {
                System.out.println("--" + player.getName());
            }
        }
    }

    private static Team getOrCreateTeam(List<Team> teams, String teamName) {
        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                return team;
            }
        }

        Team newTeam = new Team(teamName);
        teams.add(newTeam);
        return newTeam;
        
    }
}
