package exception1package;
import java.io.*;

public class Main 
{
	public static void main(String[] args) 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the total runs scored:");
			int runs = Integer.parseInt(reader.readLine().trim());
			System.out.println("Enter the total overs faced:");
			int overs = Integer.parseInt(reader.readLine().trim());
			int runRate = (int) runs/overs;
			System.out.println("Current Run Rate:" + runRate);
		}
		catch(IOException | NumberFormatException | ArithmeticException e)
		{
			System.out.println(e.getClass().getName());
		}
	 }

}

	


