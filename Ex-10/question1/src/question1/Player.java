package question1;

import java.time.LocalDate;

public class Player {

	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private Double powerRating;
	
	
	public Player() {}
	public Player(String name, LocalDate dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, Double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}
	
	
	public static Player createPlayer(String detail) {
		String [] parts = detail.split(",");
		
		return new Player(
				parts[0],
				LocalDate.parse(parts[1]),
				parts[2],
				Integer.parseInt(parts[3]),
				Integer.parseInt(parts[4]),
				Integer.parseInt(parts[5]),
				parts[6],
				Double.parseDouble(parts[7])
				);
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10.1f", name, dateOfBirth, skill, numberOfMatches, runs, wickets, nationality, powerRating);
	}
	
	
	
}