
import javax.swing.JOptionPane;


/**
 *
 * @author ERodríguez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo a = new Archivo();
        GrafoMAdy grafo = a.armarGrafo("test\\amazon.txt");
        
        grafo.printMatriz();
        
        Vertice[] verts = grafo.getVerts();
        
        Lista lista = verts[0].getProductos();
        
        System.out.println(verts[0].getNombre());
        System.out.println("Almacen 1");
        lista.imprimirLista(); 
        int tamanho = lista.getTamanho();
        System.out.printf("Tamanho de la lista es %d\n", tamanho);
    }
    
}
