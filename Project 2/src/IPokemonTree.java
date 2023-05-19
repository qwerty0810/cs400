import com.sun.org.apache.bcel.internal.classfile.Attribute;

/**
 * Instances of classes that implement this interface can be used to create a red-black tree
 * containing Pokemon and their data
 * 
 * @author Scott Huddleston, Alvin Kang
 */
public interface IPokemonTree<IPokemon extends Comparable<IPokemon>> extends Iterable<IPokemon> {

  /*
   * Inserts a Pokemon into the tree
   */
  public boolean add(IPokemon pokemon) throws NullPointerException, IllegalArgumentException;

  /*
   * Searches a Pokemon from the tree based on its ID
   */
  public IPokemon simpleSearch(int pokemonID);

  /*
   * Edits info about a Pokemon on the tree
   */
  public void edit(IPokemon pokemon);

  /*
   * Responsible for rotation of red-black tree
   */
  public void rotate(IPokemon parent, IPokemon child);

  /*
   * Re-sorts the tree based on the attribute
   */
  public void reSort(Attribute a);

  /*
   * Returns the size of the tree
   */
  public int size();

  public void insert(IPokemon p);

  public IPokemon contains(String name);

  public IPokemon idSearch(int id);



}
