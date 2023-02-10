public class Customer
{

  private String name;
  private String address;
  private String mobile;



  public Customer (String name, String address,String mobile)
  {
    this.name = name;
    this.address = address;
    this.mobile =mobile;
  }

  public void displayCustomerDetails(){
        System.out.println("Name:"+ name);
         System.out.println("Address:"+ address);
         System.out.println("mobile:"+ mobile);


}

}