package test;

import aritmetica.Aritmetica;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        // Utilizamos los bloques de try y catch para la excepciones
        
        try {
            resultado = Aritmetica.division(10, 0);
        }
        catch(Exception e){
            System.out.println("Imprimiendo informacion del error:");
//            e.printStackTrace(System.out);
        }
        
        System.out.println("resultado = " + resultado);
        
    }
}
