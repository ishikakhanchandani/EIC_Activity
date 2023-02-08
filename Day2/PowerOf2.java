import java.util.*;
class PowerOf2
{
    public static void main(String args[])
    {
        int n;
        double rem;
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n<0)
        {
            System.out.println("number too small.");
        }
        else if (n>32767)
        {
            System.out.println("number too large");
        }
        else if (n%2==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
            

        
    }
}