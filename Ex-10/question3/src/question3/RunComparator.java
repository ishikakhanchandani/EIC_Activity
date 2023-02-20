package question3;

import java.util.Comparator;

public class RunComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if(o1.getRuns()==o2.getRuns())
		return 0;
		else if(o1.getRuns()>o2.getRuns())
			return 1;
		else {
			return -1;
		}
	}

}