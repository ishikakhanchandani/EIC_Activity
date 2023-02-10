public class Company
{

  private String name;
  private String employees;
  private String teamlead;



  public Company (String name, String employees,String teamlead)
  {
    this.name = name;
    this.employees = employees;
    this.teamlead = teamlead;
  }

  public void displayCompanyDetails(){
        System.out.println("Name:"+ name);
         System.out.println("Emplopyees:"+ employees);
         System.out.println("Lead:"+ teamlead);


}

}