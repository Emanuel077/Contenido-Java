package genericos;


public class ClaseGenerica<T>{  //Indica un tipo generico
    
    T objeto;
    
    public ClaseGenerica( T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println(" El tipo generico T es: "+ this.objeto.getClass().getSimpleName());
    }
            
}
