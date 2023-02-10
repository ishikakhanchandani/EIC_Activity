
import java.util.*;

public class CompanyMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the company name:");
        String name= s.nextLine();
        System.out.println("Enter the employees:");
        String details= s.nextLine();
        List<String> list = new ArrayList<String>(Arrays.asList(details.split(",")));
        System.out.println("Enter TeamLead:");
        String teamlead = s.nextLine();
        if(list.contains(teamlead)){
            Company c = new Company(name,details,teamlead);

        c.displayCompanyDetails();
        }
        else{
            System.out.println("Invalid Input");
        }

        
             
        
  }

}