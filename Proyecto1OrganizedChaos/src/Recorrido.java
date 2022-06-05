
import javax.swing.JOptionPane;


/**
 *
 * @author ERodríguez
 * @version 03/06/2022
 */
public class Recorrido {
    
    /**
    *
    * @param nombre nombre del vertice origen
    * @param grafo grafo con la informacion del txt
    * @return arreglo con las posiciones de los vertices
    */
    public static String recorrerAnchura(GrafoMAdy grafo, String nombre){
        int valOrigen;
        Integer w = null;
        int intW;
        int[] arrVisitados = null;
        Vertice[] verts = grafo.getVerts(); //arreglo con los vertices del grafo
        String temp = "";
        
                
        try{
            valOrigen = grafo.buscarIndex(nombre);
            
           if (valOrigen < 0)throw new Exception("Vertice no existe");
        
           Cola cola = new Cola();
           arrVisitados = new int[grafo.getNumVerts()];
           
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                arrVisitados[i] = -1; //Los vértices se marcan con -1
            
            }
            
            arrVisitados[valOrigen] = 0; //vertice de partida se inicializa en 0
            cola.encolar(valOrigen); //se encola un nodo con el índice del vértice 
            
            
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                if(arrVisitados[i] == -1){
                    
                    while(!cola.esVacio()){
                        
                        
                        w = (Integer) cola.desencolar();                     
                        intW = w;
//                      System.out.println("Vertice" + verts[intW].getNombre() + "visitado");
                        Vertice vert = verts[intW];
                        Lista lista = vert.getProductos();
                        
                        temp += "Almacen" + " " + vert.getNombre() + "\n" + lista.obtenerInfo() + "\n";
                    
                    //Se encolan los adyacentes
                    for (int j = 0; j < grafo.getNumVerts(); j++) {
                        if((w != j) && (grafo.existeArista(w, j) && arrVisitados[j] == -1)){ //Utilizar la funcion de añadir a la matriz                            
                            int valNodo = verts[j].getIndex();
                            cola.encolar(valNodo); 
                            arrVisitados[j] = 0;
                            }
                        }
                    }
                }
            
            }
            return temp;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se pudo recorrer el grafo [Anchura]");
        }
        return temp;        
   
    } 



    public static String recorrerProfundidad(GrafoMAdy grafo, String nombre){
        int valOrigen, valSig = 0;       
        int[] arrVisitados = null;
        Vertice[] verts = grafo.getVerts();
        Pila pila = new Pila();
        arrVisitados = new int[grafo.getNumVerts()];
        String temp = "";
        
        try{
            valOrigen = grafo.buscarIndex(nombre);
            
            if (valOrigen < 0)throw new Exception("Vertice no existe");
            
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                arrVisitados[i] = -1; //Los vértices se marcan con -1            
            }
            
            arrVisitados[valOrigen] = 0; //vertice de partida se inicializa en 0
            
            pila.apilar(valOrigen);
            
            while(!pila.isEmpty()){
                Integer sig;
                sig = (Integer) pila.desapilar();
                valSig = sig;
//                System.out.println("Vertice" + " " + verts[valSig].getNombre()+ " " + "visitado");
                
                Vertice vert = verts[valSig];
                Lista lista = vert.getProductos();
                temp += "Almacen" + " " + vert.getNombre() + "\n" + lista.obtenerInfo() + "\n";
                
                for (int j = 0; j < grafo.getNumVerts(); j++){
                    if((valSig != j) && (grafo.existeArista(valSig, j) && arrVisitados[j] == -1)){
                        int valNodo = verts[j].getIndex();
                        pila.apilar(valNodo); 
                        arrVisitados[j] = 0;
                    }
                }
            }
            
            return temp;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se pudo recorrer el grafo [Profundidad]");
            }
        
        
        
    return temp;
    }
    
    
}