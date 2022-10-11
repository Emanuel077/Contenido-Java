package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    public void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El arcvhivo fue creado exitosamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("El arcvhivo fue escrito exitosamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public void anexarArchivo (String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter (archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("El arcvhivo fue anexado exitosamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public void leerArchivo (String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader (archivo));
            String lectura = entrada.readLine();
            while (lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
           entrada.close();
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
