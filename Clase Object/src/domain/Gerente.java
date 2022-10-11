package domain;


public class Gerente extends Empleado{
    // El atributo sera privado porque no vamos a heredar ninguna clase de gerente.
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento ){
        super(nombre, sueldo);
        this.departamento = departamento;
    
    }

    @Override
    public String mostrarDetalle(){
            return super.mostrarDetalle() + ", Departamento: "+this.getDepartamento();
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
