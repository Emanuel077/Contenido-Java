package domain;


public enum TipoEscritura {
    
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    final String descripcion;
    
    private TipoEscritura (String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
