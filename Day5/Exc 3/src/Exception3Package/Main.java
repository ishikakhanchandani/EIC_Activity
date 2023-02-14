package Exception3Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the player name");
			String name = reader.readLine().trim();
			System.out.println("Enter the player age");
		
			int age = Integer.parseInt(reader.readLine().trim());
			if(age<19) {
				throw new CustomException(" CustomException:InvalidAgeRangeException");
			}
			else {
			System.out.println("Player name:" + name);
			System.out.println("Player age:" + age);
		}
		}
		catch(CustomException | NumberFormatException | IOException  e) {
			System.out.println(e.getMessage());
		}
	}

}