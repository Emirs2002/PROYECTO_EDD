

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
        Vertice[] e = grafo.getVerts();
//        Producto prueba = new Producto("Pantalla", 3);
//        Producto prueba1 = new Producto("RAM", 6);
//        Producto [] Plist = new Producto[2];
//        Plist[0] = prueba;
//        Plist[1] = prueba1;
//        
//        String [] Alist = grafo.pedidoAlmacenes(Plist, grafo);
//        
//        for (int i = 0; i < Alist.length; i++) {
//            System.out.print(Alist[i]);
//        }
        
        
        
        
        //Vertice [] alist = Recorrido.busquedaProductos(grafo, name, prueba);
//        RutaMinima rout = new RutaMinima(grafo, e[0]);
//        rout.conseguirRuta();
//     int cont = 0;
//     
//        for(int i = 0; i<alist.length; i++)
//        {
//           if(alist[i]==null){
//               break;
//           }
//            cont++;
//        }
//        Vertice [] blist = new Vertice[cont];
//        for(int j = 0; j<cont; j++){
//            blist[j]=alist[j];
//            System.out.println(alist[j].getNombre());
//
//        }
        
        

//
        Interfaz ventana = new Interfaz();
        ventana.setVisible(true);
   
    }
    
    
    
    
    }

