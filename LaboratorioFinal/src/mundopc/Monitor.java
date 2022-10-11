
package mundopc;


public class Monitor {
    private int idMonitor;
    private String Marca;
    private double tamanio;
    private static int  contadorMonitor;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitor;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.Marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "\nMonitor \n {" + "idMonitor =" + idMonitor + ", Marca =" + Marca + ", tamanio =" + tamanio + '}';
    }

    
    
    
}
