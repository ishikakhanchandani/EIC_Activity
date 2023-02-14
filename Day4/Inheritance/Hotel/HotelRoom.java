public class HotelRoom
{

  protected String hotelName;
  protected int numberOfSqFeet;
  protected boolean hasTV;
  protected boolean hasWifi;


  public HotelRoom (String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
  {
    this.hotelName = hotelName;
    this.numberOfSqFeet = numberOfSqFeet;
    this.hasTV = hasTV;
    this.hasWifi = hasWifi;

  }

  public int getRatePerSqFeet(){
    return 0;
  }

  public int calculateTariff(){
    return numberOfSqFeet*getRatePerSqFeet();
  }
  
    }
