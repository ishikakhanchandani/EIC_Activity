public class TwoWheeler extends Vehicle{
    private boolean kickStartAvailable;

    public TwoWheeler(String make, String vehicleNumber,String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable){
        super(make,vehicleNumber, fuelType, fuelCapacity, cc);
        this.kickStartAvailable =kickStartAvailable;

    }
@Override
public void displayDetailInfo(){
    System.out.println("---Detail Information---");
    System.out.println("Kick Start Available:" + (kickStartAvailable?"YES":"NO"));

}

}