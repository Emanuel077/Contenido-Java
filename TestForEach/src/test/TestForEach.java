package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        
        int edades [] = new int [4];
        
        edades [0] = 15;
        edades [1] = 18;
        edades [2] = 21;
        edades [3] = 24;
        
        // USO DEL FOREACH  
        
        for( int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        
        //Creamos el arreglo tipo object 
        
        Persona persona1 [] = new Persona[5];
        persona1 [0] = new Persona("Engelbert");
        persona1 [1] = new Persona("Baldemar");
        persona1 [2] = new Persona("Jerson");
        persona1 [3] = new Persona("Sonia");
        persona1 [4] = new Persona("Beliberto");
        
        for(Persona persona : persona1){
            System.out.println("persona = " + persona);
        }
    }
       
}
