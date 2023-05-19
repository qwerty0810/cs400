import java.io.BufferedReader;
import java.io.Reader;
import java.util.List;

/**
 * Instances of classes that implement this interface can be used to load a list of pokemon from a
 * specified .xml source
 */
public interface IPokemonDataReader {

  public IPokemon[] getPokemon(); // retrieves an array of every pokemon in the .xml file stored as
                                  // pokemon objects

  public List<IPokemon> readDataSet(Reader r);

}
