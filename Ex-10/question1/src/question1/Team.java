package question1;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	private List<Player>playerList;
	
	
	public Team() {}
	
	
	
	public Team(String name) {
		super();
		this.name = name;
		this.playerList = new ArrayList<>();
	}



	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	
	
	public void addPlayerToTeam(Player player) {
		this.playerList.add(player);
	}
	
	
	public Boolean removePlayerFromTeam(String name) {
		for(Player player: playerList) {
			if(player.getName().equals(name)) {
				playerList.remove(player);
				return true;
			}
		}
		return false;
	}
		
	public void displayPlayers() {
		if(playerList.isEmpty()) {
			System.out.println("No players to show");
			
		}
		else {
			System.out.printf("Player in %s\n",name);
			 System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill", "No of matches", "Runs", "Wickets", "Nationality", "Rating");
	            for (Player player : playerList) {
	                System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%.1f\n", player.getName(),
	                        player.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), player.getSkill(),
	                        player.getNumberOfMatches(), player.getRuns(), player.getWickets(), player.getNationality(),
	                        player.getPowerRating());
	            }
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
}