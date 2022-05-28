
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
        
        

    
    }
    
}
