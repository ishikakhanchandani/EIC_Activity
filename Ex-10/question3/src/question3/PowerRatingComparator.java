package question3;

import java.util.Comparator;

public class PowerRatingComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPowerRating(), o2.getPowerRating());
		
	}

}