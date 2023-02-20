package question5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		List<Player> playerList = new ArrayList<>();
		while(n!=0) {
			String detail = sc.nextLine();
			Player player = Player.createPlayer(detail);
			playerList.add(player);
			n--;
		}
		
		String maxNationality = Player.highestCount(playerList);
		System.out.println("The nationality with maximum players: "+ maxNationality);
		sc.close();
		
	}

}