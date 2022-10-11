
package mundopc;


public class Mouse extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRaton;
    
    public Mouse (String tipoEntrada, String marca){
    super(tipoEntrada, marca);
    this.idRaton = ++Mouse.this.contadorRaton;
    }

    public int getIdRaton() {
        return idRaton;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Mouse \n{" );
        sb.append("idRaton =").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
