
public class SuiteACRoom extends HotelRoom{
    private int ratePerSqFeet;

    public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
        super(hotelName,numberOfSqFeet,hasTV,hasWifi);
        this.ratePerSqFeet =15;

    }

@Override
public int getRatePerSqFeet(){
    if(hasWifi){
        return (ratePerSqFeet+2);
    }
    return (ratePerSqFeet);
  }


}