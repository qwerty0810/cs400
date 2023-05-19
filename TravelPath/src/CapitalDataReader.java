// --== CS400 File Header Information ==--
// Name: Gurusharan Kunusoth
// Email: kunusoth@wisc.edu
// Team: DU blue
// Role: Data Wrangler
// TA: Daniel Finer
// Lecturer: Florian
// Notes to Grader: n/a
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class CapitalDataReader implements ICapitalDataReader {
  File capital;



  @Override
  public ArrayList<ICapital> getCapitals() {
    ArrayList<ICapital> allCapitals = new ArrayList<ICapital>();
    try {
      capital = new File("/Users/sharan/eclipse-workspace/TravelPath/countrycapitals.json");
      Scanner sc = new Scanner(capital);
      while (sc.hasNextLine()) {
        String tempString = new String("");
        String capitalName = new String("");
        String countryName = new String("");
        double latitude = 0.0;
        double longitude = 0.0;
        tempString = sc.nextLine();
        if (tempString.contains("CountryName")) {
          countryName =
              tempString.substring(tempString.indexOf(':') + 3, tempString.lastIndexOf('"'));
          tempString = sc.nextLine();
          capitalName =
              tempString.substring(tempString.indexOf(':') + 3, tempString.lastIndexOf('"'));
          tempString = sc.nextLine();
          latitude = Double.parseDouble(
              tempString.substring(tempString.indexOf(':') + 2, tempString.lastIndexOf(',')));
          tempString = sc.nextLine();
          longitude = Double.parseDouble(
              tempString.substring(tempString.indexOf(':') + 2, tempString.lastIndexOf(',')));
          Capital newCapital = new Capital(capitalName, countryName, latitude, longitude, 0, 0);
          allCapitals.add(newCapital);
          tempString = sc.nextLine();
          tempString = sc.nextLine();
          tempString = sc.nextLine();
        }
      }
      sc.close();
      return allCapitals;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }


}
