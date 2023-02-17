package WicketDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        HashMap<String, Bowler> players = new HashMap<String, Bowler>();

        String addPlayer;
        do {
            System.out.println("Enter the player name");
            String name = sc.nextLine();
            System.out.println("Enter wickets - separated by \"|\" symbol.");
            String[] wickets = sc.nextLine().split("\\|");

            Bowler bowler = new Bowler(name);
            players.put(name, bowler);
            
            for (String wicket : wickets) {
                Wicket w = new Wicket(wicket, bowler);
                players.put(wicket, bowler);
            }


            System.out.println("Do you want to add another player? (yes/no)");
             addPlayer = sc.nextLine();
            if (addPlayer.equalsIgnoreCase("no")) {
                break;
            }
        } while (addPlayer.equalsIgnoreCase("yes"));

        while(true) {
        	 System.out.println("Enter the player name to search:");
             String name = sc.nextLine();

             Bowler bowler = players.get(name);
             if (bowler == null) {
                 System.out.println("No player found with the name " + name);
             } else {
                 System.out.println("Player Name: " + name);
                 System.out.println("Wickets:");
                 int count = 0;
                 for (Map.Entry<String, Bowler> entry : players.entrySet()) {
                     if (count == 0) { 
                         count++;
                         continue;
                     }
                     if (entry.getValue().equals(bowler)) {
                         System.out.println(entry.getKey());
                     }
                 }
             }
    

        System.out.println("Do you want to search another player? (yes/no)");
        String searchAnother = sc.nextLine();
        if (searchAnother.equalsIgnoreCase("no")) {
            break;
        }
        }
        sc.close();
    
	}
}
		

       