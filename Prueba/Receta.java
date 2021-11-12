package Prueba;
import java.io.Serializable;

public class Receta implements Serializable{
    private String titulo;
    private String[] ingredientes;
    
    public Receta(String titulo, String[] ingredientes) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
    }
    
    public String toString() {
        String report = "Titulo: "+ titulo +"\n Ingredientes: \n";
        for(String item: ingredientes) {
            report += "  -" + item; 
        }
        return report + "\n\n";
    }
}
