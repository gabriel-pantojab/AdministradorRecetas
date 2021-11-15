 



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class RecipesTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */

public class RecipesTester{
    public RecipesTester() {
        
    }

    @BeforeEach
    public void setUp() {
        
    }
    
    @Test
    public void test1() {
        Receta receta = new Receta(null, null);
        String[] nuevosIngredientes = {"sal", "papa", "leche", "arroz"};
        boolean report = receta.ingresarIngredientes(nuevosIngredientes);
        assertEquals(true, report);
    }

    @Test
    public void contarIngredientesContenidosReceta() {
        HashSet<Ingrediente> ingredientes = new HashSet<Ingrediente>();
        ingredientes.add(new Ingrediente("papa"));
        ingredientes.add(new Ingrediente("tomate"));
        ingredientes.add(new Ingrediente("arroz"));
        
        Receta receta = new Receta("Sopa", ingredientes);
        
        String[] ingredientesProbar = {"sal", "papa", "leche", "arroz"};
        int cantidadContenida = receta.contarIngredientesContenidos(ingredientesProbar);
        assertEquals(2, cantidadContenida);
    }
    
    @Test
    public void test() {
        HashSet<Ingrediente> ingredientes = new HashSet<Ingrediente>();
        ingredientes.add(new Ingrediente("papa"));
        ingredientes.add(new Ingrediente("tomate"));
        ingredientes.add(new Ingrediente("arroz"));
        
        Receta receta = new Receta("Sopa", ingredientes);
        
        String[] ingredientesProbar = {"papa", "Tomáte", "ARROZ"};
        int cantidadContenida = receta.contarIngredientesContenidos(ingredientesProbar);
        assertEquals(3, cantidadContenida);
    }
    
    @Test
    public void clearString() {
        String dirtyString = "AèìòÚ";
        String cleanString = ConvertRobot.standardize(dirtyString);
        assertEquals("aeiou", cleanString);
    }
    
    @Test
    public void getTituloIngrediente() {
        Ingrediente ingrediente = new Ingrediente("tomate");
        assertEquals("tomate", ingrediente.getNombre());
    }
}
