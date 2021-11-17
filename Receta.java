import java.text.Normalizer;
import java.util.*;
import static robot.ConvertRobot.*;

/**
 * Write a description of class Receta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Receta {
    private String titulo;
    private HashMap<Integer, String> preparacion;
    private HashSet<Ingrediente> ingredientes;
    
    /**
     * autor -> object?? , review(reseña){comentario, estrellita, autor} -> objeto ??
     */
    
    public Receta(String titulo) throws Exception{
        matched(titulo);
        this.titulo = titulo;
        this.ingredientes = new HashSet<Ingrediente>();
    }
    
    public int contarIngredientesContenidos(String[] ingredientes) {
        int contenidos = 0;
        ingredientes = standardizeArray(ingredientes);
        for(String i: ingredientes) {
            for(Ingrediente e: this.ingredientes) {
                if(i.equals(e.getNombre())) {
                    contenidos++;
                }
            }
        }
        return contenidos;
    }
    
    public boolean ingresarIngrediente(String nombre, double cantidad, String unidad){
        Ingrediente nuevoIngrediente = new Ingrediente(standardize(nombre), cantidad, unidad);
        return ingredientes.add(nuevoIngrediente);
    }
    
    public int cantidadIngredientes() {
        return ingredientes.size();
    }
}

    

