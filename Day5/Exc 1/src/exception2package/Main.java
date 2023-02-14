package exception2package;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the number of overs:");
			int noOfRuns = Integer.parseInt(reader.readLine().trim());
			System.out.println("Enter the number of runs for each over:");
			int [] arr = new int[noOfRuns];
			for(int i =0; i<noOfRuns;i++) {
				arr[i] = Integer.parseInt(reader.readLine().trim());
			}
			System.out.println("Enter the over number:");
			int over = Integer.parseInt(reader.readLine().trim());
			
			System.out.println("Run scored in this over:" + arr[over-1]);
		}
		catch(IOException | NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getName());
		}
	}

}