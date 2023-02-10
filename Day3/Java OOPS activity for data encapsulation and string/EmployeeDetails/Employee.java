public class Employee
{
    private String name;
    private String address;
    private String mobile;
     public Employee(String name,String address,String mobile)
     {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
     }
    public void getDetails()
    {
        System.out.println("Employee details: ");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Mobile: "+mobile);
    }
    
}




