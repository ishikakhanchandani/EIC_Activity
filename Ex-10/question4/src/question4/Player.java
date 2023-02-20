package question4;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Player  {

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
	
	
public static Map<String, Integer> calculateNationalityCount( List<Player> playerList){
	 TreeMap<String ,Integer> playerByNationalityCount  = new TreeMap<>();
	 for(Player player :playerList) {
		 String nationality = player.getNationality();
		 if(playerByNationalityCount.containsKey(nationality)) {
			 playerByNationalityCount.put(nationality,playerByNationalityCount.get(nationality)+1);
		 }
		 else {
			 playerByNationalityCount.put(nationality,1);
		 }
	 }
	 return playerByNationalityCount;

}
}


