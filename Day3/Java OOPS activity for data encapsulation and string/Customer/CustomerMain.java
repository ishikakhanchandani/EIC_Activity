
import java.util.*;

public class CustomerMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the details(name,address,mobile):");
        String details= s.nextLine();
        String[] detail = details.split(",");
        String name = detail[0];
        String address = detail[1];
        String mobile = detail[2];

        Customer c = new Customer(name,address,mobile);

        c.displayCustomerDetails();
             
        
  }

}