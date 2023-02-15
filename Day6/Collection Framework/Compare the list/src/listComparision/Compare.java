package listComparision;

import java.util.ArrayList;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> IPL14Details = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		IPL14Details.add(sc.nextLine());
		IPL14Details.add(sc.nextLine());
		IPL14Details.add(sc.nextLine());
		IPL14Details.add(sc.nextLine());
		IPL14Details.add(sc.nextLine());
		
		ArrayList<String> IPL15Details = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 15");
		IPL15Details.add(sc.nextLine());
		IPL15Details.add(sc.nextLine());
		IPL15Details.add(sc.nextLine());
		IPL15Details.add(sc.nextLine());
		IPL15Details.add(sc.nextLine());
		
		
		IPL14Details.retainAll(IPL15Details);
		System.out.println("Consistent Scorer:");
		for (String detail : IPL14Details) {
		  System.out.println(detail);
		  
		  sc.close();
		}

	}

}