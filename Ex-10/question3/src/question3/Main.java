package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		
		System.out.println("Enter a  type to sort: " +" \n1. Sort by number of matches played" + "\n2.Sort by runs scored" + "\n3.Sort by Power Rating");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
				Collections.sort(playerList);
				printPlayerList(playerList);
                break;
		}
		case 2: {
			Collections.sort(playerList, new RunComparator());
			printPlayerList(playerList);
			break;
		}
		case 3: {
			Collections.sort(playerList, new PowerRatingComparator());
			printPlayerList(playerList);
			break;
		}
		default:
			System.out.println("Invalid choice: " + n);
		}
		
		sc.close();
		
	
	}


			private static void printPlayerList(List<Player> playerList) {
		    System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n",
		            "Name", "Date of Birth", "Skill", "Number of Wickets", "Runs", "Wickets", "Nationality", "Power Rating");
		    for (Player player : playerList) {
		        System.out.format("%-15s %-15s %-15s %-20d %-15d %-15d %-15s %.1f\n",
		                player.getName(), player.getDateOfBirth(), player.getSkill(), player.getNumberOfMatches(),
		                player.getRuns(), player.getWickets(), player.getNationality(), player.getPowerRating());
		    }
		
			}

}
