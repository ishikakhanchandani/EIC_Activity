package listSetRemove;


import java.util.*;
public class ListMain {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> playerDetails = new ArrayList<String>();
	System.out.println("Enter the player details");
	System.out.println("Enter player name");
	playerDetails.add(sc.nextLine());
	System.out.println("Enter age");
	playerDetails.add(sc.nextLine());
	System.out.println("Enter Country");
	playerDetails.add(sc.nextLine());

	
	System.out.println("Player Details");
	for (String detail : playerDetails) {
	  System.out.println(detail);
	}

	
	System.out.println("Enter Skill");
	String skill = sc.nextLine();

	System.out.println("Enter the position to add the skill");
	int position = sc.nextInt();
	playerDetails.add(position, skill);
	
	System.out.println("Player Details:");
	for (String detail : playerDetails) {
	  System.out.println(detail);
	}
	
	System.out.println("Enter the position of the detail to be removed");
	position = sc.nextInt();
	playerDetails.remove(position);
	
	System.out.println("Player Details:");
	for (String detail : playerDetails) {
		System.out.println(detail);
	}

	
	
	}
	
}