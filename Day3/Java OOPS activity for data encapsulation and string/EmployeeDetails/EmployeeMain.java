import java.util.*;
public class EmployeeMain
{
    public static void main(String args[])
    {
        String name, address, mobile;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=sc.nextLine();
        System.out.println("Enter the address: ");
        address=sc.nextLine();
        System.out.println("Enter the mobile: ");
        mobile=sc.nextLine();
        Employee emp = new Employee(name,address,mobile);
        emp.getDetails();

    }

}