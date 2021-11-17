import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static robot.ConvertRobot.*;

/**
 * The test class RecipesTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */

public class RecipesTester{
    private String nombre;
    private double cantidad;
    private String unidad;
    
    private Receta receta;
    
    public RecipesTester() {
        
    }

    @BeforeEach
    public void setUp() {
        
    }
    
    @Test
    public void testIngresarIngrediente() throws Exception{
        receta   = new Receta("Pure de papa");
        nombre   = "papa";
        cantidad = 1;
        unidad   = "kilo";
        
        assertEquals(true, receta.ingresarIngrediente(nombre, cantidad, unidad));
    }
    
    @Test
    public void testIngresarIngredienteRepetido() throws Exception{
        receta   = new Receta("Pique");
        nombre   = "chorizo";
        cantidad = 1;
        unidad   = "kilo";
        
        assertEquals(true, receta.ingresarIngrediente(nombre, cantidad, unidad));
        assertEquals(false, receta.ingresarIngrediente(nombre, cantidad, unidad));
    }

    @Test
    public void contarIngredientesContenidosReceta() throws Exception{
        receta = new Receta("Sopa");
        receta.ingresarIngrediente("papa", 1, "kilo");
        receta.ingresarIngrediente("tomate", 0.5, "kilo");
        receta.ingresarIngrediente("arroz", 1, "libra");
        
        String[] ingredientes = {"sal", "papa", "leche", "arroz"};
        
        assertEquals(2, receta.contarIngredientesContenidos(ingredientes));
    }
    
    @Test
    public void contarIngredientesContenidos2() throws Exception{
        receta = new Receta("Queque de Chocolate");
        receta.ingresarIngrediente("Harina", 1, "kilo");
        receta.ingresarIngrediente("léche", 0.5, "kilo");
        receta.ingresarIngrediente("choColaté", 1, "libra");
        
        String[] input = {"chocolate", "leChé", "harINA"};
        
        assertEquals(3, receta.contarIngredientesContenidos(input));
    }
    
    @Test
    public void clearString() {
        String dirtyString = "AèìòÚ";
        String cleanString = standardize(dirtyString);
        
        assertEquals("aeiou", cleanString);
    }
    
    @Test
    public void getTituloIngrediente() {
        Ingrediente ingrediente = new Ingrediente("tomate", 1, "kilo");
        
        assertEquals("tomate", ingrediente.getNombre());
    }
    
    @Test
    public void equalsTest() {
        Ingrediente ingrediente1 = new Ingrediente("papa", 1, "kilo");
        Ingrediente ingrediente2 = new Ingrediente("papa", 2, "kilo");
        
        assertTrue(ingrediente1.equals(ingrediente2));
    }
    
    @Test
    public void testEmptyNull() {
        try{
            assertTrue(emptyNullWord(""));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void testEmptyNull2() {
        try{
            assertFalse(emptyNullWord("Torta de queso"));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void parametrosIntercambiados() {
        try{
            receta = new Receta("123");
            fail("Voids are not accepted >:v");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
