/**
 * Instances of classes that implement this interface represent a single pokemon that can be stored,
 * sorted, and searched for based on these accessors below
 */
public interface IPokemon extends Comparable<IPokemon> {

  public String getName(); // retrieves pokemon's name

  public int getID(); // retrieves pokemon's number

  public int getHealth(); // retrieves pokemon's base health

  public int getSpeed(); // retrieves pokemon's base speed

  public int getAtk(); // retrieves pokemon's base attack

  public int getDef(); // retrieves pokemon's base defense

  public int getSpAtk(); // retrieves pokemon's base special attack

  public int getSpDef(); // retrieves pokemon's base special defense

  // compareTo() method supports sorting shows in ascending by name
}
