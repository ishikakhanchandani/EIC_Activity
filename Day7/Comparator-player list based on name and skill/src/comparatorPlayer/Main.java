package comparatorPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the number of players to be registered");
		int numPlayers = sc.nextInt();
		sc.nextLine();
		 ArrayList<Player> playerList = new ArrayList<Player>();
	        for (int i = 0; i < numPlayers; i++) {
	            System.out.println("Please enter player name");
	            String playerName = sc.nextLine();
	            System.out.println("Please select the skill of the player");
	            System.out.println("1.All Rounder\n2.Batsman\n3.Bowler");
	            int playerSkill = sc.nextInt();
	            sc.nextLine();
	            String skill;
	            switch (playerSkill) {
	                case 1:
	                    skill = "All Rounder";
	                    break;
	                case 2:
	                    skill = "Batsman";
	                    break;
	                case 3:
	                    skill = "Bowler";
	                    break;
	                default:
	                    System.out.println("Invalid input. Defaulting to Batsman.");
	                    skill = "Batsman";
	                    break;
	            }
	            playerList.add(new Player(playerName, skill));
	        }

	        Collections.sort(playerList, new PlayerComparator());

	        System.out.println("Player Details");
	        for (Player player : playerList) {
	            System.out.println("Player : " + player.getName() + " Skill : " + player.getSkill());
	        }
	        sc.close();
		
	}
}