package treeMapPlayerDetails;

public class Player {
	
	private String name;
	private String team; 
	private String skill;
	public Player(String name, String team, String skill) {
		this.name = name;
		this.team = team;
		this.skill = skill;
	}
	
	public String toString() {
		return name + "--" + team + "--" + skill;
	}
	
}