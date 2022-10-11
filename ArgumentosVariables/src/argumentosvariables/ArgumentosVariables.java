package argumentosvariables;

import java.util.Scanner;

public class ArgumentosVariables {
   
    public static void main(String[] args) {
        ImprimirEdad( 22, "Engelbert", "Jerson");
        imprimirNombre("Juan", "Rosa", "Lupe", "Baldemar");
    }

    private static void imprimirNombre(String... nombres) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre:  = " + nombres[i] );
        }
        
    }
    
    private static void ImprimirEdad( int edad, String... nombres){
        System.out.println("Edad = " + edad);
        imprimirNombre(nombres);
        
    }
}
