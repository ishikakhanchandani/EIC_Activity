import java.util.*;
class SalaryCalculation
{
    public static void main(String args[])
    {
        int salary;
        int shifts;
        double shift;
        double food;
        double travel;
        double savings;
        System.out.println("Enter your salary: ");
        Scanner sc = new Scanner(System.in);
        salary = sc.nextInt();
        System.out.println("Enter your extra shifts: ");
        shifts = sc.nextInt();

        if(salary>8000)
        {
            System.out.println("Salary too large.");
        }
        else if(shifts<0)
        {
            System.out.println("Shift too small");
        }
        else if(salary<0)
        {
            System.out.println("Salary too small");
        }
        else
        {
            food = 0.2 * salary;
            travel = 0.3 * salary;
            shift = 0.02 * salary * shifts;
            savings = salary + shift - (food+travel);
            System.out.println("Your saving: "+savings);
        }

    }
}
