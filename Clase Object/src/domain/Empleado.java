package domain;

import java.util.Objects;

public class Empleado {
    
        // protected porque vamos heredar atributos a las clases hijas de esta clase
        private String nombre;
        private double sueldo;
        
        
        //Creamos el metodo costructor, el cual sera publico y le pasaremos 2 valores.
        public Empleado ( String nombre, double sueldo){
            this.nombre = nombre;
            this.sueldo = sueldo;
        }
        
        //Creamos un metodo para poder sobreescribir la informacion de la clase padre.
        public String mostrarDetalle(){
            return "Nombre: "+ this.nombre+ " Sueldo: "+ this.sueldo;
        }
        
        //agregamos metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
        
        
    
    
}
