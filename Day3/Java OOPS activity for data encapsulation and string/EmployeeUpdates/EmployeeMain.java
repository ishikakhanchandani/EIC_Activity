
import java.util.*;




public class EmployeeMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter the name:");
        emp.setName(s.nextLine());
        System.out.println("Enter Address:");
        emp.setAddress(s.nextLine());
        System.out.println("Enter Mobile:");
        emp.setMobile(s.nextLine());

         System.out.println("Employee Details");
         System.out.println("Name:"+ emp.getName());
         System.out.println("Address:"+ emp.getAddress());
         System.out.println("Mobile:"+ emp.getMobile());
        System.out.println("Verify and Update the details:");


         int n =0;
         while (n!=4) {
                System.out.println("Menu");
                System.out.println("1. Update Employee name");
                System.out.println("2. Update Employee Address");
                System.out.println("3. Update Employee mobile");
                System.out.println("4. All information correct/Exit");
                n = s.nextInt();
                s.nextLine();

                switch(n){

                case 1: 
                        System.out.println("Current name is:");
                        emp.getName();
                        System.out.println("Enter the name:" );
                        emp.setName(s.nextLine());
                        break;

                case 2: 
                        System.out.println("Current address is:" + emp.getAddress());
                        System.out.println("Enter the address:");
                        emp.setAddress(s.nextLine());
                        
                        break;
                case 3: 
                        System.out.println("Current mobile is:" + emp.getMobile());
                        System.out.println("Enter the mobile:" );
                        emp.setMobile(s.nextLine());
                        break;
                        


                case 4: 
                        System.out.println("The details are:");
                        System.out.println("Name:"+ emp.getName());
                        System.out.println("Address:"+ emp.getAddress());
                        System.out.println("Mobile:"+ emp.getMobile());
                        break;

                default :
                        System.out.println("Invalid Input");
                        break;
         }
     }
  }

}