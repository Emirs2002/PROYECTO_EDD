
/**
 *
 * @author ERodríguez
 */

/*ESTA CLASE SALE EN EL LIBRO Y CREO QUE PUEDE SER ÚTIL, PERO NO LA USÉ EN EL
GRAFO PORQUE ME VOLVÍ UN OCHO ENTRE EL CÓDIGO DEL LIBRO Y EL PDF. AL FINAL OPTÉ
POR USAR EL DEL PDF. AQUÍ LA DEJO IGUAL POR SI QUIEREN CHECAR.
*/

public class Vertice {
    //asignarle un nombre al vértice. Creo que puede ser útil
    String nombre;
    //Le asigna un número al vértice
    int index;

    public Vertice(String nombre) {
        this.nombre = nombre;
        this.index = -1;
    }

    //GETTERS Y SETTERS
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
