package bloque;


public class Persona {
    
    private final int idPersona;
    private static int contadorPersona;
    
    /*BLOQUE ESTATICO: Solo se ejecuta una vez unicamente cuando se
    carga la clase, solo utilizan los atributos static  */ 
    
    static{
        System.out.println("Ejecutando el bloque estatico");
        ++contadorPersona;
    }
    
    /*BLOQUE NO ESTATICO: Se ejecuta las veces que se instancia un objeto de la clase
    se utilizan los atributos no estaticos, final como la palabra this....etc*/
    
    {
        System.out.println("Ejecutando el bloque NO estatico");
        this.idPersona = contadorPersona++;
    }
    
    // Los bloque de inicializacion se ejecutan antes del constructor
    
    public Persona (){
        System.out.println("Ejecutando el costructor...... ");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + '}';
    }
    
  
}
