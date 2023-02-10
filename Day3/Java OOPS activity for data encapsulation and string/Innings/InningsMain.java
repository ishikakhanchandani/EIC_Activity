
import java.util.*;

public class InningsMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the team name:");
        String teamname= s.nextLine();
        System.out.println("Enter Session:");
       String inningsname= s.nextLine().toLowerCase();
        if(! inningsname.matches("first|second")) {
                System.out.println("Invalid Session");
                System.exit(0);

         }
        System.out.println("Enter runs:");
        int runs= s.nextInt();

        Innings inning = new Innings(teamname,inningsname,runs);

        inning.displayInningDetails();

       
        
  }

}