 

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidad;
    
    public Ingrediente(String nombre, double cantidad, String unidad) {
        this.nombre   = nombre;
        this.cantidad = cantidad;
        this.unidad   = unidad;
    }
    
    public String getNombre() {
        return nombre;
    }
        
    public boolean equals(Object o) {
        boolean res = false;
        if(o instanceof Ingrediente) {
            Ingrediente otro = (Ingrediente)o;
            res =  nombre.equals(otro.nombre);
        }
        return res;
    }
    
    public int hashCode() {
        return nombre.hashCode();
    }
}
