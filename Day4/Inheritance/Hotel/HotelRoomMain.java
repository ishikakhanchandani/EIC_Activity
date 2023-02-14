import java.util.*;

public class HotelRoomMain{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Hotel Tariff Calculator");
        System.out.println("1.Deluxe Room");
        System.out.println("2.Deluxe AC Room");
        System.out.println("2.Suite AC Room");
        System.out.println("Select Room Type:");
        int roomType= s.nextInt();
        s.nextLine();
        
        if(roomType== 1) {
               
                System.out.println("Hotel Name:");
                String hotelName = s.nextLine();
                System.out.println("Room Square Feet Area:");
                int numberOfSqFeet = s.nextInt();
                s.nextLine();
                System.out.println("Room has TV (yes/no):");
                String HasTV = s.nextLine().toLowerCase();
                if(! HasTV.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
         }              
                Boolean hasTV = HasTV.equalsIgnoreCase("yes");

                System.out.println("Room has Wifi (yes/no):");
                String HasWifi = s.nextLine().toLowerCase();
                if(! HasWifi.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
         }              
                Boolean hasWifi = HasWifi.equalsIgnoreCase("yes");

                System.out.println("Room Tarrif per day is:");

                DeluxeRoom deluxeRoom = new DeluxeRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
                 System.out.println(deluxeRoom.calculateTariff());             

        }
         else if(roomType== 2) {
               
                System.out.println("Hotel Name:");
                String hotelName = s.nextLine();
                System.out.println("Room Square Feet Area:");
                int numberOfSqFeet = s.nextInt();
                System.out.println("Room has TV (yes/no):");
                 String HasTV = s.nextLine().toLowerCase();
                if(! HasTV.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
                }              
                Boolean hasTV = HasTV.equalsIgnoreCase("yes");

                System.out.println("Room has Wifi (yes/no):");
                 String HasWifi = s.nextLine().toLowerCase();
                if(! HasWifi.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
         }              
                Boolean hasWifi = HasWifi.equalsIgnoreCase("yes");

                System.out.println("Room Tarrif per day is:");

                DeluxeACRoom deluxeACRoom = new DeluxeACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
                 System.out.println(deluxeACRoom.calculateTariff());             

        }

        else if(roomType== 3) {
               
                System.out.println("Hotel Name:");
                String hotelName = s.nextLine();
                System.out.println("Room Square Feet Area:");
                int numberOfSqFeet = s.nextInt();
                System.out.println("Room has TV (yes/no):");
                 String HasTV = s.nextLine().toLowerCase();
                if(! HasTV.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
         }              
                Boolean hasTV = HasTV.equalsIgnoreCase("yes");

                System.out.println("Room has Wifi (yes/no):");
                 String HasWifi = s.nextLine().toLowerCase();
                if(! HasWifi.matches("yes|no")) {
                System.out.println("Invalid input");
                System.exit(0);
         }              
                Boolean hasWifi = HasWifi.equalsIgnoreCase("yes");

                System.out.println("Room Tarrif per day is:");

                SuiteACRoom suiteACRoom = new SuiteACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
                System.out.println(suiteACRoom.calculateTariff());             

        }

    else{
        System.out.println("Invalid input");
                System.exit(0);
    }
          

}

}