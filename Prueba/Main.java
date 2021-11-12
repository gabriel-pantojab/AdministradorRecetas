package Prueba;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        /*Recetario recetario = new Recetario();
        
        String[] g1 = {"pap, tomate, arroz"};
        Receta receta1 = new Receta("Juan", g1);
        
        String[] g2 = {"pap, aceite, arroz"};
        Receta receta2 = new Receta("Carlos", g2);
        
        String[] g3 = {"papa, harina, yuca"};
        Receta receta3 = new Receta("Saul", g3);
        
        String[] g4 = {"perejil, tomate, zanahoria"};
        Receta receta4 = new Receta("Hector", g4);
        
        String[] g5 = {"cebolla, fideo, arroz"};
        Receta receta5 = new Receta("Mariana", g5);
        
        recetario.agregarReceta(receta1);recetario.agregarReceta(receta2);recetario.agregarReceta(receta3);
        recetario.agregarReceta(receta4);recetario.agregarReceta(receta5);*/
        
        try{
            /*ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("recetas.txt"));
            escritor.writeObject(recetario);
            escritor.close();*/
            
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("recetas.txt"));
            Recetario p = (Recetario)lector.readObject();
            lector.close();
            
            System.out.println(p);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
