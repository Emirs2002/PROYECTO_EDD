
import javax.swing.JOptionPane;


/**
 *
 * @author ERodríguez
 * version: 01/06/22
 */
public class GrafoMAdy {
    //Número de vértices
    private static int numVerts;
    
    //tamaño máximo de la matriz
    private int maxNodos;
    
    //Lista con los vértices
    private static Vertice[] verts;
    
    //Forma la matriz
    private int [][] matAdy;
    
    //Todos los productos
    private String [] totalProductos;


      
            
    public GrafoMAdy(int max) {
        matAdy = new int [max][max];
        verts = new Vertice[max];
        maxNodos = max;        
        numVerts = 0;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                matAdy[i][j] =  0; 
            }
            
        }
       
    }

//Getters y Setters
    public int getNumVerts() {
        return numVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public int getMaxVerts() {
        return maxNodos;
    }

    public void setMaxVerts(int maxVerts) {
        this.maxNodos = maxVerts;
    }
    
    public Vertice[] getVerts(){
        return this.verts;
    }
    
    public void setVerts(Vertice[] verts){
        this.verts = verts;
    }
    
    public int[][] getmatAdy() {
        return matAdy;
    }

    public void setmatAdy(int[][] matAdy) {
        this.matAdy = matAdy;
    }

  
    
    //MÉTODOS
    
    public boolean esVacio(){
        return this.numVerts == 0;
    }
    
//    //Va a decir si el vértice ya existe o no. Validar
//    public boolean buscarVertice(String nom){
//        
//        Vertice verti = new Vertice(nom);
//        boolean existe = false;
//        int i = 0;
//        for (; (i < numVerts) && !existe;) {
//            existe = verts[i].comparar(verti);
//            if(!existe) i++;
//           
//        }
//        
//        return existe;
//        
//    }
    
    //Para retornar el índice de los vértices
     public static int buscarIndex(String nom){
        
        Vertice verti = new Vertice(nom);
        boolean existe = false;
        int i = 0;
        for (; (i < numVerts) && !existe;) {
            existe = verts[i].comparar(verti);
            if(!existe) i++;
           
        }
        
        if(existe){
        return i;
        }
        else{
        
        return -1;
            
        }
    }
    
//Aristas 
        
    public void crearArista(String u, String v, int peso){
        /*En el código lo marcan con true, creo recordar que Ale
        dijo que en este caso se pondría el peso, así que añadí ese paramétro.       
     
        Hacer excepciones por si alguno de los dos no existe, por si superan el maximo, etc.
        */
        if(!this.esVacio()){
            
            int valU, valV;
            valU = buscarIndex(u);
            valV = buscarIndex(v);
            if(valU != -1 && valV != -1){
                matAdy[valU][valV] = peso;
            }
            else{
                System.out.println("Error, el vértice no existe"); //hacerle format
            }
             
        }
        else{
            System.out.println("Error, grafo vacío");
        }
    }
    
    
    public void eliminarArista(String u, String v){
        
        if(!this.esVacio()){
            int valU, valV;
            valU = buscarIndex(u);
            valV = buscarIndex(v);
           if(valU != -1 && valV != -1){
                matAdy[valU][valV] = 0;
            }
            else{
                System.out.println("Error, el vértice no existe");
            }
        }
        else{
            System.out.println("Error, grafo vacío");
        }
            
        
    }
    
    //Comprobar si existe la arista
    public boolean existeArista(int v, int u){
        boolean existe;
        if(matAdy[v][u] != 0){
            existe = true;
        }else{
            existe = false;
        }
        return existe;
    }
    
    //buscar arista:
//    public boolean getArista(int v, int u){
//    boolean existe;
//    if(matAdy[v][u] != 0){
//        existe = true;
//    }else{
//        existe = false;
//    }
//    return existe;
//}
    

//Vértice
    
    public void crearVertice(String nom){
        int existe = buscarIndex(nom);
        if(existe == -1){
            Vertice verti = new Vertice(nom);
            verti.setIndex(numVerts);
            verts[numVerts++] = verti;
        }
        
    }
    
//Eliminar vértice no está y no tengo cabeza para pensar en eso ahora. Sorry
    
//Imprimir la matriz de adyacencia
    
    public void printMatriz(){
        System.out.printf("La matriz contiene %d vertices \n", numVerts);
        String matriz = "";
        for (int i = 0; i < maxNodos; i++) {
            matriz += ",";
            for (int j = 0; j < maxNodos; j++) {
                matriz += (matAdy[i][j]);
             
            }
        
        }
        String[] mat = matriz.split(",");
        JOptionPane.showMessageDialog(null, mat);
    }
    
//Tamaño del grafo
    
    public int tamanho(){
        int tm = 0;
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                tm += matAdy[i][j];                
            }
            
        }
        return tm;
    }
    
//Grados
    
//Calcula el grado de entrada del vértice
    
    //Recorre las filas, teniendo la columna fija
    public int gradoEnt(int j){
        int gEnt = 0;
        for (int i = 0; i < numVerts; i++) {
                gEnt += matAdy[i][j]; 
            
        }
        return gEnt;
    }
//Calcula el grado de salida del vértice
    public int gradoSal(int i){
        int gSal = 0;
        for (int j = 0; j < numVerts; j++) {
            gSal += matAdy[i][j];
            
        }
        return gSal;
    }

     public String [] ProductosTotal()
    {
        Vertice x = new Vertice(null);
        int contador = 0;
        String temp = " ";
        for(int i = 0; i<numVerts; i++)
        {
            x = verts[i];
            Lista list = x.getProductos();
            contador += list.getTamanho();
            temp += list.ObtenerNombre();
        }
        totalProductos = new String [contador];
        String [] aux = new String [contador];
        aux = temp.split(";");
        for(int k = 1; k<aux.length-1; k++)
        {
           totalProductos[k]=aux[k];
        }
       return totalProductos;
    }
    
    public String [] pedidoAlmacenes(Producto [] productlist, GrafoMAdy grafo)
    {
        String [] Alist;
        String Aux = " ";
        int contador = 0;
        
        for (int i = 0; i < productlist.length; i++) {
            Aux += Recorrido.busquedaProductos(grafo, "A", productlist[i]);
            Aux += ",";
        }
        
        Alist = Aux.split(",");

       return Alist;
    }
    
    public void RestarProductos(Producto [] productlist, GrafoMAdy grafo){
    int encontrado;
    Producto product;
    int nuevaCantidad=0;
    Nodo temp;
    try{
        for (int i = 0; i < verts.length; i++) {
            for (int j = 0; j < productlist.length; j++) {
                encontrado = verts[i].getProductos().compararProductoCantidad(productlist[j].getCantidad());
                if(encontrado != -1){
                    temp = verts[i].getProductos().getNodo(encontrado);
                    nuevaCantidad = Integer.parseInt(verts[i].getProductos().ObtenerCantidad()) - productlist[j].getCantidad();
                    product = new Producto(verts[i].getProductos().ObtenerNombre(), nuevaCantidad);
                    temp.setData(product);;
                }
               
            }
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No hay suficientes articulos disponibles, chequee el stock otr vez.");
    }
}
}

