import java.util.*;
class Cricket
{
    public static void main(String args[])
    {
      int n,c;
      int[] a;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of elements you want to store: ");
      n=sc.nextInt();
      if(n<0)
      {
        System.out.println("Invalid array size.");
      }
      else
      {
         System.out.println("Enter the elements: ");
         a=new int[n];
         for(int i=0;i<n;i++)
         {
           a[i]=sc.nextInt();
           if(a[i]<0)
           {
            System.out.println("Invalid Input.");
           }
         }
         System.out.println("Enter the score which you want to compare: ");
         c=sc.nextInt();
         if(c<0)
         {
            System.out.println("Invalid score.");
         }   
         else
         {
            for(int j=0;j<n;j++)
            {
             
                if(a[j]>c)
                {
                   System.out.println(a[j]);
                }
            
            } 

          }
       }

    }

}