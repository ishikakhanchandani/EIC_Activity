import java.util.*;
class SumOfOddDigits
{
    public static void main(String args[])
    {
        int number,n;
        double rem;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        n=number;
        while(n!=0)
        {
           rem = n%10;
           if(rem%2!=0)
           {
             sum=sum+rem;
           } 
           n=n/10;
        }
        if(number<0||number>32767)
        {
            System.out.println("Invalid input");
        } 
        else
        {
            System.out.println(sum);
        }

    }

}