
package test;

import domain.*;


public class TestAbstract {
    public static void main(String[] args) {
        
        //No se puede crear un objeto de la clase padre porque es abstracta por lo tanto no puede ser instanciada
             // --> FiguraGeometrica figura1 = new FiguraGeometrica ("Rectangulo");
              
         FiguraGeometrica figura1 = new Rectangulo("Figura Rectangulo");
         // Utilizamos polimorfizmo, por lo que utilizamos Upcasting que hace referencia a la clase hija con el metodo implemetado
         figura1.dibujar();
         
    }

}

