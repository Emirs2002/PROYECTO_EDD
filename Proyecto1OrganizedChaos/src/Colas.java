
/**
 *
 * @author ERodríguez
 * @version 29/05/2022
 */
public class Colas {
     
    private int size;
    private Nodo front;
    private Nodo back;

    /**
    *@return size
    * 
    */
    public int getSize() {
        return size;
    }
    
    /**
    *@return front 
    */
    public Nodo getFront() {
        return front;
    }

    /**
    *@param back, asigna front
    */
    public void setFront(Nodo front) {
        this.front = front;
    }

    /**
    *@return back 
    */
    public Nodo getBack() {
        return back;
    }

    /**
    *@param back, asigna back 
    */
    public void setBack(Nodo back) {
        this.back = back;
    }

    /**
    *@return boolean 
    */
    public boolean esVacio() {
        return this.size == 0;
    }

    //Verificar si existen
    public boolean existe(Object info) {
        Nodo aux = front;
        boolean existe;
        if (!esVacio()) {
            desencolar();
            if (aux.getData() == info) {
                existe = true;
            } else {
                existe = existe(info);
            }
            encolar(aux.getData());
        } else {
            existe = false;
        }
        return existe;
    }

    //Agregar a la cola
    public void encolar(Object info) {
        Nodo nuevo = new Nodo(info);
        if (esVacio()) {
            this.front = nuevo;
            this.back = nuevo;
            size++;
        } else {
            back.pnext = nuevo;
            back = nuevo;
            size++;
        }
    }

    //Eliminar de la cola
    public void desencolar() {
        if (!esVacio()) {
            front = front.pnext;
            size--;
        }
    }

    //Invertir cola
    public void invertCola() {
        Object aux;
        if (!esVacio()) {
            aux = front.data;
            desencolar();
            invertCola();
            encolar(aux);
        }
    }

    //Copiar Cola
    public Colas copy(Colas copia) {
        Object aux;
        if (!esVacio()) {
            aux = front.getData();
            desencolar();
            copia.encolar(aux);
            copy(copia);
            encolar(aux);
        }
        return copia;
    }

    //Buscar elemento en cola
    public Object searchElement(int index) {
        Nodo aux = front;
        Object elemento = null;
        if (index > size) {
            System.out.println("No existe en la cola");
        } else if (index > 1) {
            desencolar();
            index--;
            elemento = searchElement(index);
            encolar(aux.getData());
        } else {
            elemento = front.getData();
        }
        return elemento;
    }

    //Mostrar cola
    public String mostrarCola(String cola) {
        Nodo temp = front;
        int aux = size;
        if (aux > 0) {
            desencolar();
            cola = mostrarCola(cola + "\n" + temp.getData());
            encolar(temp.getData());
        }
        return cola;
    }
}
