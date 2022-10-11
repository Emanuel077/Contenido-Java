package domain;

public class Rectangulo extends FiguraGeometrica{

    public Rectangulo( String tipoFigura){
        super(tipoFigura);
    }
    // Se implementa el metodo dibujar 
    @Override
    public void dibujar(){
        System.out.println("Se imprime un rectangulo");
    }
}
