// --== CS400 File Header Information ==--
// Name: Gurusharan
// Email: kunusoth@wisc.edu
// Team: DU
// TA: Daniel Finer
// Lecturer: Florian

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class PokemonSearcherBackend implements IPokemonSearcherBackend {

  private PokemonTree _tree; // Red Black Tree that contains pokemon
  private Pokemon[] objList; // List of all the pokemon

  /**
   * Constructor to instantiate backend using a string array of arguments. These arguments will be
   * extracted from readDataSet() written by the Data Wrangler
   *
   * @throws FileNotFoundException - if the file isn't found
   */
  public PokemonSearcherBackend() {
    // instance objects
    _tree = new PokemonTree();

    // readers extract pokemons from the csv file
    // FileReader reader = new FileReader(args[0]);
    // BufferedReader file = new BufferedReader(reader);
    PokemonDataReader pokemonDataReader = new PokemonDataReader(); // intantiating

    // exceptions
    try {
      objList = pokemonDataReader.getPokemon();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }
    // populating the red black tree with the method call below
    populatePokemonTree();
  }

  /**
   * Constructor to instantiate backend using a Reader object. These reader will be used to extract
   * pokemon from readDataSet() written by the Data Wrangler
   * 
   * @param r - the reader from the front end that facilitate's the extraction of the movies
   */
  public PokemonSearcherBackend(Reader r) {
    _tree = new PokemonTree();

    PokemonDataReader pokemonDataReader = new PokemonDataReader();

    // exceptions
    try {
      objList = pokemonDataReader.getPokemon();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }

    // Populating the red black tree with the method call below
    populatePokemonTree();
  }

  /**
   * Private helper method to populate the Pokemon Red Black Tree
   */
  private void populatePokemonTree() {
    for (Pokemon p : objList) {
      try {
        _tree.add(p);
      } catch (IllegalArgumentException e) {
      }

    }
  }

  @Override
  public void addPokemon(Pokemon pokemon) {
    // TODO Auto-generated method stub
    _tree.add(pokemon);

  }

  @Override
  public ArrayList<Pokemon> getID(int id) {
    return _tree.idSearch(id); // TODO Auto-generated method stub

  }

  @Override
  public ArrayList<Pokemon> getName(String name) {
    return _tree.nameSearch(name);

  }

}
