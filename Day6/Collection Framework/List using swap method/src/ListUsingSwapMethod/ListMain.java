package ListUsingSwapMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> teamDetails = new ArrayList<String>();
		System.out.println("Enter the team names");
		teamDetails.add(sc.nextLine());
		teamDetails.add(sc.nextLine());
		teamDetails.add(sc.nextLine());
		teamDetails.add(sc.nextLine());
		teamDetails.add(sc.nextLine());
		
		int first, second;
		
		System.out.println("Enter the swap positions");
		first = sc.nextInt();
		second = sc.nextInt();
		
			
		Collections.swap(teamDetails,first,second);

		for (String detail : teamDetails) {
		  System.out.println(detail);
		}
	}

}