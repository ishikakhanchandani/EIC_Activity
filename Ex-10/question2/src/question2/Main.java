package question2;

import java.time.LocalDate;
import java.util.ArrayList;
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
		
		System.out.println("Enter a search type: " +" \n1.By Nationality" + "\n2.By Date of Birth" + "\n3.By Power Rating");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				 System.out.print("Enter the Nationality: ");
	                String nationality = sc.next();
	                List<Player> playersByNationality = PlayerBO.findPlayer(playerList, nationality);
	                printPlayerList(playersByNationality);
	                break;
			}
			case 2: {
				System.out.print("Enter the Date of Birth: ");
				LocalDate dateOfBirth = LocalDate.parse(sc.next());
				List<Player> playersByDateOfBirth = PlayerBO.findPlayer(playerList, dateOfBirth);
				printPlayerList(playersByDateOfBirth);
				break;
			}
			case 3: {
				System.out.print("Enter the Power Rating: ");
				Double powerRating = sc.nextDouble();
				List<Player> playersByPowerRating = PlayerBO.findPlayer(playerList, powerRating);
				printPlayerList(playersByPowerRating);
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
