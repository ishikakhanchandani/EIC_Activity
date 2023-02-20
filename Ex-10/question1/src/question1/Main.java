package question1;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Team: ");
		String teamName = sc.nextLine();
		Team team = new Team(teamName);
		
		int n;
		do {
			System.out.println("1.Add Player\n2.Delete Player\n3.Display Players\n4.Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
            sc.nextLine();
            
            switch (n) {
			case 1: {
				
				System.out.println("Enter the details of the player in CSV format: ");
				String details = sc.nextLine();
				Player player = Player.createPlayer(details);
				team.addPlayerToTeam(player);
				System.out.println("Player Successfully added");
				break;
				
			}
			case 2: {
				
				System.out.println("Enter the name of the player to be deleted: ");
				String name = sc.nextLine();
				boolean isRemoved = team.removePlayerFromTeam(name);
				if(isRemoved) {
					System.out.println("Player Successfully deleted");
				}
				
				else {
                    System.out.println("Player not found in the team");
                }
                break;
				
			}
			
			case 3: team.displayPlayers();
			break;
			case 4:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
            
            
		}while(n!=4);
		sc.close();
	}

}