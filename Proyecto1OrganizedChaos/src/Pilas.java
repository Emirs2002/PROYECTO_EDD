
/**
 * 
 * @author ERodríguez
 * @version 29/05/2022
 */
public class Pilas {
  
    private Nodo top;
    private int size;

    //Constructor 
    public Pilas() {
        this.top = null;
        this.size = 0;
    }

    //Obtener top
    public Nodo getTop() {
        return top;
    }

    //Asignar top
    public void setTop(Nodo cima) {
        this.top = cima;
    }

    //Apilar pila
    public void apilar(Object dato) {
        Nodo aux = new Nodo(dato);
        aux.setPnext(this.top);
        setTop(aux);
        size++;
    }

    //Desapilar pila
    public Object desapilar() {
        Object info = top.getData();
        this.top = top.getPnext();
        size--;
        return info;
    }

    //Obtener tamaño
    public int getSize() {
        return size;
    }

    //Obtener valor del top o cima
    public Object top() {
        return top.getData();
    }

    //Esta vacio
    public boolean isEmpty() {
        return top == null;
    }

    //Numeros de datos en la pila
    public int countData() {
        int contador = 0;
        Nodo h = top;
        while (h != null) {
            contador++;
            h = h.getPnext();
        }
        return contador;
    }

    //Mostrar pila
    public String mostrarPila() {
        String pila = "";
        Nodo pAux = this.top;
        while (pAux != null) {
            pila = pila + " " + pAux.getData().toString();
            pAux = pAux.getPnext();
        }
        return pila;
    }

    //sumergir valor
    public void immerse(Object x) {
        if (!isEmpty()) {
            Object aux = desapilar();
            immerse(x);
            apilar(aux);
        } else {
            apilar(x);
        }
    }

    //Invertir pila
    public void invertirPila() {
        if (!isEmpty()) {
            Object aux = desapilar();
            invertirPila();
            immerse(aux);
        }
    }

    //Vaciar pila
    public void vaciarPila() {
        while (!isEmpty()) {
            desapilar();
        }
    }
    
}
