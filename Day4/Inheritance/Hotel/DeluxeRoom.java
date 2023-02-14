public class DeluxeRoom extends HotelRoom{
    protected int ratePerSqFeet;

    public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi){
        super(hotelName,numberOfSqFeet,hasTV,hasWifi);
        this.ratePerSqFeet =10;

    }

@Override
public int getRatePerSqFeet(){
    if(hasWifi){
        return (ratePerSqFeet+2);
    }
    return (ratePerSqFeet);
  }

}

