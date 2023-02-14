import java.util.*;


public class MatchMain {
    public static void main(String[] args) {

        // DecimalFormat df = new DecimalFormat("0.00");


        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the match format");
    
        System.out.println("1. ODI");
    
        System.out.println("2. T20");
    
        System.out.println("3. Test");
   
        int choice = sc.nextInt();
        

        if(choice == 1){
            ODIMatch odiMatch = new ODIMatch();
            System.out.println("Enter the Current score");
            odiMatch.setCurrentScore(sc.nextInt());
        System.out.println("Enter the Current over");
        odiMatch.setCurrentOver(sc.nextFloat());
        System.out.println("Enter the Current Target Score");
            odiMatch.setTargetScore(sc.nextInt());


            float reqRunRate = (odiMatch.calculateRunRate());
            int balls = odiMatch.calculateBalls();
            odiMatch.display(reqRunRate, balls);
        }
       else if(choice == 2){
            T20Match t20Match = new T20Match();
            System.out.println("Enter the Current score");
            t20Match.setCurrentScore(sc.nextInt());

        System.out.println("Enter the Current over");
        t20Match.setCurrentOver(sc.nextFloat());
        System.out.println("Enter the Current Target Score");
            t20Match.setTargetScore(sc.nextInt());
            float reqRunrate =t20Match.calculateRunRate();
            int balls = t20Match.calculateBalls();
            t20Match.display(reqRunrate, balls);
        }
        else if(choice == 3){
            TestMatch testMatch = new TestMatch();
            System.out.println("Enter the Current score");
            testMatch.setCurrentScore(sc.nextInt());

            System.out.println("Enter the Current over");
            testMatch.setCurrentOver(sc.nextFloat());
            System.out.println("Enter the Current Target Score");
            testMatch.setTargetScore(sc.nextInt());
            float reqRunRate = testMatch.calculateRunRate();
            int balls = testMatch.calculateBalls();
            testMatch.display(reqRunRate, balls);
        }

    
    
}

}