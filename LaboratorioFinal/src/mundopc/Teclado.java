
package mundopc;


public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.this.contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTeclado \n{");
        sb.append("idTeclado =").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


   

    
}
