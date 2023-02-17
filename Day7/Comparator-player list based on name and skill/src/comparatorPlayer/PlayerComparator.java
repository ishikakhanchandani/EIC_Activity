package comparatorPlayer;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	    @Override
	    public int compare(Player player1, Player player2) {
	        int skillComparison = player1.getSkill().compareTo(player2.getSkill());
	        if (skillComparison != 0) {
	            return skillComparison;
	        }
	        return player1.getName().compareTo(player2.getName());
	    }
	}

