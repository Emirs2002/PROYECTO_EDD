
/**
 *
 * @author ASantos
 * @version: 26/05/22
 * 
 */
public class Producto {
    protected String nombre;
    protected int cantidad;
    
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre, asigna nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad, asigna cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    

}
