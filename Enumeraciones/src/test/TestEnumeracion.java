package test;

import enumeracion.Continentes;
import enumeracion.Dias;
import java.util.Scanner;

public class TestEnumeracion {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // creamos el metodo main, para orrer el programa

        //--> Imprimimos uno de los dias de la calse anterior, puesto que es constante hacemoos el llamdo de su clase.DIA
//        System.out.println("Dia 1: "+ Dias.JUEVES);
//        
//        
//        menuDia();
        // regresarNumero();
        
        menuContinentes();
    }

    // Crearemos un metodo en donde escribiremos el dia y nos mostrara que actividad hice ese mismo dia
    private static void actividadDia(int opcion) {  // El argumento es de Tipo dias y vamos a pasar un dia de la misma clase

        switch (opcion) {
            case 1:
                System.out.println("Que hice el dia " + Dias.LUNES);
                System.out.println("Amanecio lloviendo, y terminé el ejercicio de los productos");
                break;
            case 2:
                System.out.println("Que hice el dia " + Dias.MARTES);
                System.out.println("igual amanecio lloviendo y empece a realizar el laboratorio final");
                break;

            case 3:
                System.out.println("Que hice el dia " + Dias.MIERCOLES);
                System.out.println("El miercoles vi una pelicula y no estudie nada");
                break;

            case 4:
                System.out.println("Que hice el dia " + Dias.JUEVES);
                System.out.println("Me levante tarde y me bañé, ahora trato de estudiar bien programacion ");
                break;

            case 5:
                System.out.println("Que espero hacer el dia " + Dias.VIERNES);
                System.out.println("Estudiar un rato, y si se puede ver alguna pelicula para distraerme pero tratare de avanzar con los temas");
                break;

            case 6:
                System.out.println("Que espero hacer el dia " + Dias.SABADO);
                System.out.println("Estudiar por el dia, que por la tarde hay que ver el partido de marquense");
                break;

            case 7:
                System.out.println("Que espero hacer el dia " + Dias.DOMINGO);
                System.out.println("dia de descanso, ir a mira y en la tarde el grupo juvenil");
                break;

        }

    }

    private static void menuDia() {
        int numeroDia;

        System.out.println("******* M E N U *******");
        System.out.println("1.- LUNES");
        System.out.println("2.- MARTES");
        System.out.println("3.- MIERCOLES");
        System.out.println("4.- JUEVES");
        System.out.println("5.- VIERNES");
        System.out.println("6.- SABADO");
        System.out.println("7.- DOMINGO");
        System.out.println("¿Que dia vas a eligir");
        numeroDia = entrada.nextInt();
        actividadDia(numeroDia);

    }

    private static int regresarNumero() {
        int a = 10;
        int b = 15;

        int respuesta = a + b;

        return respuesta;
    }
    
    private static void imprimirContinentes (int continentes){
        switch(continentes){
            case 1:
                System.out.println("El 1er continente es "+ Continentes.AFRICA);
                System.out.println("Y cuenta con "+ Continentes.AFRICA.getPais());
            break;
            
            case 2:
                System.out.println("El 2do continente es "+ Continentes.EUROPA);
                System.out.println("Y cuenta con "+ Continentes.EUROPA.getPais());
            break;
            
            case 3:
                System.out.println("El 3er continente es "+ Continentes.ASIA);
                System.out.println("Y cuenta con "+ Continentes.ASIA.getPais());
            break;
            
            case 4:
                System.out.println("El 4T0 continente es "+ Continentes.AMERICA);
                System.out.println("Y cuenta con "+ Continentes.AMERICA.getPais());
            break;
            
            case 5:
                System.out.println("El 5T0 continente es "+ Continentes.OCEANIA);
                System.out.println("Y cuenta con "+ Continentes.OCEANIA.getPais());
            break;
        }
    
    }
    
    private static void menuContinentes (){
        int opcion;
        
        System.out.println("**** MENU CONTINENTES ****");
        System.out.println("1.- AFRICA");
        System.out.println("2.- EUROPA");
        System.out.println("3.- ASIA");
        System.out.println("4.- AMERICA");
        System.out.println("5.- OCEANIA");
        System.out.print("ELIGE UNA OPCION");
        opcion = entrada.nextInt();
        imprimirContinentes(opcion);
    }
}
