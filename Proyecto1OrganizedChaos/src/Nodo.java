
/**
 *
 * @author ASantos 
 * @version: 27/05/22
 * 
 */
public class Nodo <T>{
    
    protected Nodo <T> pnext;
    protected T data;
    
    
    public Nodo(T data) {
        this.pnext = null;
        this.data = data;
    }

    /**
    * @return pnext
    */
    public Nodo<T> getPnext() {
        return pnext;
    }

    /**
    * @param pnext, asigna pnext
    */
    public void setPnext(Nodo<T> pnext) {
        this.pnext = pnext;
    }

    /**
    *@return nombre
    */
    public T getData() {
        return data;
    }

    /**
    * @param data, asigna data
    */
    public void setData(T data) {
        this.data = data;
    }
    
}
