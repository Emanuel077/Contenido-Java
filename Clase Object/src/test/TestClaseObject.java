package test;

import domain.*;

public class TestClaseObject {

   static Empleado empleado1 = new Empleado("Estrada Estrada ", 10000);
   static Empleado empleado2 = new Empleado("Estrada ", 10000);
    
    public static void main(String[] args) {
        
        referenciaPorMemmoria();
        System.out.println("");
        usoEquals();
        System.out.println("");
         usoHasCode();

//        Empleado empleado1 = new Empleado("Beliberto Estrada", 4000);
//        Empleado empleado2 = new Empleado("Beliberto Estrada", 4000);

        
//        if (empleado1 == empleado2) {
//            System.out.println(" Las referencia en memoria de los Objetos son iguales ");
//        } else {
//            System.out.println("La referencia en memoria de los objetos NO son iguales");
//        }
//        
//        
//        if (empleado1.equals(empleado2)) {
//            System.out.println("Los objetos son iguales en contenido");
//        } else {
//            System.out.println("Los objetos no son iguales en contenido");
//        }
        
//        
//        if (empleado1.hashCode() == empleado2.hashCode()) {
//            System.out.println("La comparaacion hasCode son iguales");
//        } else {
//            System.out.println("La comparacion hasCode NO son iguales");
//        }
    }

    public static void referenciaPorMemmoria() {

        if (empleado1 == empleado2) {
           System.out.println(" Las referencia en memoria de los Objetos son iguales ");
       } else {
           System.out.println("La referencia en memoria de los objetos NO son iguales");
        }    }

    public static void usoEquals() {
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos no son iguales en contenido");
        }
    }

    public static void usoHasCode() {
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("La comparaacion hasCode son iguales");
       } else {
            System.out.println("La comparacion hasCode NO son iguales");
        }
    }
}
