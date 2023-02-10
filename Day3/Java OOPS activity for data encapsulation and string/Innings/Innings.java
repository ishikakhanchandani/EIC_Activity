public class Innings
{

  private String teamname;
  private String inningsname;
  private int runs;


  public Innings (String teamname, String inningsname,int runs)
  {
    this.teamname = teamname;
    this.inningsname = inningsname;
    this.runs =runs;
  }

  
  public void displayInningDetails(){
          System.out.println("Name:"+ teamname);
         System.out.println("Scored:"+ runs);
         if(inningsname.equalsIgnoreCase("first")){
                System.out.println("Need"+ " "+ (runs+1) +" to win");

         }
          else if(inningsname.equalsIgnoreCase("second")){
                System.out.println("Match Ended");

         }

         
    }

    }
