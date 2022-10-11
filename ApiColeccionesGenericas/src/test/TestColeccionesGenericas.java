package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        // Creamos un  arrayList
        List<String> miLista = new ArrayList<>();     // Mantiene el orden de los elementos. // notacion diamante 
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);
        
       
        System.out.println("");
        
        
        Set miSet = new HashSet();      // No garantiza el orden de cada elemento.
        miSet.add(" Uno ");
        miSet.add("Dos");
        miSet.add("Tres");
        miSet.add("Cuatro");
        miSet.add("Cinco");
        imprimir(miSet);
        
        System.out.println("");
        
        Map miMapa = new HashMap();
        miMapa.put( 1, "Beliberto");
        miMapa.put( 2, "Maribel");
        miMapa.put( 3, "Emamuel");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
        
    }
        
    public static void imprimir(Collection coleccion){
            for ( Object elemento: coleccion){
                System.out.println("elemento = " + elemento);
            }
        }
    
}
