// --== CS400 File Header Information ==--
// Name: Gurusharan
// Email: kunusoth@wisc.edu
// Team: DU
// TA: Daniel Finer
// Lecturer: Florian
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringReader;
import java.util.List;

public class PokemonSearcherBackendTests {


  /**
   * Test for finding Pokemon by name
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testFindPokemonByName() {
    // Initialize PokemonSearcherBackend
    PokemonSearcherBackend b = new PokemonSearcherBackend(
        new StringReader("#,Name,Attack,Defense,HP,Region,Sp. Atk,Sp. Def,Speed,Type 1,Type 2\n"
            + "0,Bulbasaur,49,49,45,Kanto,65,65,45,Grass,Poison\n"
            + "1,Ivysaur,62,63,60,Kanto,80,80,60,Grass,Poison\n"
            + "2,Venusaur,82,83,80,Kanto,100,100,80,Grass,Poison\n"
            + "3,Charmander,52,43,39,Kanto,60,50,65,Fire,None\n"
            + "4,Charmeleon,64,58,58,Kanto,80,65,80,Fire,None\n"));

    assertEquals(null, b.getName("Batman"));
    assertEquals(null, b.getName("Darkrai"));


    assertEquals("Bulbasaur", ((List<IPokemon>) b.getName("Bulbasaur")).get(0).getName());

  }

  /**
   * Test for finding Pokemon by ID
   */
  @Test
  public void testFindPokemonById() {
    // Initialize PokemonSearcherBackend
    PokemonSearcherBackend b = new PokemonSearcherBackend(
        new StringReader("#,Name,Attack,Defense,HP,Region,Sp. Atk,Sp. Def,Speed,Type 1,Type 2\n"
            + "0,Bulbasaur,49,49,45,Kanto,65,65,45,Grass,Poison\n"
            + "1,Ivysaur,62,63,60,Kanto,80,80,60,Grass,Poison\n"
            + "2,Venusaur,82,83,80,Kanto,100,100,80,Grass,Poison\n"
            + "3,Charmander,52,43,39,Kanto,60,50,65,Fire,None\n"
            + "4,Charmeleon,64,58,58,Kanto,80,65,80,Fire,None\n"));

    // Case 1: Invalid ID
    assertEquals(null, b.getID(765));

    // Case 2: pokemon by ID from tree
    assertEquals("Charizard", b.getID(5).getName());
  }



}
