// --== CS400 File Header Information ==--
// Name: Gurusharan Kunusoth
// Email: kunusoth@wisc.edu
// Team: DU blue
// Role: Data Wrangler
// TA: Daniel Finer
// Lecturer: Florian
// Notes to Grader: n/a
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DataWranglerTests {


  // tests capital name of the first capital in file
  @Test
  public void test1() {
    CapitalDataReader fileReader = new CapitalDataReader();
    ArrayList<ICapital> capitals = fileReader.getCapitals();
    assertEquals(capitals.get(0).getName().trim(), "Hargeisa");
  }

  // tests country name of the first country in file
  @Test
  public void test2() {
    CapitalDataReader fileReader = new CapitalDataReader();
    ArrayList<ICapital> capitals = fileReader.getCapitals();
    assertEquals(capitals.get(0).getCountry().trim(), "Somaliland");
  }

  // tests latitude
  @Test
  public void test3() {
    CapitalDataReader fileReader = new CapitalDataReader();
    ArrayList<ICapital> capitals = fileReader.getCapitals();
    assertEquals(capitals.get(0).getLatitude(), 9.55);
  }

  // tests longitude
  @Test
  public void test4() {
    CapitalDataReader fileReader = new CapitalDataReader();
    ArrayList<ICapital> capitals = fileReader.getCapitals();
    assertEquals(capitals.get(0).getLongitude(), 44.05);
  }

  // tests if capital is correctly made
  @Test
  public void test5() {
    CapitalDataReader fileReader = new CapitalDataReader();
    ArrayList<ICapital> capitals = fileReader.getCapitals();
    assertEquals(capitals.get(17).getName(), "Buenos Aires");
  }



  // tests tht total number of capitals in the file are correct
  @Test
  public void test7() {
    CapitalDataReader fileReader = new CapitalDataReader();
    ArrayList<ICapital> capitals = fileReader.getCapitals();
    assertEquals(capitals.size(), 245);
  }

  public static void main(String[] args) {
  }
}
