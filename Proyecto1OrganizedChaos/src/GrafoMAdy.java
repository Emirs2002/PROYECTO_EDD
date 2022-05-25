
/**
 *
 * @author ERodríguez
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
        System.out.printf("La matriz contiene %d vértices \n", numVerts);
        
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                System.out.print(matAdy[i][j]);
                
            }
            
        }
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
    
}
