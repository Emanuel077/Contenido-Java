package domain;


public class Escritor extends Empleado {
    
     final TipoEscritura descripcionEscritura;
    
    public Escritor (String nombre, double sueldo, TipoEscritura descripcionEscritura){
        super(nombre, sueldo);
        this.descripcionEscritura = descripcionEscritura;
    }

    public TipoEscritura getDescripcionEscritura() {
        return this.descripcionEscritura;
    }
    
    @Override
   public String mostrarDetalle (){
       return super.mostrarDetalle() + " Tipo Escritua "+ descripcionEscritura.getDescripcion();
   }
}