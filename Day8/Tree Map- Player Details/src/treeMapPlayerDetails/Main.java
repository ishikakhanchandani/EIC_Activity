package treeMapPlayerDetails;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of player");
		int numberOfPlayers = sc.nextInt();
		
		TreeMap<String, Player> map = new TreeMap<String, Player>();
		sc.nextLine();
		
		for (int i = 1; i <= numberOfPlayers; i++) {
			System.out.println("Enter the details of the player " + i);
			String capNumber = sc.nextLine();
			String name = sc.nextLine();
			String team = sc.nextLine();
			String skill = sc.nextLine();
			Player player = new Player(name, team, skill);
			map.put(capNumber, player);
			}
		
		
		System.out.println("Player Details");
		map.forEach((k,v) -> {
			Player player = v;
			System.out.println(k + "--" + player.toString());
		});
		sc.close();
		
	}

}