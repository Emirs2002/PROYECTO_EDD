

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
        
//-----------------------------------------------------------------------------
        
//        int[] prueba = Recorrido.recorrerAnchura(grafo, "E");
//        
//        for (int i = 0; i < prueba.length; i++) {
//            System.out.print(prueba[i]);
//        }
        

//-----------------------------------------------------------------------------
        
        int[] prueba = Recorrido.recorrerProfundidad(grafo, "D");
        
        for (int i = 0; i < prueba.length; i++) {
            System.out.print(prueba[i]);
        }

//
//        Interfaz ventana = new Interfaz();
//        ventana.setVisible(true);

    }
    
    
    
    
    }

