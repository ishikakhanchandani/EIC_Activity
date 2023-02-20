package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Players: ");
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();

        List<Player> playerList = new ArrayList<>();
		while(numberOfPlayers!=0) {

				String details = sc.nextLine();
				Player player = Player.createPlayer(details);
				playerList.add(player);
				numberOfPlayers--;
			}
		Map<String, Integer> playerMap = Player.calculateNationalityCount(playerList);
	
		System.out.format("%-15s %s\n","Country","Count");
		     playerMap.forEach((k,v) ->{
		    	 System.out.format("%-15s %d\n", k,v);
		    });
		     sc.close();
	}
		
}			
