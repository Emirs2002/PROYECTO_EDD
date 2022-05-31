

/**
 *
 * @author ASantos 
 * @version: 27/05/22
 * 
 */
public class Nodo{
    
    protected Nodo pnext;
    protected Producto data;
    
    
    public Nodo(Producto data) {
        this.pnext = null;
        this.data = data;
    }

    /**
    * @return pnext
    */
    public Nodo getPnext() {
        return pnext;
    }

    /**
    * @param pnext, asigna pnext
    */
    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    }

    /**
    *@return nombre
    */
    public Producto getData() {
        return data;
    }

    /**
    * @param data, asigna data
    */
    public void setData(Producto data) {
        this.data = data;
    }
}
