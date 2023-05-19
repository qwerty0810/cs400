// --== CS400 File Header Information ==--
// Name: Gurusharan Kunusoth
// Email: kunusoth@wisc.edu
// Team: DU blue
// Role: Data Wrangler
// TA: Daniel Finer
// Lecturer: Florian
// Notes to Grader: n/a

public class Capital implements ICapital {

  private String name; // the name of the capital
  private String country; // name of th country
  private double latitude; // the latitude of the capital
  private double longitude; // the longitude of the capital
  private Capital neighbor1; // first neighbor capital of the given capital
  private Capital neighbor2; // second neighbor capital of the given capital
  private double distance1;
  private double distance2;

  /**
   * Constructor for this Capital object
   *
   * @param name      of the capital of the country
   * @param country   name of the country
   * @param latitude  the latitude of the capital
   * @param longitude the longitude of the capital
   * @param neighbor1
   * @param neighbor2
   */
  public Capital(String country, String name, double latitude, double longitude, double distance1,
      double distance2) {
    this.country = country;
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude; // Initializing instance fields
    this.distance1 = distance1;
    this.distance2 = distance2;

  }

  /**
   * Getter method for country's name
   *
   * @return the name of the country
   */
  @Override
  public String getCountry() {
    // TODO Auto-generated method stub
    return country;
  }

  /**
   * Getter method for Capital name
   *
   * @return the name of the country's capital
   */
  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return name;
  }

  /**
   * Getter method for latitude of the capital
   *
   * @return latitude of the capital
   */
  @Override
  public double getLatitude() {
    // TODO Auto-generated method stub
    return latitude;
  }

  /**
   * Getter method for longitude of the capital
   *
   * @return longitude of the capital
   */
  @Override
  public double getLongitude() {
    // TODO Auto-generated method stub
    return longitude;
  }

  /**
   * Getter method for name of one of the country's neighbor
   * 
   * @param neighbor1
   *
   * @return the name of the country's neighbor
   */
  @Override
  public Capital getNeighbor1() {

    // TODO Auto-generated method stub
    return neighbor1;
  }

  /**
   * Setter method for name of one of the country's neighbor
   * 
   * @param neighbor1
   * @return
   */
  @Override
  public void setNeighbor1(Capital neighbor1, double distance1) {
    this.neighbor1 = neighbor1;
    this.distance1 = distance1;
  }

  /**
   * Setter method for name of one of the country's neighbor
   * 
   * @param neighbor2
   *
   * @return the name of the country's neighbor
   */
  @Override
  public Capital getNeighbor2() {
    // TODO Auto-generated method stub
    return neighbor2;
  }


  @Override
  public void setNeighbor2(Capital neighbor2, double distance2) {
    this.neighbor2 = neighbor2;
    this.distance2 = distance2;
  }

  @Override
  public double getDistance(Capital other) {
    if (other == neighbor1) {
      return this.distance1;
    } else if (other == neighbor2) {
      return this.distance2;
    } else {
      System.out.println("wrong capital");
      return 0.0;
    }
  }

}
