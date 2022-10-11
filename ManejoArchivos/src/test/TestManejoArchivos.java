
package test;

import manejoarchivos.ManejoArchivos;


public class TestManejoArchivos {
    public static void main(String[] args) {
        ManejoArchivos archivo1 = new ManejoArchivos();
        archivo1.crearArchivo("Prueba.txt");
        archivo1.escribirArchivo("Prueba.txt", "Hola a todos soy estudiante de Sistemas");
        archivo1.anexarArchivo("Prueba.txt", "Se a anexado exitosamente");
        archivo1.anexarArchivo("Prueba.txt", " Hola ");
        archivo1.anexarArchivo("Prueba.txt", "Escribiendo......");
        archivo1.anexarArchivo("Prueba.txt", "Escribiendo desde consola......");
        archivo1.anexarArchivo("Prueba.txt", "Escribiendo sin consola......");
        System.out.println("");
        archivo1.leerArchivo("Prueba.txt");
    }
}
