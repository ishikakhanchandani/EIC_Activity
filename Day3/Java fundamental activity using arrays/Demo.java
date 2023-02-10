import java.util.*;
class Demo
{
  public static void main(String args[])
  {  
    int n;
    int[] a;
    int sum1=0,sum2=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the total number of elements: ");
    n=sc.nextInt();
    if(n<0)
    {
      System.out.println("Invalid array size.");
    }
    else 
    {
    a=new int[n];
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      if(a[j]<0)
      {
        System.out.println("Invalid Input");
      }

      else if(a[j]%2==0)
      {
        sum1=sum1+a[j];
      }
      else
      {
        sum2=sum2+a[j];
      }
    }
    if(sum1>sum2)
    {
      System.out.println(sum1);
    }
    else
    {
      System.out.println(sum2);
    }
    }
    

  }
}