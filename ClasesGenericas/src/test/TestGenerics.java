package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        //Se especifica el tipo como el valor compatible entre ambos tipos.
        ClaseGenerica<String> objetoString = new ClaseGenerica("Emanuel");
        objetoString.obtenerTipo();
    }
}
