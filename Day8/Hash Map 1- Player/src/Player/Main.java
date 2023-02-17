package Player;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        HashMap<String, Player> playerMap = new HashMap<>();

        String addPlayer;
        do {
            System.out.println("Enter the player name");
            String playerName = sc.nextLine();
            System.out.println("Enter wickets - separated by \"|\" symbol.");
            String[] wickets = sc.nextLine().split("\\|");

            Player player = new Player(playerName, wickets.length);
            playerMap.put(playerName, player);

            System.out.println("Do you want to add another player (yes/no)");
            addPlayer = sc.nextLine();
        } while (addPlayer.equalsIgnoreCase("yes"));

        String searchPlayer;
        do {
            System.out.println("Enter the player name to search");
            searchPlayer = sc.nextLine();

            if (playerMap.containsKey(searchPlayer)) {
                Player player = playerMap.get(searchPlayer);
                System.out.println("Player name : " + player.getBowlerName());
                System.out.println("Wicket Count : " + player.getWicketCount());
            } else {
                System.out.println("No player found with the name " + searchPlayer);
            }

            System.out.println("Do you want to search another player (yes/no)");
            searchPlayer = sc.nextLine();
        } while (searchPlayer.equalsIgnoreCase("yes"));
        sc.close();
    }
		
	}

