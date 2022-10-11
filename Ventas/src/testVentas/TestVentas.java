
package testVentas;
import ventas.Orden;
import ventas.Producto;


public class TestVentas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 240);
        Producto producto2 = new Producto("Pantalon", 200);
        Producto producto3 = new Producto("Chaqueta", 300);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        orden1.calcularTotal();
        orden1.mostrarOrden();
        
        System.out.println("---------------------------------------------------------------------");
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        
        orden2.calcularTotal();
        orden2.mostrarOrden();
    }
}
