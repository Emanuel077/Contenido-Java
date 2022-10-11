package accesidato;

public interface IAcesoDato {
    
    // Los atributos de la clase interfas siempre seran constantes.
    int MAX_REGISTRO = 10;
    
    // Los metodos seran abstractos porque no se implementan. 
    abstract void Insertar();
    
    abstract void listar();
    
    abstract void actualizar();
    
    void eliminar();
    
}
