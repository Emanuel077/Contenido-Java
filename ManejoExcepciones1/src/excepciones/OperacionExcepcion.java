package excepciones;

  
public class OperacionExcepcion extends Exception{      // --> Es de tipo check 
    
    //Propagamos un mensaje, y este mensaje es mandado hacia la clase padre.. Exception
    
    public OperacionExcepcion( String mensaje){
        super(mensaje);
    }
}
