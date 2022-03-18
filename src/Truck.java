public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Axles: " + axles);
    System.out.println("Has Trailer: " + hasTrailer);
  }

  public boolean validateLicensePlate()
  {
    boolean h=false;
    if(hasTrailer=true&&axles>4)
    {
      if(getLicensePlate().contains("MX"))
      {
        h=true;
      }
    }
    else if(hasTrailer=true&&axles<4)
    {
      if(getLicensePlate().contains("LX"))
      {
        h=true;
      }
    }
    return false;
  }

}