// --== CS400 File Header Information ==--
// Name: Gurusharan
// Email: kunusoth@wisc.edu
// Team: DU
// TA: Daniel Finer
// Lecturer: Florian

import java.util.List;

public interface IPokemonSearcherBackend {
  public void addPokemon(IPokemon pokemon);

  public IPokemon getID(int id);

  public List<IPokemon> getName(String name);



}
