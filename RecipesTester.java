 



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
    public void testIngresarIngrediente() {
        Receta receta = new Receta("Sopa");
        String nombre = "papa";
        double cantidad = 1;
        String unidad = "kilo";
        boolean report = receta.ingresarIngrediente(nombre, cantidad, unidad);
        assertEquals(true, report);
    }
    
    @Test
    public void testIngresarIngredienteRepetido() {
        Receta receta = new Receta("Pique");
        String nombre = "chorizo";
        double cantidad = 1;
        String unidad = "kilo";
        assertEquals(true, receta.ingresarIngrediente(nombre, cantidad, unidad));
        assertEquals(false, receta.ingresarIngrediente(nombre, cantidad, unidad));
    }

    @Test
    public void contarIngredientesContenidosReceta() {
        Receta receta = new Receta("Sopa");
        receta.ingresarIngrediente("papa", 1, "kilo");
        receta.ingresarIngrediente("tomate", 0.5, "kilo");
        receta.ingresarIngrediente("arroz", 1, "libra");
        
        String[] ingredientesProbar = {"sal", "papa", "leche", "arroz"};
        
        int cantidadContenida = receta.contarIngredientesContenidos(ingredientesProbar);
        assertEquals(2, cantidadContenida);
    }
    
    @Test
    public void contarIngredientesContenidos2() {
        Receta receta = new Receta("Sopa");
        receta.ingresarIngrediente("Papa", 1, "kilo");
        receta.ingresarIngrediente("tomaté", 0.5, "kilo");
        receta.ingresarIngrediente("arRoz", 1, "libra");
        
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
        Ingrediente ingrediente = new Ingrediente("tomate", 1, "kilo");
        assertEquals("tomate", ingrediente.getNombre());
    }
    
    @Test
    public void equalsTest() {
        Ingrediente ing1 = new Ingrediente("papa", 1, "kilo");
        Ingrediente ing2 = new Ingrediente("papa", 2, "kilo");
        assertTrue(ing1.equals(ing2));
    }
}
