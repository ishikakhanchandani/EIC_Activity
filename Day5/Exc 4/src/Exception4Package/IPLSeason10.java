package Exception4Package;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPLSeason10 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String winnerTeam, runnerTeam;
		try {
			System.out.println("Enter the expected winner team of IPL Season 10");
			winnerTeam = reader.readLine();
		
			if (!(winnerTeam.equals("Chennai Super Kings") || winnerTeam.equals("Sun Risers")
					|| winnerTeam.equals("Delhi Daredevils") || winnerTeam.equals("Kings XI Punjab")
					|| winnerTeam.equals("Kolkata Knight Riders") || winnerTeam.equals("Mumbai Indians")
					|| winnerTeam.equals("Rajasthan Royals") || winnerTeam.equals("Royal Challengers Bangalore"))) 
			{	
				throw new TeamNameNotFoundException("TeamNameNotFoundException:Entered team is not a part of IPL Season 10");
			}
			
			System.out.println("Enter the expected runner Team of IPL Season 10");
			runnerTeam = reader.readLine();
			 if (!(runnerTeam.equals("Chennai Super Kings") || runnerTeam.equals("Sun Risers")
					|| runnerTeam.equals("Delhi Daredevils") || runnerTeam.equals("Kings XI Punjab")
					|| runnerTeam.equals("Kolkata Knight Riders") || runnerTeam.equals("Mumbai Indians")
					|| runnerTeam.equals("Rajasthan Royals") || runnerTeam.equals("Royal Challengers Bangalore"))) {
				throw new TeamNameNotFoundException("TeamNameNotFoundException:Entered team is not a part of IPL Season 10");
			}
			System.out.println("Expected IPL Season 10 winner: " + winnerTeam);
			System.out.println("Expected IPL Season 10 runner: " + runnerTeam);
		
		} catch (IOException | TeamNameNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}