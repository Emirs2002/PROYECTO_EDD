
/**
 * 
 * @author ERodríguez
 * @version 30/05/2022
 */
public class Pila {
  
    private Nodo top;
    private int size;

    //Constructor 
    public Pila() {
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
    
     //Obtener tamaño
    public int getSize() {
        return size;
    }
    
    //Asignar tamaño
    public void setSize(int size){
        this.size = size;
    }

    //Apilar 
    public void apilar(Object dato) {
        Nodo aux = new Nodo(dato);
        aux.setPnext(this.top);
        setTop(aux);
        size++;
    }

    //Desapilar 
    public Object desapilar() {
        Object info = top.getData2();
        this.top = top.getPnext();
        size--;
    return info;
    }

  
    //Obtener valor del top o cima
    public Object top() {
        return top.getData2();
    }

    //Esta vacio
    public boolean isEmpty() {
        return top == null;
    }


    //Mostrar pila
    public void mostrarPila() {       
        Nodo pAux = this.top;
        while (pAux != null) {
            System.out.println(pAux.getData2());
            pAux = pAux.getPnext();
        }
        
    }

    //sumergir valor
    public void sumergir(Object x) {
        if (!isEmpty()) {
            Object aux = this.desapilar();
            this.sumergir(x);
            this.apilar(aux);
        } else {
            this.apilar(x);
        }
    }

    //Invertir pila
    public void invertirPila() {
        if (!isEmpty()) {
            Object aux = this.desapilar();
            this.invertirPila();
            this.sumergir(aux);
        }
    }

    //Vaciar pila
    public void vaciarPila() {
        while (!isEmpty()) {
            this.desapilar();
        }
    }
    
}
