// --== CS400 File Header Information ==--
// Name: Gurusharan Kunusoth
// Email: kunusoth@wisc.edu
// Team: DU blue
// Role: Data Wrangler
// TA: Daniel Finer
// Lecturer: Florian
// Notes to Grader: n/a

public interface ICapital {

  public String getName();

  public String getCountry();

  public double getLatitude();

  public double getLongitude();

  public Capital getNeighbor1();

  /**
   * Setter method for name of one of the country's neighbor
   * 
   * @param neighbor1
   *
   * @return the name of the country's neighbor
   */
  void setNeighbor1(Capital neighbor1, double distance1);


  public Capital getNeighbor2();

  /**
   * Setter method for name of one of the country's neighbor
   * 
   * @param neighbor2
   *
   * @return the name of the country's neighbor
   */
  void setNeighbor2(Capital neighbor2, double distance2);



  double getDistance(Capital other);

}
