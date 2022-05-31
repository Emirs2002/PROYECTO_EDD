

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
       
//        int[] prueba = Recorrido.recorrerAnchura(grafo, "E");
//        
//        for (int i = 0; i < prueba.length; i++) {
//            System.out.print(prueba[i]);
//        }
        
//        Recorrido.recorrerProfundidad(grafo, 0);
    }
    
    
    
    
    }

