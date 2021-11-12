package Prueba;
import java.util.ArrayList;
import java.io.Serializable;

public class Recetario implements Serializable{
    private ArrayList<Receta> recetas;
   
    public Recetario() {
        recetas = new ArrayList<Receta>();
    }
    
    public void agregarReceta(Receta nuevaReceta) {
        recetas.add(nuevaReceta);
    }
    
    public String toString() {
        String report = "";
        for(Receta receta: recetas) {
            report += receta.toString();
        }
        return report;
    }
}
