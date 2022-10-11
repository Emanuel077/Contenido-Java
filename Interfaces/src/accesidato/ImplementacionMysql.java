package accesidato;

public class ImplementacionMysql implements IAcesoDato{

    @Override
    public void Insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
        
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");
    }

    
}
