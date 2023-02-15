package Activity1;

import java.util.*;

public class setactivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		TreeSet<String> treeSet = new TreeSet<String>();
        System.out.println("Enter the number of matches");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the players' name who won man of the match: ");
        for(int i=0; i<n;i++) {
        	 String player = sc.nextLine();
        	treeSet.add(player);
        }
        System.out.println("Distinct players who won Player of the Match:");
        for (String player : treeSet) {
            System.out.println(player);
        }
        sc.close();

		
	}

}