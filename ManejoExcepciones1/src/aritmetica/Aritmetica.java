package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    
    //Creamos un metodo en donde se calculara la division
    
    public static int division( int numerador, int denominador)
            throws OperacionExcepcion{          //--> firmamos el metodo, que indica la posible excepcion sea arrojada.
        
        if ( denominador == 0){
            throw new OperacionExcepcion(" El denominador es igual a 0"); //Reportamos una excepcion creando un objeto
        }
        return numerador / denominador;
    }
}
