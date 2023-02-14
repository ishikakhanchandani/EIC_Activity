import java.util.*;

public class VehicleMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Vehicle Make:");
        String make = s.nextLine();
        System.out.println("1.Four Wheeler");
        System.out.println("2.Two Wheeler");
        System.out.println("Enter the Vehicle Type:");
        int vehicleType= s.nextInt();
        
        if(vehicleType== 1) {
               
                System.out.println("Vehicle Number:");
                String vehicleNumber = s.nextLine();
                System.out.println("Fuel Type:");
                System.out.println("1.Petrol");
                System.out.println("2.Disel:");
                String fuelType = s.nextLine();
                System.out.println("Fuel Capacity:");
                int fuelCapacity = s.nextInt();
                System.out.println("Engine CC:");
                int cc = s.nextInt();
                s.nextLine();
                System.out.println("Audio System:");
                String audioSystem = s.nextLine();
                System.out.println("Number of Doors:");
                int numberOfDoors = s.nextInt();
            
                FourWheeler fourWheeler = new FourWheeler(make,vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
                fourWheeler.displayMake();
                fourWheeler.displayBasicInfo();
                fourWheeler.displayDetailInfo();

        }
         else if(vehicleType==2){
              
                System.out.println("Vehicle Number:");
                String vehicleNumber = s.nextLine();
                System.out.println("Fuel Type:");
                System.out.println("1.Petrol");
                System.out.println("2.Disel:");
                String fuelType = s.nextLine();
                System.out.println("Fuel Capacity:");
                int fuelCapacity = s.nextInt();
                System.out.println("Engine CC:");
                int cc = s.nextInt();
                  s.nextLine();
                System.out.println("Kick Start Available :");
                String KickStartAvailable = s.nextLine().toLowerCase();
                if(! KickStartAvailable.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
         }              
                Boolean kickStartAvailable = KickStartAvailable.equalsIgnoreCase("yes");
                TwoWheeler twoWheeler = new TwoWheeler(make,vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
                twoWheeler.displayMake();
                twoWheeler.displayBasicInfo();
                twoWheeler.displayDetailInfo();
              
         }
         }       

}