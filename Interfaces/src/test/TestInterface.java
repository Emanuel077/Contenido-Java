package test;

import accesidato.*;

public class TestInterface {
    public static void main(String[] args) {
        
       
       // IAcesoDato dato = new IAcesoDato ();  // trataremos de crear un objeto de la interfaz y veremos que es imposoble 
        
       IAcesoDato dato = new ImplementacionMysql (); 
       //dato.actualizar();       // aplicamos polimorfismo, pero ejecutando el metodo de la referencia de mysql
       imprimir(dato);
       
      
       dato = new ImplementarOracle();
       //dato.actualizar();       // Polimorfismo ejecutando la referencia del metodo de Oracle
        imprimir(dato);
    }
    
         
    
    public static void imprimir ( IAcesoDato dato){
        dato.listar();
    }
}
