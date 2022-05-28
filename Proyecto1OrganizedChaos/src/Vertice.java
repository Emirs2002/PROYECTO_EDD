
/**
 *
 * @author ERodríguez
 */



public class Vertice {
    //asignarle un nombre al vértice. 
    protected String nombre;
    //Le asigna un número al vértice
    protected int index;
    //Lista de productos:
    protected Lista productos;
    
    public Vertice(String nombre) {
        this.nombre = nombre;
        this.index = -1;
        this.productos = new Lista();
        
    }
   

    //GETTERS Y SETTERS
    
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
    * @return index
    */
    public int getIndex() {
        return index;
    }

    /**
    * @param index, asigna index
    */
    public void setIndex(int index) {
        this.index = index;
    }
    
    /**
    * @return productos
    */
    public Lista getProductos() {
        return productos;
    }
    
    /**
    * @param productos, asigna productos
    */
    public void setProductos(Lista productos) {
        this.productos = productos;
    }
 
// MÉTODOS
    
    //Revisa si el vértice ya existe
    public boolean comparar(Vertice n){
        return this.nombre.equals(n.getNombre());
    }
    
   
//    public String toString() {
//        return nombre + "(" + index + ")";
//    }
//    
    
}
