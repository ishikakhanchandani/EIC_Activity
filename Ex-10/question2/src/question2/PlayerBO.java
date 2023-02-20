package question2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlayerBO {

	
	public static  List<Player> findPlayer(List<Player> playerList, String nationality){
		List<Player> playersByNationality = new ArrayList<>();
		for(Player player:playerList) {
			if(player.getNationality().equalsIgnoreCase(nationality)) {
				playersByNationality.add(player);
			}
		}
		return playersByNationality;
	}
	
	public static List<Player> findPlayer(List<Player> playerList,LocalDate dateOfBirth){
		List<Player> playersByDateOfBirth = new ArrayList<>();
		for(Player player: playerList) {
			if(player.getDateOfBirth().equals(dateOfBirth)) {
				playersByDateOfBirth.add(player);
			}
		}
		return playersByDateOfBirth;
	}


public static List<Player> findPlayer(List<Player> playerList,Double powerRating){
	List<Player> playersByPowerRating = new ArrayList<>();
	for(Player player: playerList) {
		if(player.getPowerRating().equals(powerRating)) {
			playersByPowerRating.add(player);
		}
	}
	return playersByPowerRating;
	
}






}