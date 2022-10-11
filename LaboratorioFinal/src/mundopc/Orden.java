package mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.this.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Lo sentimos, ha llegado al limite de registros!!");
        }

    }
    
    public void mostrarOrden (){
         System.out.println("Id Orden: "+ this.idOrden);
         System.out.println("Computadoras agregadas a la orden:");
         for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
           
       }     
    }
}
