package enumeracion;

public enum Continentes {

    AFRICA(45),
    EUROPA(34),
    ASIA(16),
    AMERICA(34),
    OCEANIA(41);     // Colocamos (;) por si se desea agreagar mas enumraciones a la clase continentes

    // agragamos atributos a las enumeraciones
    private final int pais;

    private Continentes(int pais) {
        this.pais = pais;
    }

    public int getPais() {
        return this.pais;
    }
    
}
