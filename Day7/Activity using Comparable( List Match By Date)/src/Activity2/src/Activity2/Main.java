package Activity2;

import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of matches");
		int n = sc.nextInt();
		List<Match> matches = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			   System.out.println("Enter match date in (yyyy-MM-dd)");
	            String matchDateString = sc.next();
	            System.out.println("Enter Team 1");
	            String teamOne = sc.next();
	            System.out.println("Enter Team 2");
	            String teamTwo = sc.next();

	            LocalDate matchDate = LocalDate.parse(matchDateString);
	            Match match = new Match(matchDate, teamOne, teamTwo);
	            matches.add(match);
	}
		
		Collections.sort(matches);

        System.out.println("Match Details");
        for (Match match : matches) {
            System.out.println(match);
        }
        sc.close();

}
}